
package pkgfinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
import java.sql.*;
import pkgfinal.function;

/**
 *
 * @author Talib
 */
public class menu extends javax.swing.JFrame {

      private void retrieve()
    {
        DefaultTableModel dm = new DBclass().getData();
        table.setModel(dm);

    }
    
    public menu() throws Exception {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        seat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        shift = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        ret = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 5));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Nueva Std", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("STUDENTS RECORD BOOK");

        jLabel1.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("NAME : ");

        last.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        last.setForeground(new java.awt.Color(255, 102, 0));
        last.setText("LAST NAME :");

        name.setBackground(new java.awt.Color(102, 0, 102));
        name.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 102, 0));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jTextField1.setBackground(new java.awt.Color(102, 0, 102));
        jTextField1.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 102, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel3.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("SEAT NO :");

        seat.setBackground(new java.awt.Color(102, 0, 102));
        seat.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        seat.setForeground(new java.awt.Color(255, 102, 0));
        seat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel5.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("PHONE :");

        phone.setBackground(new java.awt.Color(102, 0, 102));
        phone.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 102, 0));
        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel6.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("SHIFT :");

        shift.setBackground(new java.awt.Color(102, 0, 102));
        shift.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        shift.setForeground(new java.awt.Color(255, 102, 0));
        shift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        jLabel4.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("ID :");

        id.setBackground(new java.awt.Color(102, 0, 102));
        id.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 102, 0));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        add.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(51, 0, 51));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        ret.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        ret.setForeground(new java.awt.Color(51, 0, 51));
        ret.setText("RETRIEVE");
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        update.setForeground(new java.awt.Color(51, 0, 51));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(51, 0, 51));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(51, 0, 51));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Nueva Std", 0, 24)); // NOI18N
        search.setForeground(new java.awt.Color(51, 0, 51));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(last))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(jTextField1)
                            .addComponent(seat, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phone)
                            .addComponent(shift)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(add)
                    .addComponent(delete)
                    .addComponent(clear)
                    .addComponent(ret)
                    .addComponent(search))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(last)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(add)))
                        .addGap(29, 29, 29)
                        .addComponent(update)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(37, 37, 37)
                        .addComponent(clear)
                        .addGap(37, 37, 37)
                        .addComponent(ret)
                        .addGap(39, 39, 39)
                        .addComponent(search))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (new DBclass().add(name.getText(), last.getText(), seat.getText(), shift.getText(), phone.getText())) {
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY INSERTED");
          
            name.setText("");
            last.setText("");
            seat.setText("");
            shift.setText("");
            phone.setText("");
            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, " NotSaved");
        }

    }//GEN-LAST:event_addActionPerformed

    private void retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retActionPerformed
     retrieve();
    }//GEN-LAST:event_retActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int index = table.getSelectedRow();
        String id = table.getValueAt(index, 0).toString();

        if (new DBclass().update(id, name.getText(), last.getText(), seat.getText(), shift.getText(), phone.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            
            this.name.setText("");
            this.last.setText("");
            this.seat.setText("");
            this.shift.setText("");
            this.phone.setText("");
            
            retrieve();
        } else {
            JOptionPane.showMessageDialog(null, "Not Updated!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String[] options = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Sure To Delete?", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answer == 0) {
            int index = table.getSelectedRow();
            String id = table.getValueAt(index, 0).toString();

            if (new DBclass().delete(id)) {
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
              
                this.name.setText("");
                this.last.setText("");
                this.seat.setText("");
                this.shift.setText("");
                this.phone.setText("");
                
                retrieve();
            } else {
                JOptionPane.showMessageDialog(null, "Not Deleted!");
            }
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
table.setModel(new DefaultTableModel());
    }//GEN-LAST:event_clearActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        String name = table.getValueAt(table.getSelectedRow(), 1).toString();
        String last = table.getValueAt(table.getSelectedRow(), 2).toString();
        String seat = table.getValueAt(table.getSelectedRow(), 3).toString();
        String shift = table.getValueAt(table.getSelectedRow(), 4).toString();
        String phone = table.getValueAt(table.getSelectedRow(), 5).toString();

        this.name.setText(name);
        this.last.setText(last);
        this.seat.setText(seat);
        this.shift.setText(shift);
        this.phone.setText(phone);

    }//GEN-LAST:event_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        function f =new function();
        ResultSet rs = null;
        String name = "NAME";
        String last = "LAST NAME";
        String seat = "SEAT";
        String shift = "SHIFT";
        String phone = "PHONE";
        
        rs = f.find(id.getText());
        
        try
        {
            if(rs.next())
            {
                this.name.setText(rs.getString("NAME"));
                this.last.setText(rs.getString("LAST NAME"));
                this.seat.setText(rs.getString("SEAT"));
                this.shift.setText(rs.getString("SHIFT"));
                this.phone.setText(rs.getString("PHONE"));
            }
            else
            {
              JOptionPane.showMessageDialog(null, "NO DATA FOUND");
              
            }
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_searchActionPerformed
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new menu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel last;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton ret;
    private javax.swing.JButton search;
    private javax.swing.JTextField seat;
    private javax.swing.JTextField shift;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

