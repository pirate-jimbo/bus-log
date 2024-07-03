/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_log;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public  void SelectSeller()
    {
        try{
        Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from [BUS_LOG].[dbo].[Users]");
        SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
     
        
    }
    

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Sellerpass = new javax.swing.JTextField();
        SellerPass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SellerId = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        UserNO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("MANAGE Seller");

        Sellerpass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Sellerpass.setForeground(new java.awt.Color(255, 102, 0));
        Sellerpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerpassActionPerformed(evt);
            }
        });

        SellerPass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SellerPass.setForeground(new java.awt.Color(255, 102, 0));
        SellerPass.setText("Password");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("UID");

        SellerId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SellerId.setForeground(new java.awt.Color(255, 102, 0));
        SellerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerIdActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 102, 0));
        EditBtn.setText("Edit");
        EditBtn.setActionCommand("");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 102, 0));
        AddBtn.setText("Add");
        AddBtn.setActionCommand("");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 102, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.setActionCommand("");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 102, 0));
        ClearBtn.setText("Clear");
        ClearBtn.setActionCommand("");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        SellerTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "UserNo", "UserID", "Userpassword"
            }
        ));
        SellerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SellerTable.setRowHeight(20);
        SellerTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("SELLER");

        UserNO.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        UserNO.setForeground(new java.awt.Color(255, 102, 0));
        UserNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNOActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("User NO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60)
                        .addComponent(UserNO, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(SellerPass)
                                .addGap(27, 27, 27)
                                .addComponent(Sellerpass, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(240, 240, 240))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserNO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(SellerId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sellerpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellerPass))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void SellerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerIdActionPerformed

    private void SellerpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerpassActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
        if(UserNO.getText().isEmpty()|| SellerId.getText().isEmpty()|| Sellerpass.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Information Missing");  
        }
        else{
        
        try
        {
            Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
            PreparedStatement add = Con.prepareStatement("insert into Users values(?,?,?)");
            add.setInt(1, Integer.valueOf(UserNO.getText()));
            add.setString(2, SellerId.getText());
            add.setString(3,Sellerpass.getText());
            
            int row =add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller Added Successfully");
            Con.close();
            SelectSeller();
               
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        }
          
    }//GEN-LAST:event_AddBtnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)SellerTable.getModel();
       int Myindex = SellerTable.getSelectedRow();
       UserNO.setText(model.getValueAt(Myindex,0).toString());
       SellerId.setText(model.getValueAt(Myindex,1).toString());
       Sellerpass.setText(model.getValueAt(Myindex,2).toString());
    }//GEN-LAST:event_SellerTableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       UserNO.setText("");
       SellerId.setText("");
       Sellerpass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
       if(UserNO.getText().isEmpty())
       {
          JOptionPane.showMessageDialog(this, "Enter Seller to Delete"); 
       }
       else
       {
           try{
               Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
               String SID = UserNO.getText();
               String Query = "Delete from [BUS_LOG].[dbo].[Users] where UserNo=  "+SID;
               Statement Add = Con.createStatement();
               Add.executeUpdate(Query);
               JOptionPane.showMessageDialog(this, "Seller Delete Successfully");
               SelectSeller();
               
               
               
           }catch (Exception e){
               e.printStackTrace();
               
           }
           
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UserNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNOActionPerformed

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(UserNO.getText().isEmpty()|| SellerId.getText().isEmpty()|| Sellerpass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Information Missing");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
                String  Query = "Update [BUS_LOG].[dbo].[Users] set UserID='"+SellerId.getText()+"'"+",Userpassoword='"+Sellerpass.getText()+"'"+"where UserNo="+UserNO.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Information Updated Succesfully");
                SelectSeller();
                
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField SellerId;
    private javax.swing.JLabel SellerPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JTextField Sellerpass;
    private javax.swing.JTextField UserNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
