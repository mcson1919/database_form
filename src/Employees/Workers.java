/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author macaf
 */
public class Workers extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
    
    public Workers() {
        initComponents();
        DoConnect();
    }
    public void DoConnect()
    {
    try{
        String host = "jdbc:derby://localhost:1527/Employees";
        String uName = "administrator";
        String uPass = "ulanbator";
        con = DriverManager.getConnection(host,uName,uPass);
        
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "Select * from WORKERS";
        rs = stmt.executeQuery(sql);
        
        rs.next();
        int id_col = rs.getInt("ID");
        String id = Integer.toString(id_col);
        String first = rs.getString("First_Name");
        String last = rs.getString("Last_Name");
        String job = rs.getString("Job_Title");
        
        textID.setText(id);
        textFirstName.setText(first);
        textLastName.setText(last);
        textJobTitle.setText(job);
        
    
    }catch (SQLException err){
        JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    
    }
    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textID = new javax.swing.JTextField();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        lblJobTitle = new javax.swing.JLabel();
        textJobTitle = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnUpdateRecord = new javax.swing.JButton();
        btnDeleteRecord = new javax.swing.JButton();
        btnNewRecord = new javax.swing.JButton();
        btnSaveRecord = new javax.swing.JButton();
        btnCancelNewRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJobTitle.setText("Job Title:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJobTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textJobTitle))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobTitle)
                    .addComponent(textJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnUpdateRecord.setText("Update Record");
        btnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRecordActionPerformed(evt);
            }
        });

        btnDeleteRecord.setText("Delete Record");

        btnNewRecord.setText("New Record");
        btnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecordActionPerformed(evt);
            }
        });

        btnSaveRecord.setText("Save New Record");
        btnSaveRecord.setEnabled(false);

        btnCancelNewRecord.setText("Cancel New Record");
        btnCancelNewRecord.setEnabled(false);
        btnCancelNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSaveRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelNewRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnFirst)
                            .addGap(18, 18, 18)
                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnNext)
                            .addGap(18, 18, 18)
                            .addComponent(btnLast))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnUpdateRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeleteRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNewRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateRecord)
                    .addComponent(btnDeleteRecord)
                    .addComponent(btnNewRecord))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveRecord)
                    .addComponent(btnCancelNewRecord))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if ( rs.next()) {
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);

            }
            else {
            rs.previous( );
            JOptionPane.showMessageDialog(Workers.this, "End of File");
            }
            }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try {
            if ( rs.previous()) {
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);

            }
            else {
            rs.next();
            JOptionPane.showMessageDialog(Workers.this, "Start of File");
            }
            }
            catch (SQLException err) {
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
            try {
                rs.first();
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
                
            }catch (SQLException err){
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
         try {
                rs.last();
                int id_col = rs.getInt("ID");
                String id = Integer.toString(id_col);
                String first = rs.getString("First_Name");
                String last = rs.getString("Last_Name");
                String job = rs.getString("Job_Title");
                
                textID.setText(id);
                textFirstName.setText(first);
                textLastName.setText(last);
                textJobTitle.setText(job);
                
            }catch (SQLException err){
            JOptionPane.showMessageDialog(Workers.this, err.getMessage());
            }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRecordActionPerformed
            String first = textFirstName.getText();
            String last = textLastName.getText();
            String job = textJobTitle.getText();
            String ID = textID.getText();
            
            int newID = Integer.parseInt(ID);
            
            try{
            rs.updateInt("ID", newID);
            rs.updateString("First_Name",first);
            rs.updateString("Last_Name", last);
            rs.updateString("Job_Title", job);
            rs.updateRow();
            JOptionPane.showMessageDialog(Workers.this, "Updated");
            }catch (SQLException err){
                JOptionPane.showMessageDialog(Workers.this, "Something got wrong");
                }
    }//GEN-LAST:event_btnUpdateRecordActionPerformed

    private void btnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecordActionPerformed
        
    try{    
        curRow = rs.getRow();
        
        textFirstName.setText("");
        textLastName.setText("");
        textJobTitle.setText("");
        textID.setText("");
        
        btnFirst.setEnabled( false );
        btnPrevious.setEnabled( false ) ;
        btnNext.setEnabled( false );
        btnLast.setEnabled( false );
        btnUpdateRecord.setEnabled( false );
        btnDeleteRecord.setEnabled( false );
        btnNewRecord.setEnabled( false );

        btnSaveRecord.setEnabled( true );
        btnCancelNewRecord.setEnabled( true );
    }
    catch (SQLException err)
    {
    JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }
    }//GEN-LAST:event_btnNewRecordActionPerformed

    private void btnCancelNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewRecordActionPerformed
           
        try{
            rs.absolute(curRow);
            textFirstName.setText(rs.getString("First_Name"));
            textLastName.setText(rs.getString("Last_Name"));
            textJobTitle.setText(rs.getString("Job_Title"));
            textID.setText(Integer.toString(rs.getInt("ID")));
            
            btnFirst.setEnabled( true );
            btnPrevious.setEnabled( true ) ;
            btnNext.setEnabled( true );
            btnLast.setEnabled( true );
            btnUpdateRecord.setEnabled( true );
            btnDeleteRecord.setEnabled( true );
            btnNewRecord.setEnabled( true );

            btnSaveRecord.setEnabled( false );
            btnCancelNewRecord.setEnabled( false );
        }
        catch (SQLException err){
                JOptionPane.showMessageDialog(Workers.this, err.getMessage());
    }//GEN-LAST:event_btnCancelNewRecordActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNewRecord;
    private javax.swing.JButton btnDeleteRecord;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNewRecord;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSaveRecord;
    private javax.swing.JButton btnUpdateRecord;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJobTitle;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJobTitle;
    private javax.swing.JTextField textLastName;
    // End of variables declaration//GEN-END:variables
}
