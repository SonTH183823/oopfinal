
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Goods;
import model.User;
import service.GoodsService;
import service.UserService;

/**
 *
 * @author SON.TH183823
 */
public class ManageGoodsFrame extends javax.swing.JFrame {
    Goods goods;
    GoodsService goodsService;
    DefaultTableModel defaultTableModel;
    User u;
    UserService userService = new UserService();
    
    public ManageGoodsFrame(int IDuser) {
        initComponents();
        this.setLocationRelativeTo(null);
        u = userService.getUserByID(IDuser);
        goodsService = new GoodsService();
        defaultTableModel = new DefaultTableModel();  
        defaultTableModel = (DefaultTableModel) GoodsTable1.getModel();
        List<Goods> goodses  = goodsService.getAllGoods();
        goodses.forEach((goods) -> {
            int TotalMoney = goods.getAmount()*goods.getPrice();
            defaultTableModel.addRow(new Object[]{goods.getIDGoods(),goods.getNameGoods(),
                goods.getPrice()+"đ",goods.getAmount(),goods.getImportDate(),TotalMoney+"đ"});
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchGoodsTextField = new javax.swing.JTextField();
        searchGoodsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GoodsTable1 = new javax.swing.JTable();
        RefeshButton5 = new javax.swing.JButton();
        removeGoodsButton4 = new javax.swing.JButton();
        editGoodsButton3 = new javax.swing.JButton();
        addGoodsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");
        setPreferredSize(new java.awt.Dimension(720, 435));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 216, 148));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên Hàng Hóa");

        searchGoodsTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchGoodsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoodsTextFieldActionPerformed(evt);
            }
        });

        searchGoodsButton.setBackground(new java.awt.Color(255, 190, 108));
        searchGoodsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search.png"))); // NOI18N
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

        GoodsTable1.setBackground(new java.awt.Color(255, 216, 148));
        GoodsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Số", "Tên ", "Giá", "Số Lượng", "Ngày Nhập", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GoodsTable1.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane1.setViewportView(GoodsTable1);
        if (GoodsTable1.getColumnModel().getColumnCount() > 0) {
            GoodsTable1.getColumnModel().getColumn(0).setMinWidth(50);
            GoodsTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            GoodsTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            GoodsTable1.getColumnModel().getColumn(1).setMinWidth(200);
            GoodsTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            GoodsTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            GoodsTable1.getColumnModel().getColumn(2).setMinWidth(90);
            GoodsTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            GoodsTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            GoodsTable1.getColumnModel().getColumn(3).setMinWidth(70);
            GoodsTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            GoodsTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            GoodsTable1.getColumnModel().getColumn(4).setMinWidth(100);
            GoodsTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            GoodsTable1.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchGoodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchGoodsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 670, 290);

        RefeshButton5.setBackground(new java.awt.Color(255, 190, 108));
        RefeshButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RefeshButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/refresh1.png"))); // NOI18N
        RefeshButton5.setText("Refresh");
        RefeshButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefeshButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(RefeshButton5);
        RefeshButton5.setBounds(580, 350, 110, 39);

        removeGoodsButton4.setBackground(new java.awt.Color(255, 190, 108));
        removeGoodsButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        removeGoodsButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/xoa.png"))); // NOI18N
        removeGoodsButton4.setText("Xóa");
        removeGoodsButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGoodsButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(removeGoodsButton4);
        removeGoodsButton4.setBounds(390, 350, 110, 39);

        editGoodsButton3.setBackground(new java.awt.Color(255, 190, 108));
        editGoodsButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editGoodsButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/edit.png"))); // NOI18N
        editGoodsButton3.setText("Sửa");
        editGoodsButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGoodsButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(editGoodsButton3);
        editGoodsButton3.setBounds(200, 350, 110, 39);

        addGoodsButton.setBackground(new java.awt.Color(255, 190, 108));
        addGoodsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addGoodsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/add.png"))); // NOI18N
        addGoodsButton.setText("Thêm");
        addGoodsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGoodsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addGoodsButton);
        addGoodsButton.setBounds(20, 350, 110, 39);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Hàng Hóa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(216, 0, 228, 29);

        jButton1.setBackground(new java.awt.Color(255, 190, 108));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 100, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/anhgo.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 720, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = u.getRole().replaceAll("\\s","");
        if (a.equals("Admin")) {
            new MenuAdminFrame(u.getIDUser()).setVisible(true);
        }
        if (a.equals("Employee")) {
            new MenuEmployeeFrame(u.getIDUser()).setVisible(true);
        }
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchGoodsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsTextFieldActionPerformed

    private void searchGoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoodsButtonActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        if (searchGoodsTextField.getText().equals("")) {
            
        List<Goods> goodses  = goodsService.getAllGoods();
        goodses.forEach((goods) -> {
            int TotalMoney = goods.getAmount()*goods.getPrice();
            defaultTableModel.addRow(new Object[]{goods.getIDGoods(),goods.getNameGoods(),
                goods.getPrice(),goods.getAmount(),goods.getImportDate(),TotalMoney+"đ"});
        });
        }else{
           String a= searchGoodsTextField.getText();
                   //.replaceAll("\\s","");
            List<Goods> goodses  = goodsService.getGoodsByName(a);
            goodses.forEach((goods) -> {
            int TotalMoney = goods.getAmount()*goods.getPrice();
            defaultTableModel.addRow(new Object[]{goods.getIDGoods(),goods.getNameGoods(),
                goods.getPrice()+"đ",goods.getAmount(),goods.getImportDate(),TotalMoney+"đ"});
        });
        }
    }//GEN-LAST:event_searchGoodsButtonActionPerformed

    private void RefeshButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefeshButton5ActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        List<Goods> goodses  = goodsService.getAllGoods();
        goodses.forEach((goods) -> {
            int TotalMoney = goods.getAmount()*goods.getPrice();
            defaultTableModel.addRow(new Object[]{goods.getIDGoods(),goods.getNameGoods(),
                goods.getPrice()+"đ",goods.getAmount(),goods.getImportDate(),TotalMoney+"đ"});
        });
    }//GEN-LAST:event_RefeshButton5ActionPerformed

    private void addGoodsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGoodsButtonActionPerformed
        // TODO add your handling code here:
        new addGoodsFrame(u.getIDUser()).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addGoodsButtonActionPerformed

    private void removeGoodsButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGoodsButton4ActionPerformed
        // TODO add your handling code here:
        int row = GoodsTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageGoodsFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            int confirm = JOptionPane.showConfirmDialog(ManageGoodsFrame.this,
                    "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {
                String IDGoods = String.valueOf(GoodsTable1.getValueAt(row, 0));
                goodsService.removeGoods(IDGoods);
                defaultTableModel.setRowCount(0);
                List<Goods> listGoods = goodsService.getAllGoods();
                listGoods.forEach((goods) -> {
                    int TotalMoney = goods.getAmount()*goods.getPrice();
            defaultTableModel.addRow(new Object[]{goods.getIDGoods(),goods.getNameGoods(),
                goods.getPrice(),goods.getAmount(),goods.getImportDate(),TotalMoney});
        });
                JOptionPane.showMessageDialog(ManageGoodsFrame.this, "Xóa thành công");
            }
        }
    }//GEN-LAST:event_removeGoodsButton4ActionPerformed

    private void searchGoodsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchGoodsButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchGoodsButtonKeyPressed

    private void editGoodsButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGoodsButton3ActionPerformed
        // TODO add your handling code here:
        int row = GoodsTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(ManageGoodsFrame.this, "Bạn chưa chọn hàng nào!");
        } else {
            
            int IDgoods = (Integer) GoodsTable1.getValueAt(row, 0);
                new editGoodsFrame(IDgoods,u.getIDUser()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_editGoodsButton3ActionPerformed

//        public static void main(String args[]) {
//     
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageGoodsFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GoodsTable1;
    private javax.swing.JButton RefeshButton5;
    private javax.swing.JButton addGoodsButton;
    private javax.swing.JButton editGoodsButton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeGoodsButton4;
    private javax.swing.JButton searchGoodsButton;
    private javax.swing.JTextField searchGoodsTextField;
    // End of variables declaration//GEN-END:variables
}
