/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.neu.csye6200.views;

import edu.neu.csye6200.DB;
import edu.neu.csye6200.controllers.StudentController;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author premkumarmanoharan
 */
public class StudentViewOrUpdate extends javax.swing.JPanel {

    /**
     * Creates new form StudentViewOrUpdate
     */
    public StudentViewOrUpdate()throws SQLException  {
        initComponents();
         tableShow();
         studentID.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentID = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentNameee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailParent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parentID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        parentName2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        parentAddress2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        parentPhoneNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        heading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 102, 255));

        studentID.setBackground(new java.awt.Color(204, 204, 204));
        studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Name");

        studentNameee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameeeActionPerformed(evt);
            }
        });

        jLabel3.setText("Parent Email");

        emailParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailParentActionPerformed(evt);
            }
        });

        jLabel4.setText("Parent ID");

        jLabel1.setText("Student ID");

        parentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentIDActionPerformed(evt);
            }
        });

        jLabel5.setText("Parent Name");

        parentName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentName2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Parent Address");

        parentAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentAddress2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Parent Phone Number");

        parentPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentPhoneNumActionPerformed(evt);
            }
        });

        jLabel8.setText("Date of Birth");

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Age", "Date of Birth", "Parent ID", "Parent Name", "Address", "Phone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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

        heading.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        heading.setText("Students Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(parentName2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(parentAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(parentPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(emailParent, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameee, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(Update)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2)))
                                .addGap(299, 299, 299)
                                .addComponent(heading)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heading)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentNameee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parentPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Update)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDActionPerformed
        // TODO add your handling code here:
        studentId=Integer.parseInt(studentID.getText());

    }//GEN-LAST:event_studentIDActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
               String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if (studentID.getText().equals(""))
        {
            System.out.println("Student ID is Empty");
           JOptionPane.showMessageDialog(this, "Select a student to update","Field Empty",ERROR_MESSAGE); 

        } 
        else  if (studentNameee.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Student Name Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
        
             else  if (dob.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "DOB Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
              else   if (parentID.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Parent ID Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
               else    if (parentName2.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Parent Name Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
                else     if (parentAddress2.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Parent Address Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
                 else      if (parentPhoneNum.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Parent Phone Number Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
                  else       if (emailParent.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this, "Parent Email Cannot be empty","Field Empty",ERROR_MESSAGE); 

        }
                  else if(!parentPhoneNum.getText().matches("^(1\\s?)?(\\d{3}|\\(\\d{3}\\))[\\s\\-]?\\d{3}[\\s\\-]?\\d{4}$"))
        {
            JOptionPane.showMessageDialog(this, "Enter a Valid Phone Number", "Invalid Phone Number", HEIGHT);

        }
                  else  if (!emailParent.getText().matches(regexPattern)) {
                JOptionPane.showMessageDialog(this, "Enter a Valid Email", "Invalid Email", HEIGHT);

            }
                         else{
        // TODO add your handling code here:
        studentName = studentNameee.getText();
        studentId=Integer.parseInt(studentID.getText());
        dateofBirth = dob.getText();
        parentId=Integer.parseInt(parentID.getText());
        parentName=parentName2.getText();
        parentAddress=parentAddress2.getText();
        parentPhoneNo=parentPhoneNum.getText();
        email = emailParent.getText();
        System.out.println("Student ID "+studentId);

            
                             
                         
          

        StudentController std = new StudentController();
        try {
            std.updateStudentAndParent(studentId, studentName, dateofBirth,
                parentId, parentName, parentAddress, parentPhoneNo,email);
            tableShow();
        } catch (InterruptedException ex) {
            Logger.getLogger(StudentViewOrUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentViewOrUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
                         }

    }//GEN-LAST:event_UpdateActionPerformed

    private void studentNameeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNameeeActionPerformed
        // TODO add your handling code here:
        studentName = studentNameee.getText();

    }//GEN-LAST:event_studentNameeeActionPerformed

    private void emailParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailParentActionPerformed
        // TODO add your handling code here:
        email = emailParent.getText();
    }//GEN-LAST:event_emailParentActionPerformed

    private void parentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentIDActionPerformed
        // TODO add your handling code here:
        parentId=Integer.parseInt(parentID.getText());
    }//GEN-LAST:event_parentIDActionPerformed

    private void parentName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentName2ActionPerformed
        // TODO add your handling code here:
        parentName=parentName2.getText();
    }//GEN-LAST:event_parentName2ActionPerformed

    private void parentAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentAddress2ActionPerformed
        // TODO add your handling code here:
        parentAddress=parentAddress2.getText();
    }//GEN-LAST:event_parentAddress2ActionPerformed

    private void parentPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentPhoneNumActionPerformed
        // TODO add your handling code here:
        parentPhoneNo=parentPhoneNum.getText();
    }//GEN-LAST:event_parentPhoneNumActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
        dateofBirth = dob.getText();
    }//GEN-LAST:event_dobActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();

        studentID.setText(df.getValueAt(selectedRow,0).toString());
        studentNameee.setText(df.getValueAt(selectedRow,1).toString());
        dob.setText(df.getValueAt(selectedRow,3).toString());
        emailParent.setText(df.getValueAt(selectedRow,8).toString());
        parentID.setText(df.getValueAt(selectedRow,4).toString());
        parentName2.setText(df.getValueAt(selectedRow,5).toString());
        parentAddress2.setText(df.getValueAt(selectedRow,6).toString());
        parentPhoneNum.setText(df.getValueAt(selectedRow,7).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    public void tableShow() throws SQLException{
         DB db = DB.getObj();
        DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
        df.setRowCount(0);
        ResultSet rs = db.query("SELECT s.student_id,s.name,s.age,s.dob,s.parent_id,p.p_name,p.address,p.phone,p.email"
                    + " FROM student s,parent p WHERE s.parent_id=p.parent_id order by s.student_id ;");
        ResultSetMetaData rss = rs.getMetaData();
        int c = rss.getColumnCount();
        while(rs.next()){
            Vector v = new Vector();
            for (int a=1;a<=c;a++){
                v.add(rs.getString("student_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("age"));
                v.add(rs.getString("dob"));
                v.add(rs.getString("parent_id"));
                v.add(rs.getString("p_name"));
                v.add(rs.getString("address"));
                v.add(rs.getString("phone")); 
                v.add(rs.getString("email")); 
            }
            df.addRow(v);
        }
    }
      
    int studentId;
    String studentName;
    String dateofBirth;
    double gpa;
    int parentId; 
    String parentName;
    String parentAddress;
    String parentPhoneNo;
    String email;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField emailParent;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField parentAddress2;
    private javax.swing.JTextField parentID;
    private javax.swing.JTextField parentName2;
    private javax.swing.JTextField parentPhoneNum;
    private javax.swing.JTextField studentID;
    private javax.swing.JTextField studentNameee;
    // End of variables declaration//GEN-END:variables
}