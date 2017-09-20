/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.busDangKyThemGio;
import DTO.dtoDangKyThemGio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NT
 */
public class jfrmDangKyLamThem extends javax.swing.JInternalFrame {

    /**
     * Creates new form jfrmDangKyLamThem
     */
    public jfrmDangKyLamThem() {
        initComponents();
        jdtpkNgay.setDate(Calendar.getInstance().getTime());
        jdtpkTuNgay.setDate(Calendar.getInstance().getTime());
        loadGioLamThem();
        loadBinding();
    }
//load bingding khi click jtable

    void loadBinding() {
        jtbDangKyLamThem.getSelectionModel().addListSelectionListener((e) -> {
            if (jtbDangKyLamThem.getSelectedRow() >= 0) {
                Object MADKTHEMGIO = jtbDangKyLamThem.getValueAt(jtbDangKyLamThem.getSelectedRow(), 0);
                Object TENDK = jtbDangKyLamThem.getValueAt(jtbDangKyLamThem.getSelectedRow(), 1);
                Object SOGIDK = jtbDangKyLamThem.getValueAt(jtbDangKyLamThem.getSelectedRow(), 2);
                Object HESOLUONG = jtbDangKyLamThem.getValueAt(jtbDangKyLamThem.getSelectedRow(), 3);
                Object NGAY = jtbDangKyLamThem.getValueAt(jtbDangKyLamThem.getSelectedRow(), 4);

                jtxtMa.setText(MADKTHEMGIO.toString());
                jtxtTen.setText(TENDK.toString());
                jspGioDK.setValue(SOGIDK);
                jspHeSO.setValue(HESOLUONG);
                jdtpkNgay.setDate((Date)NGAY);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDangKyLamThem = new javax.swing.JTable();
        jtxtMa = new javax.swing.JTextField();
        jtxtTen = new javax.swing.JTextField();
        jspGioDK = new javax.swing.JSpinner();
        jspHeSO = new javax.swing.JSpinner();
        jdtpkNgay = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnXoa = new javax.swing.JButton();
        jbtnSua = new javax.swing.JButton();
        jbtnThem = new javax.swing.JButton();
        jbtnXem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jdtpkTuNgay = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Danh sách đăng ký làm thêm");
        setAutoscrolls(true);

        jtbDangKyLamThem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đăng ký", "Tên đăng ký", "Số giờ đăng ký", "Hệ số lương", "Ngày áp dụng"
            }
        ));
        jtbDangKyLamThem.setFillsViewportHeight(true);
        jtbDangKyLamThem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtbDangKyLamThem);
        if (jtbDangKyLamThem.getColumnModel().getColumnCount() > 0) {
            jtbDangKyLamThem.getColumnModel().getColumn(2).setMinWidth(0);
            jtbDangKyLamThem.getColumnModel().getColumn(2).setPreferredWidth(0);
            jtbDangKyLamThem.getColumnModel().getColumn(2).setMaxWidth(0);
            jtbDangKyLamThem.getColumnModel().getColumn(3).setMinWidth(0);
            jtbDangKyLamThem.getColumnModel().getColumn(3).setPreferredWidth(0);
            jtbDangKyLamThem.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jtxtMa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMaKeyTyped(evt);
            }
        });

        jtxtTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jspGioDK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jspHeSO.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jdtpkNgay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jdtpkNgay.setFormats("dd/MM/yyyy");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Số giờ đăng ký:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Hệ số lương/1giờ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày áp dụng:");

        jbtnXoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        jbtnSua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnSua.setText("Cập nhật");
        jbtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaActionPerformed(evt);
            }
        });

        jbtnThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnThem.setText("Thêm mới");
        jbtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemActionPerformed(evt);
            }
        });

        jbtnXem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jbtnXem.setText("Xem");
        jbtnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Từ ngày:");

        jdtpkTuNgay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jdtpkTuNgay.setFormats("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdtpkNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jspGioDK)
                            .addComponent(jspHeSO)
                            .addComponent(jtxtMa)
                            .addComponent(jtxtTen)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jdtpkTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnXem)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnXem)
                    .addComponent(jLabel6)
                    .addComponent(jdtpkTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jspGioDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jspHeSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jdtpkNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Load danh sách vào jtable
    private void jbtnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXemActionPerformed
        loadGioLamThem();
    }//GEN-LAST:event_jbtnXemActionPerformed
