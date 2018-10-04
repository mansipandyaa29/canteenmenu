package sign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Bharat
 */
public class signup1 extends javax.swing.JFrame {
    
    
    public signup1() {
        initComponents();  
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");  
        Connection con=DriverManager.getConnection( "jdbc:derby://localhost:1527/store", "mansipalak", "mansipalak" );
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MANSIPALAK.signup1");
        //String sap=textSap.getText();
        //String pass=textPass.getText();
        }
        catch(Exception e){
            System.out.println(e);  
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSap = new javax.swing.JLabel();
        textSap = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        textPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        btnprevsign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textwallet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelSap.setForeground(new java.awt.Color(255, 255, 255));
        labelSap.setText("SAP-ID:");
        getContentPane().add(labelSap);
        labelSap.setBounds(250, 90, 50, 14);
        getContentPane().add(textSap);
        textSap.setBounds(310, 80, 100, 30);

        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setText("PASSWORD:");
        getContentPane().add(labelPass);
        labelPass.setBounds(230, 130, 90, 14);

        btnLogin.setText("LOG IN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(390, 250, 73, 23);
        getContentPane().add(textPass);
        textPass.setBounds(310, 130, 120, 30);

        jButton1.setText("UPDATE WALLET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 250, 120, 23);

        btnprevsign.setText("Previous Page");
        btnprevsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevsignActionPerformed(evt);
            }
        });
        getContentPane().add(btnprevsign);
        btnprevsign.setBounds(20, 450, 110, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WALLET AMOUNT:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 180, 100, 14);
        getContentPane().add(textwallet);
        textwallet.setBounds(310, 180, 120, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/153805995266532257.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 500);

        setBounds(0, 0, 696, 542);
    }// </editor-fold>//GEN-END:initComponents
    
 
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
        
        try{ 
        Class.forName("org.apache.derby.jdbc.ClientDriver");        
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        try{
        
        Connection con=DriverManager.getConnection( "jdbc:derby://localhost:1527/store", "mansipalak", "mansipalak" );
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MANSIPALAK.signup1");
        
        
        String sap=textSap.getText();
        String pass=textPass.getText();
        
        while(rs.next()){
        int numsap = rs.getInt("SAP_ID");
        String s = Integer.toString(numsap);
        String p = rs.getString("PASSWORD");
        
        //int wall= rs.getInt("WALLET");
       // String w=Integer.toString(wall);
       
        
        if(s.equals(sap) && p.equals(pass))
        {
            this.setVisible(false);
            dispose();
            new Menu().setVisible(true);
        } 
        
        else 
        {
             JOptionPane.showMessageDialog(this, "Please enter Valid Username or Password");
            
        }

        }
        }
    
    catch(SQLException err){
        JOptionPane.showMessageDialog(signup1.this,err.getMessage());
    }  
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnprevsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevsignActionPerformed
       new welcome().setVisible(true); 
    }//GEN-LAST:event_btnprevsignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new signup1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnprevsign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelSap;
    private javax.swing.JPasswordField textPass;
    private javax.swing.JTextField textSap;
    private javax.swing.JTextField textwallet;
    // End of variables declaration//GEN-END:variables
}
