/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import model.User;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class LogInFrame extends javax.swing.JFrame {

    User user;
    UserService userService;
    
    /**
     * Creates new form LogIn
     */
    public LogInFrame() {

        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LogInButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tài Khoản");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 250, 100, 30);

        userNameTextField.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(userNameTextField);
        userNameTextField.setBounds(190, 250, 210, 30);

        PasswordField.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordField);
        PasswordField.setBounds(190, 300, 210, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật Khẩu");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(70, 300, 100, 30);

        jButton1.setBackground(new java.awt.Color(255, 190, 108));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/logout.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 360, 140, 40);

        LogInButton.setBackground(new java.awt.Color(255, 190, 108));
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/interface.png"))); // NOI18N
        LogInButton.setText("Đăng Nhập");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogInButton);
        LogInButton.setBounds(260, 360, 140, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/rsz_loginfinal.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 490, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
        if (userNameTextField.getText().equals("")
                || String.valueOf(PasswordField.getPassword()).equals("")
                ) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin đăng nhập! ");
        } else {
            userService = new UserService();
            List<User> listUserName = userService.getAllUser();
            int a = 2;
            
            for (User uname : listUserName) {
                String b = uname.getUserName().replaceAll("\\s", "");
                String c = uname.getPassword().replaceAll("\\s", "");
                if (userNameTextField.getText().equals(b)
                    && String.valueOf(PasswordField.getPassword()).equals(c)) {
                    String d = uname.getRole().replaceAll("\\s", "");

                    if (d.equals("Employee")) {
                        new MenuEmployeeFrame(uname.getIDUser()).setVisible(true);    
                        this.dispose();
                        a = 1;
                        break;
                    }
                    if (d.equals("Admin")) {
                        new MenuAdminFrame(uname.getIDUser()).setVisible(true);
                        this.dispose();
                        a = 1;
                        break;
                    }
                }
                a = 0;

            }
            if (a == 0) {
                JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu.");
            }
            
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
