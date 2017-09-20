/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.busChucVu;
import BUS.busPhongBan;
import DTO.dtoChucVu;
import DTO.dtoPhongBan;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NT
 */
public class jfrmChucVu extends javax.swing.JInternalFrame {

    private static ArrayList<dtoPhongBan> listPhongBan;

    /**
     * Creates new form jfrmChucVu
     */
    public jfrmChucVu() {
        initComponents();
        loadBindng();
        loadPhongBanToCb();
        XemTatCa();
    }

    //load Binding
//thực hiện load binding khi người dùng click row in jtable
    void loadBindng() {
        jtbChucVu.getSelectionModel().addListSelectionListener((e) -> {
            if (jtbChucVu.getSelectedRow() >= 0) {
                Object MACV = jtbChucVu.getValueAt(jtbChucVu.getSelectedRow(), 0);
                Object TENCV = jtbChucVu.getValueAt(jtbChucVu.getSelectedRow(), 1);
                Object MAPB = jtbChucVu.getValueAt(jtbChucVu.getSelectedRow(), 2);
                jtxtMaCV.setText(MACV.toString());
                jtxtTenCV.setText(TENCV.toString());
                int count = jcbPhongban.getItemCount();
                for (int i = 0; i < count; i++) {
                    if (listPhongBan.get(i).getMAPB() == ((int) MAPB)) {
                        jcbPhongban.setSelectedIndex(i);
                        break;
                    }
                }
            }
        });
    }
//load danh sach phong ban vao cb

    void loadPhongBanToCb() {
        jcbPhongban.removeAllItems();
        listPhongBan = busPhongBan.getInstance().getDanhSachPhongBan();
        for (dtoPhongBan item : listPhongBan) {
            jcbPhongban.addItem(String.valueOf(item.getTenPB()));
            jcbphongban.addItem(String.valueOf(item.getTenPB()));
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

        jbtnXoa = new javax.swing.JButton();
        jbtnCapNhat = new javax.swing.JButton();
        jbtnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbChucVu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtXem = new javax.swing.JTextField();
        jbtnXem = new javax.swing.JButton();
        jtxtTenCV = new javax.swing.JTextField();
        jtxtMaCV = new javax.swing.JTextField();
        jcbPhongban = new javax.swing.JComboBox<>();
        jtxtMAPB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbphongban = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbtnXemTatCa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Chức vụ");
        setAutoscrolls(true);

        jbtnXoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        jbtnCapNhat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnCapNhat.setText("Cập nhật");
        jbtnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCapNhatActionPerformed(evt);
            }
        });

        jbtnThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnThem.setText("Thêm");
        jbtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemActionPerformed(evt);
            }
        });

        jtbChucVu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtbChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chức vụ", "Tên chức vụ", "Phòng ban"
            }
        ));
        jtbChucVu.setFillsViewportHeight(true);
        jtbChucVu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtbChucVu);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên chức vụ:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tên chức vụ:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã chức vụ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Phòng ban:");

        jtxtXem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtXem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jbtnXem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXem.setText("Xem");
        jbtnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXemActionPerformed(evt);
            }
        });

        jtxtTenCV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtTenCV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtxtMaCV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtMaCV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxtMaCV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMaCVKeyTyped(evt);
            }
        });

        jcbPhongban.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbPhongban.setAutoscrolls(true);
        jcbPhongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPhongbanActionPerformed(evt);
            }
        });

        jtxtMAPB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtMAPB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxtMAPB.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Mã:");

        jcbphongban.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcbphongban.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Phòng ban:");

        jbtnXemTatCa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXemTatCa.setText("Tất cả");
        jbtnXemTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXemTatCaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtTenCV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtMaCV, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jcbPhongban, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtMAPB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtXem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jcbphongban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnXem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnXemTatCa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtXem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnXem)
                        .addComponent(jbtnXemTatCa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtMAPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPhongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        if (jtxtMaCV.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã chức vụ!", "Thông báo", -1, 2);
            return;
        }
        int MACV = Integer.parseInt(jtxtMaCV.getText());
        if (!busChucVu.getInstance().deleteChucVu(MACV)) {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!", "Thông báo", -1, 2);
            return;
        } else {
            JOptionPane.showConfirmDialog(null, "Xóa thành công!", "Thông báo", -1, 1);
        }
        XemTatCa();
    }//GEN-LAST:event_jbtnXoaActionPerformed

    private void jbtnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCapNhatActionPerformed
        if (jtxtMaCV.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã chức vụ!", "Thông báo", -1, 2);
            return;
        }
        int MACV = Integer.parseInt(jtxtMaCV.getText());
        String tenCV = jtxtTenCV.getText();
        int MAPB = Integer.parseInt(jtxtMAPB.getText());
        if (!busChucVu.getInstance().updateChucVu(MACV, tenCV, MAPB)) {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!", "Thông báo", -1, 2);
            return;
        } else {
            JOptionPane.showConfirmDialog(null, "Cập nhật thành công!", "Thông báo", -1, 1);
        }

        XemTatCa();
    }//GEN-LAST:event_jbtnCapNhatActionPerformed
