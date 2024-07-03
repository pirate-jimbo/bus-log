/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class ROUT_LIST extends javax.swing.JFrame {

    /**
     * Creates new form ROUT_LIST
     */
    public ROUT_LIST() {
        initComponents();
        SelectRoute();
    }
    
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    public  void SelectRoute()
    {
        try{
        Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from [BUS_LOG].[dbo].[RouteList]");
        RouteTable.setModel(DbUtils.resultSetToTableModel(Rs));
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
        RouteFrom = new javax.swing.JTextField();
        RouteTo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RouteDistance = new javax.swing.JTextField();
        RouteFare = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RouteTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        RouteId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("MANAGE ROUTE");

        RouteFrom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RouteFrom.setForeground(new java.awt.Color(255, 102, 0));
        RouteFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteFromActionPerformed(evt);
            }
        });

        RouteTo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RouteTo.setForeground(new java.awt.Color(255, 102, 0));
        RouteTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteToActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("FROM");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("TO");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("DISTANCE");

        RouteDistance.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RouteDistance.setForeground(new java.awt.Color(255, 102, 0));
        RouteDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteDistanceActionPerformed(evt);
            }
        });

        RouteFare.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RouteFare.setForeground(new java.awt.Color(255, 102, 0));
        RouteFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteFareActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("FARE/KM");

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

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 102, 0));
        ClearBtn.setText("Clear");
        ClearBtn.setActionCommand("");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        RouteTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        RouteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ROUTEID", "FROM", "TO", "DISTANCE", "FARE/KM"
            }
        ));
        RouteTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        RouteTable.setRowHeight(20);
        RouteTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        RouteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RouteTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RouteTable);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("ROUTES");

        RouteId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RouteId.setForeground(new java.awt.Color(255, 102, 0));
        RouteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouteIdActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("RoutId");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RouteId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RouteTo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RouteFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RouteDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RouteFare, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(102, 102, 102))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RouteDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RouteFare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(183, 183, 183))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RouteId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(RouteFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RouteTo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void RouteFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteFromActionPerformed

    private void RouteToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteToActionPerformed

    private void RouteDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteDistanceActionPerformed

    private void RouteFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteFareActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void RouteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RouteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RouteIdActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       if(RouteId.getText().isEmpty()|| RouteFrom.getText().isEmpty()|| RouteTo.getText().isEmpty() || RouteDistance.getText().isEmpty()|| RouteFare.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Information Missing");  
        }
        else{
        
        try
        {
            Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
            PreparedStatement add = Con.prepareStatement("insert into  RouteList values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(RouteId.getText()));
            add.setString(2, RouteFrom.getText());
            add.setString(3,RouteTo.getText());
            add.setInt(4, Integer.valueOf(RouteDistance.getText()));
            add.setFloat(5,Float.valueOf(RouteFare.getText()));
            
            int row =add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Route Added Successfully");
            Con.close();
            SelectRoute();
               
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       RouteId.setText("");
       RouteFrom.setText("");
       RouteTo.setText("");
       RouteDistance.setText("");
       RouteFare.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void RouteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RouteTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)RouteTable.getModel();
       int Myindex = RouteTable.getSelectedRow();
       RouteId.setText(model.getValueAt(Myindex,0).toString());
       RouteFrom.setText(model.getValueAt(Myindex,1).toString());
       RouteTo.setText(model.getValueAt(Myindex,2).toString());
       RouteDistance.setText(model.getValueAt(Myindex,3).toString());
       RouteFare.setText(model.getValueAt(Myindex,4).toString());
    }//GEN-LAST:event_RouteTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(RouteId.getText().isEmpty())
       {
          JOptionPane.showMessageDialog(this, "Enter Route to Delete"); 
       }
       else
       {
           try{
               Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
               String RID = RouteId.getText();
               String Query = "Delete from [BUS_LOG].[dbo].[RouteList] where RouteId =  "+RID;
               Statement Add = Con.createStatement();
               Add.executeUpdate(Query);
               JOptionPane.showMessageDialog(this, "Route Delete Successfully");
               SelectRoute();
               
               
               
           }catch (Exception e){
               e.printStackTrace();
               
           }
           
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(RouteId.getText().isEmpty()|| RouteFrom.getText().isEmpty()|| RouteTo.getText().isEmpty() || RouteDistance.getText().isEmpty()|| RouteFare.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Information Missing");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-SQO2R9E\\\\SQLEXPRESS:1433;databaseName=BUS_LOG","sa","p@ssword");
                String  Query = "Update [BUS_LOG].[dbo].[RouteList] set RouteFrom='"+RouteFrom.getText()+"'"+",RouteTo='"+RouteTo.getText()+"'"+",Distance='"+RouteDistance.getText()+"'"+",PerKMFare='"+RouteFare.getText()+"'"+"where RouteId="+RouteId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Information Updated Succesfully");
                SelectRoute();
                
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    
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
            java.util.logging.Logger.getLogger(ROUT_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ROUT_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ROUT_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ROUT_LIST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ROUT_LIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField RouteDistance;
    private javax.swing.JTextField RouteFare;
    private javax.swing.JTextField RouteFrom;
    private javax.swing.JTextField RouteId;
    private javax.swing.JTable RouteTable;
    private javax.swing.JTextField RouteTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
