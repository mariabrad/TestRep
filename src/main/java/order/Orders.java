/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;
import products.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import log.Home;


/**
 *
 * @author mariabrad
 */
public class Orders extends javax.swing.JFrame {
 
    /**
     * Creates new form Orders
     */
    public Orders() {
        
        initComponents();
        table_update();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnume = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Savoye LET", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/resources/add_buy_cart_ecommerce_online_shopping_store-512.png")); // NOI18N
        jLabel1.setText("My Orders");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(337, 41, 144, 42);

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable1.setFont(new java.awt.Font("Sathu", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nume", "Status", "Sum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 116, 415, 266);

        jLabel2.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel2.setText("Nume");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 182, 36, 29);

        jLabel3.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 234, 39, 29);

        txtnume.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        txtnume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnume);
        txtnume.setBounds(144, 177, 170, 32);

        txtstatus.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtstatus);
        txtstatus.setBounds(144, 229, 170, 32);

        txtid.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(144, 127, 170, 32);

        jLabel4.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel4.setText("Id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 133, 37, 26);

        jButton1.setFont(new java.awt.Font("Savoye LET", 0, 18)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(22, 5, 75, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("src/main/resources/back2.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 810, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeActionPerformed

        
    private void table_update(){
        int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
            PreparedStatement insert= con1.prepareStatement("select * from Credentials.orders");
            ResultSet rs= insert.executeQuery();
            ResultSetMetaData Rss= rs.getMetaData();
            c= Rss.getColumnCount();
            
            DefaultTableModel Df=(DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);
            
            while (rs.next()){
                Vector v2= new Vector();
                for(int a=1;a<=c;a++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getFloat("sum"));
                }
                Df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 
        

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel Df=(DefaultTableModel) jTable1.getModel();
        int selectedIndex= jTable1.getSelectedRow();
        txtid.setText(Df.getValueAt(selectedIndex,0).toString());
        txtnume.setText(Df.getValueAt(selectedIndex,1).toString());
        txtstatus.setText(Df.getValueAt(selectedIndex,2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                      Home orrd=new Home();
                      orrd.setVisible(true);
                      this.setVisible(false);
                     
            
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnume;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
