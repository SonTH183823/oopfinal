/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import model.User;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class ManageGuestFrame extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    User u;
    UserService userService = new UserService();
    
    public ManageGuestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         defaultTableModel = new DefaultTableModel();  
        defaultTableModel = (DefaultTableModel) GuestTable1.getModel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchGoodsTextField = new javax.swing.JTextField();
        searchGoodsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GuestTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Hàng");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Tên Khách Hàng");

        searchGoodsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoodsTextFieldActionPerformed(evt);
            }
        });

        searchGoodsButton.setText("Tìm Kiếm");
        searchGoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoodsButtonActionPerformed(evt);
            }
        });
        searchGoodsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchGoodsButtonKeyPressed(evt);
            }
        });

        GuestTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số", "Tên Khách Hàng", "SĐT", "Điểm tích lũy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GuestTable1);
        if (GuestTable1.getColumnModel().getColumnCount() > 0) {
            GuestTable1.getColumnModel().getColumn(1).setMinWidth(200);
            GuestTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            GuestTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            GuestTable1.getColumnModel().getColumn(2).setMinWidth(90);
            GuestTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            GuestTable1.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchGoodsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGoodsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchGoodsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsTextFieldActionPerformed

    private void searchGoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsButtonActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        if (searchGoodsTextField.getText().equals("")) {

            
        
        }else{
            
        }
    }//GEN-LAST:event_searchGoodsButtonActionPerformed

    private void searchGoodsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchGoodsButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsButtonKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = u.getRole().replaceAll("\\s","");
        if (a.equals("Admin")) {
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
        }
        if (a.equals("Employee")) {
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageGuestFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GuestTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchGoodsButton;
    private javax.swing.JTextField searchGoodsTextField;
    // End of variables declaration//GEN-END:variables
}