//thực hiện thêm chức vụ
    private void jbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemActionPerformed
        if (jtxtMaCV.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã chức vụ!", "Thông báo", -1, 2);
            return;
        }
        int MACV = Integer.parseInt(jtxtMaCV.getText());
        String tenCV = jtxtTenCV.getText();
        int MAPB = Integer.parseInt(jtxtMAPB.getText());
        if (!busChucVu.getInstance().insertChucVu(MACV, tenCV, MAPB)) {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!", "Thông báo", -1, 2);
            return;
        } else {
            JOptionPane.showConfirmDialog(null, "Thêm thành công!", "Thông báo", -1, 1);
        }

        XemTatCa();
    }//GEN-LAST:event_jbtnThemActionPerformed

    private void jbtnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXemActionPerformed

        ArrayList<dtoChucVu> listView;
        DefaultTableModel model = (DefaultTableModel) jtbChucVu.getModel();
        while (jtbChucVu.getRowCount() > 0) {
            model.removeRow(0);
        }
        if(jcbphongban.getSelectedIndex()<0)return;
        int index=jcbphongban.getSelectedIndex();
        listView = busChucVu.getInstance().getDanhSachChucVu(jtxtXem.getText(),listPhongBan.get(index).getMAPB());
        for (dtoChucVu iem : listView) {
            model.addRow(new Object[]{iem.getMACV(), iem.getTenChucVu(), iem.getMAPB()});
        }
    }//GEN-LAST:event_jbtnXemActionPerformed
    void XemTatCa() {
        ArrayList<dtoChucVu> listView = new ArrayList<dtoChucVu>();
        listView.clear();
        DefaultTableModel model = (DefaultTableModel) jtbChucVu.getModel();
        while (jtbChucVu.getRowCount() > 0) {
            model.removeRow(0);
        }
        listView = busChucVu.getInstance().getDanhSachChucVu();
        for (dtoChucVu iem : listView) {
            model.addRow(new Object[]{iem.getMACV(), iem.getTenChucVu(), iem.getMAPB()});
        }
    }
    private void jtxtMaCVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMaCVKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
        if (jtxtMaCV.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtMaCVKeyTyped

    private void jbtnXemTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXemTatCaActionPerformed
        XemTatCa();
    }//GEN-LAST:event_jbtnXemTatCaActionPerformed
//ánh xạ vào phòng ban
    private void jcbPhongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPhongbanActionPerformed
        int index = jcbPhongban.getSelectedIndex();
        if (index < 0) {
            return;
        }
        jtxtMAPB.setText(String.valueOf(listPhongBan.get(index).getMAPB()));
    }//GEN-LAST:event_jcbPhongbanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCapNhat;
    private javax.swing.JButton jbtnThem;
    private javax.swing.JButton jbtnXem;
    private javax.swing.JButton jbtnXemTatCa;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JComboBox<String> jcbPhongban;
    private javax.swing.JComboBox<String> jcbphongban;
    private javax.swing.JTable jtbChucVu;
    private javax.swing.JTextField jtxtMAPB;
    private javax.swing.JTextField jtxtMaCV;
    private javax.swing.JTextField jtxtTenCV;
    private javax.swing.JTextField jtxtXem;
    // End of variables declaration//GEN-END:variables

}
