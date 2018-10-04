package sign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Bharat
 */
public class actualsignup extends javax.swing.JFrame {
    
    int curRow=0;
    
            
    public actualsignup() {
        initComponents();
         /*btngomenu.setEnabled(false);
         btnnewcreate.setEnabled(false);
         if(textnewsap.getText().equals(null) && textnewpass.getText().equals(null) ){
                btnnewcreate.setEnabled(true);
            }*/
         

        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");  
        Connection con=DriverManager.getConnection( "jdbc:derby://localhost:1527/store", "mansipalak", "mansipalak" );
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MANSIPALAK.signup1");
        while(rs.next()){
            
        }
        
        }
        catch(Exception e){
            System.out.println(e);  
    }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelnewsap = new javax.swing.JLabel();
        textnewsap = new javax.swing.JTextField();
        textnewpass = new javax.swing.JPasswordField();
        textnewwallet = new javax.swing.JTextField();
        btnnewcreate = new javax.swing.JButton();
        labelnewpass = new javax.swing.JLabel();
        btnprev = new javax.swing.JButton();
        btngomenu = new javax.swing.JButton();
        labelnewwallet = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelnewsap.setForeground(new java.awt.Color(255, 255, 255));
        labelnewsap.setText("NEW SAP-ID :");
        getContentPane().add(labelnewsap);
        labelnewsap.setBounds(220, 50, 67, 14);

        textnewsap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnewsapActionPerformed(evt);
            }
        });
        getContentPane().add(textnewsap);
        textnewsap.setBounds(310, 40, 132, 30);

        textnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnewpassActionPerformed(evt);
            }
        });
        getContentPane().add(textnewpass);
        textnewpass.setBounds(310, 90, 132, 31);
        getContentPane().add(textnewwallet);
        textnewwallet.setBounds(310, 140, 135, 30);

        btnnewcreate.setText("CREATE");
        btnnewcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewcreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewcreate);
        btnnewcreate.setBounds(190, 300, 103, 39);

        labelnewpass.setForeground(new java.awt.Color(255, 255, 255));
        labelnewpass.setText("NEW PASSWORD :");
        getContentPane().add(labelnewpass);
        labelnewpass.setBounds(200, 100, 90, 14);

        btnprev.setText("Previous Page");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });
        getContentPane().add(btnprev);
        btnprev.setBounds(18, 458, 110, 23);

        btngomenu.setText("GO TO MENU");
        btngomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngomenuActionPerformed(evt);
            }
        });
        getContentPane().add(btngomenu);
        btngomenu.setBounds(390, 300, 103, 39);

        labelnewwallet.setForeground(new java.awt.Color(255, 255, 255));
        labelnewwallet.setText("ADD TO WALLET:");
        getContentPane().add(labelnewwallet);
        labelnewwallet.setBounds(210, 140, 84, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/images.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 690, 480);

        setBounds(0, 0, 690, 485);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        new welcome().setVisible(true);
    }//GEN-LAST:event_btnprevActionPerformed

    private void btngomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngomenuActionPerformed
        new Menu().setVisible(true);
    }//GEN-LAST:event_btngomenuActionPerformed

    private void btnnewcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewcreateActionPerformed
        btngomenu.setEnabled(true);
        try{ 
        Class.forName("org.apache.derby.jdbc.ClientDriver");        
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
        Connection con=DriverManager.getConnection( "jdbc:derby://localhost:1527/store", "mansipalak", "mansipalak" );
        
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM MANSIPALAK.signup1");
    
        String newsap = textnewsap.getText();
        int newsap1=Integer.parseInt(newsap);
        String newpass= textnewpass.getText();
        String newwallet=textnewwallet.getText();
        int newwallet1=Integer.parseInt(newwallet);
       
        try{
            curRow=rs.getRow();
            
            rs.moveToInsertRow();
            
            rs.updateInt("SAP_ID", newsap1);
            rs.updateString("PASSWORD", newpass);
            rs.updateInt("WALLET", newwallet1);
            
            rs.insertRow();
            //rs.moveToCurrentRow();
            
            stmt.close();
            rs.close();
           
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM MANSIPALAK.signup1" ;
            rs= stmt.executeQuery(sql);
            
            rs.next();
            int newsap2=rs.getInt("SAP_ID");
            String id=Integer.toString(newsap2);
            String password1=rs.getString("PASSWORD");
            int wallet1=rs.getInt("WALLET");
            String wallet2=Integer.toString(wallet1);
            textnewsap.setText(id);
            textnewpass.setText(password1);
            textnewwallet.setText(wallet2);
            
        }
        catch(SQLException err){
           System.out.print(err.getMessage());
        }
        }
         catch(SQLException err){
        JOptionPane.showMessageDialog(actualsignup.this,err.getMessage());
    }  
    }//GEN-LAST:event_btnnewcreateActionPerformed

    private void textnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnewpassActionPerformed

    private void textnewsapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnewsapActionPerformed

    }//GEN-LAST:event_textnewsapActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngomenu;
    private javax.swing.JButton btnnewcreate;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelnewpass;
    private javax.swing.JLabel labelnewsap;
    private javax.swing.JLabel labelnewwallet;
    private javax.swing.JPasswordField textnewpass;
    private javax.swing.JTextField textnewsap;
    private javax.swing.JTextField textnewwallet;
    // End of variables declaration//GEN-END:variables
}
