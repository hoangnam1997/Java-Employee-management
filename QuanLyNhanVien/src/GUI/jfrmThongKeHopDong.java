/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.busChucVu;
import BUS.busHopDong;
import BUS.busPhongBan;
import DTO.dtoChucVu;
import DTO.dtoHopDong;
import DTO.dtoPhongBan;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NT
 */
public class jfrmThongKeHopDong extends javax.swing.JInternalFrame {

    private static ArrayList<dtoPhongBan> listPhongBan;
    private static ArrayList<dtoChucVu> listChucVuSearch;
    private static ArrayList<dtoChucVu> listChucVu;

    /**
     * Creates new form jfrmHopDong
     */
    public jfrmThongKeHopDong() {
        initComponents();
        loadhopDong();
        loadPhongBan();
    }

    //load dnah sách phòng ban
    void loadPhongBan() {
        listPhongBan = busPhongBan.getInstance().getDanhSachPhongBan();
        for (dtoPhongBan item : listPhongBan) {
            jcbPhongBanSearch.addItem(String.valueOf(item.getTenPB()));
        }
        jcbPhongBanSearch.setSelectedIndex(-1);
    }

    //lay tat ca danh sach chuc vu len cb theo phòng ban
    void loadChucVu(JComboBox cb, ArrayList<dtoChucVu> arr) {
        cb.removeAllItems();
        ArrayList<dtoChucVu> list = arr;
        for (dtoChucVu item : list) {
            cb.addItem(String.valueOf(item.getTenChucVu()));
        }
    }

    void loadhopDong() {
        DefaultTableModel model = (DefaultTableModel) jtbHopDong.getModel();
        while (jtbHopDong.getRowCount() > 0) {
            model.removeRow(0);
        }
        ArrayList<dtoHopDong> list = busHopDong.getInstance().getDanhSachHopDong();

        for (dtoHopDong item : list) {
            model.addRow(new Object[]{item.getMAHD(), item.getMACV(), item.getNgayBatDau(), item.getNgayKetThuc(), String.format("%.1f", item.getTIENLUONG()), DAO.daoNhanVien.getInstance().SoLuongNhanVienTheoMaHopDong(item.getMAHD())});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnXem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbHopDong = new javax.swing.JTable();
        jcbPhongBanSearch = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcbChucVuSearch = new javax.swing.JComboBox<>();
        jbtnXemTatCa = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Hợp đồng");
        setAutoscrolls(true);

        jbtnXem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXem.setText("Xem");
        jbtnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Phòng ban:");

        jtbHopDong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hợp đồng", "Mã chức vụ", "Ngày bắt đầu", "Ngày hết hạn", "Tiền lương", "Số nhân viên thuộc HĐ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbHopDong.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtbHopDong);
        if (jtbHopDong.getColumnModel().getColumnCount() > 0) {
            jtbHopDong.getColumnModel().getColumn(0).setHeaderValue("Mã hợp đồng");
            jtbHopDong.getColumnModel().getColumn(1).setHeaderValue("Mã chức vụ");
            jtbHopDong.getColumnModel().getColumn(2).setHeaderValue("Ngày bắt đầu");
            jtbHopDong.getColumnModel().getColumn(3).setHeaderValue("Ngày hết hạn");
            jtbHopDong.getColumnModel().getColumn(4).setHeaderValue("Tiền lương");
            jtbHopDong.getColumnModel().getColumn(5).setHeaderValue("Số nhân viên thuộc HĐ");
        }

        jcbPhongBanSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbPhongBanSearch.setAutoscrolls(true);
        jcbPhongBanSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPhongBanSearchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("chức vụ");

        jcbChucVuSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jbtnXemTatCa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXemTatCa.setText("Tất cả");
        jbtnXemTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXemTatCaActionPerformed(evt);
            }
        });

        btnIn.setText("In Báo Cáo");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbPhongBanSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbChucVuSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jbtnXem)
                .addGap(42, 42, 42)
                .addComponent(jbtnXemTatCa)
                .addContainerGap(447, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbPhongBanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnXemTatCa)
                    .addComponent(jbtnXem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbChucVuSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIn)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXemActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtbHopDong.getModel();
        ArrayList<dtoHopDong> list = null;
        while (jtbHopDong.getRowCount() > 0) {
            model.removeRow(0);
        }
        if (jcbChucVuSearch.getSelectedIndex() != -1) {
            int index = jcbChucVuSearch.getSelectedIndex();
            list = busHopDong.getInstance().getDanhSachHopDong(listChucVuSearch.get(index).getMACV());
        } else {
            int index = jcbPhongBanSearch.getSelectedIndex();
            list = busHopDong.getInstance().getDanhSachHopDongTheoPhongBan(listPhongBan.get(index).getMAPB());
        }
        for (dtoHopDong item : list) {
            model.addRow(new Object[]{item.getMAHD(), item.getMACV(), item.getNgayBatDau(), item.getNgayKetThuc(), String.format("%.1f", item.getTIENLUONG())});
        }
    }//GEN-LAST:event_jbtnXemActionPerformed

    private void jcbPhongBanSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPhongBanSearchActionPerformed
        int index = jcbPhongBanSearch.getSelectedIndex();
        if (index < 0) {
            return;
        }
        listChucVuSearch = busChucVu.getInstance().getDanhSachChucVu(listPhongBan.get(index).getMAPB());
        loadChucVu(jcbChucVuSearch, listChucVuSearch);
        jcbChucVuSearch.setSelectedIndex(-1);
    }//GEN-LAST:event_jcbPhongBanSearchActionPerformed

    private void jbtnXemTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXemTatCaActionPerformed
        loadhopDong();
        jcbPhongBanSearch.setSelectedIndex(-1);
    }//GEN-LAST:event_jbtnXemTatCaActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        int index = jcbPhongBanSearch.getSelectedIndex();
        int index1 = jcbChucVuSearch.getSelectedIndex();
        if (index == -1) {
            BUS.busReport.rpHopDong();
        }
        else if(index1 == -1)
        {
            BUS.busReport.rpHopDongTheoPhongBan(listPhongBan.get(index).getMAPB());
        }
        else{
            BUS.busReport.rpHopDongTheoChucVu(listChucVuSearch.get(index1).getMACV());
        }
    }//GEN-LAST:event_btnInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnXem;
    private javax.swing.JButton jbtnXemTatCa;
    private javax.swing.JComboBox<String> jcbChucVuSearch;
    private javax.swing.JComboBox<String> jcbPhongBanSearch;
    private javax.swing.JTable jtbHopDong;
    // End of variables declaration//GEN-END:variables
}