//thêm mới đăng ký
    private void jbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemActionPerformed
        if (jtxtMa.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã đăng ký!","Thông báo",-1,2);
            return;
        }
        int MADk = Integer.parseInt(jtxtMa.getText());
        String ten = jtxtTen.getText();
        int SoGio = (int)jspGioDK.getValue();
        int Heso = (int)jspHeSO.getValue();
        Date ngay= jdtpkNgay.getDate();
        if(!busDangKyThemGio.getInstance().insertDangKyThemGio(MADk, ten,SoGio,Heso,ngay))
        {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!","Thông báo",-1,2);
            return;
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "Thêm thành công!","Thông báo",-1,1);
        }    
        
        jbtnXem.doClick();
    }//GEN-LAST:event_jbtnThemActionPerformed

    private void jtxtMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMaKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
        if (jtxtMa.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtMaKeyTyped
//cập nhật thong tin
    private void jbtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaActionPerformed
        if (jtxtMa.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã đăng ký!","Thông báo",-1,2);
            return;
        }
        int MADk = Integer.parseInt(jtxtMa.getText());
        String ten = jtxtTen.getText();
        int SoGio = (int)jspGioDK.getValue();
        int Heso = (int)jspHeSO.getValue();
        Date ngay= jdtpkNgay.getDate();
        if(!busDangKyThemGio.getInstance().updateDangKyThemGio(MADk, ten,SoGio,Heso,ngay))
        {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!","Thông báo",-1,2);
            return;
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "Cập nhật thành công!","Thông báo",-1,1);
        }    
        
        jbtnXem.doClick();
    }//GEN-LAST:event_jbtnSuaActionPerformed
//Thực hiên xóa
    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        if (jtxtMa.getText().length() <= 0) {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã đăng ký!","Thông báo",-1,2);
            return;
        }
        int MADk = Integer.parseInt(jtxtMa.getText());
        if(!busDangKyThemGio.getInstance().deleteDangKyThemGio(MADk))
        {
            JOptionPane.showConfirmDialog(null, "Vui lòng thực hiện lại!","Thông báo",-1,2);
            return;
        }
        else
        {
            JOptionPane.showConfirmDialog(null, "Xóa thành công!","Thông báo",-1,1);
        }    
        
        jbtnXem.doClick();
    }//GEN-LAST:event_jbtnXoaActionPerformed
//load ds vào able

    void loadGioLamThem() {
        Date tuNgay = jdtpkTuNgay.getDate();
        ArrayList<dtoDangKyThemGio> list = busDangKyThemGio.getInstance().getDanhSachDangKy(tuNgay);
        DefaultTableModel model = (DefaultTableModel) jtbDangKyLamThem.getModel();
        while (jtbDangKyLamThem.getRowCount() > 0) {
            model.removeRow(0);

        }
        for (dtoDangKyThemGio item : list) {
            model.addRow(new Object[]{item.getMADKTHEMGIO(), item.getTENDK(), item.getSOGIODK(), item.getHESOLUONG_1GIO(), item.getNGAY()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSua;
    private javax.swing.JButton jbtnThem;
    private javax.swing.JButton jbtnXem;
    private javax.swing.JButton jbtnXoa;
    private org.jdesktop.swingx.JXDatePicker jdtpkNgay;
    private org.jdesktop.swingx.JXDatePicker jdtpkTuNgay;
    private javax.swing.JSpinner jspGioDK;
    private javax.swing.JSpinner jspHeSO;
    private javax.swing.JTable jtbDangKyLamThem;
    private javax.swing.JTextField jtxtMa;
    private javax.swing.JTextField jtxtTen;
    // End of variables declaration//GEN-END:variables

}
