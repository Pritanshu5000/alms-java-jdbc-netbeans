
package com.cgu.advance_library_management_system;

import com.cgu.ConnectionProvider.ConnectMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Statistics extends javax.swing.JFrame {
    Connection con = ConnectMySQL.ConnectToDB();
    PreparedStatement pst;
    ResultSet rs;
    ResultSet rsl;
    
    public Statistics() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        returned_details = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        issue_details = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img 11.jpeg"))); // NOI18N
        jLabel1.setText("  STATISTICS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 58, 340, 73));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img 18.png"))); // NOI18N
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 60, 190, 50));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1353, 770));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Search Issued");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 29, -1, 40));

        jTextField1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 29, 422, 40));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Search Returned");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 382, -1, 40));

        jTextField2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 382, 422, 40));

        returned_details.setBackground(new java.awt.Color(102, 102, 255));
        returned_details.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        returned_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(returned_details);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 425, 1254, 281));

        issue_details.setBackground(new java.awt.Color(255, 153, 255));
        issue_details.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        issue_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(issue_details);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 77, 1254, 273));

        jTabbedPane2.addTab("ISSUED AND RETURNED DETAILS", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img 19.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        DefaultTableModel obj = (DefaultTableModel)returned_details.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        returned_details.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField2.getText()));
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        DefaultTableModel obj = (DefaultTableModel)issue_details.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        issue_details.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
         try{
           String sql = "SELECT issue.S_ID, student_details.S_Name, issue.Book_ID, books.Book_Name, issue.Issue_Date, issue.Due_Date FROM student_details INNER JOIN books INNER JOIN issue WHERE books.Book_ID=issue.Book_ID AND student_details.S_ID=issue.S_ID AND issue.ReturnBook='NO'";
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           issue_details.setModel(DbUtils.resultSetToTableModel(rs));
           String sql1 = "SELECT issue.S_ID, student_details.S_Name, issue.Book_ID, books.Book_Name, issue.Issue_Date, issue.Due_Date FROM student_details INNER JOIN books INNER JOIN issue WHERE books.Book_ID=issue.Book_ID AND student_details.S_ID=issue.S_ID AND issue.ReturnBook='YES'";
           pst = con.prepareStatement(sql1);
           rsl = pst.executeQuery();
           returned_details.setModel(DbUtils.resultSetToTableModel(rsl));
        }
        catch (SQLException ex){
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex); 
           JOptionPane.showMessageDialog(null, "Connection Error.");
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable issue_details;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable returned_details;
    // End of variables declaration//GEN-END:variables
}
