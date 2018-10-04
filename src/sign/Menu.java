package sign;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Bharat
 */
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        btntotal.setEnabled(false);
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
        Connection con=DriverManager.getConnection( "jdbc:derby://localhost:1527/store", "mansipalak", "mansipalak" );
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM MANSIPALAK.signup1");
                
         
        }
        catch(Exception e){
            System.out.println(e);  
    }
    }

    
    public Menu(String para)
    {
        
     initComponents();
     
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelcanteen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnreset = new javax.swing.JButton();
        btnproceed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        textbill = new javax.swing.JTextField();
        labelbill = new javax.swing.JLabel();
        btnwallet = new javax.swing.JButton();
        labelwallet = new javax.swing.JLabel();
        btntotal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btndosa = new javax.swing.JRadioButton();
        btnjuice = new javax.swing.JRadioButton();
        btnidli = new javax.swing.JRadioButton();
        btnpani = new javax.swing.JRadioButton();
        btnnoodles = new javax.swing.JRadioButton();
        btnvada = new javax.swing.JRadioButton();
        btnsandwich = new javax.swing.JRadioButton();
        btnsalad = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labelcanteen.setFont(new java.awt.Font("Corbel", 3, 30)); // NOI18N
        labelcanteen.setForeground(new java.awt.Color(255, 255, 255));
        labelcanteen.setText("CANTEEN MENU");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnreset.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnreset.setText("Reset Order");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnproceed.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnproceed.setText("PROCEED");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        textbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbillActionPerformed(evt);
            }
        });

        labelbill.setBackground(new java.awt.Color(0, 0, 0));
        labelbill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelbill.setForeground(new java.awt.Color(255, 255, 255));
        labelbill.setText("BILL AMOUNT:");

        btnwallet.setText("UPDATE WALLET:");
        btnwallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwalletActionPerformed(evt);
            }
        });

        labelwallet.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(labelbill))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnwallet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textbill)
                    .addComponent(labelwallet, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textbill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelwallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelbill)
                .addGap(18, 18, 18)
                .addComponent(btnwallet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btntotal.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btntotal.setText("CALCULATE TOTAL");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnreset)
                .addGap(182, 182, 182)
                .addComponent(btntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnproceed, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(btntotal)
                    .addComponent(btnproceed))
                .addGap(100, 100, 100))
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DOSA - Rs 50");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IDLI-Rs 30");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VADA PAV-Rs 15");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOODLES Rs 45");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SANDWICH Rs 55");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SALAD BOWL Rs 30");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JUICE Rs 50");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PANI PURI Rs 40");

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btndosa.setBackground(new java.awt.Color(0, 0, 0));
        btndosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/a8e1525f-26f5-434f-8e44-889fc55ff7a5.jpeg"))); // NOI18N

        btnjuice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/juicesssss (1).jpeg"))); // NOI18N

        btnidli.setBackground(new java.awt.Color(0, 0, 0));
        btnidli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/rsz_1download.jpeg"))); // NOI18N
        btnidli.setName(""); // NOI18N

        btnpani.setBackground(new java.awt.Color(0, 0, 0));
        btnpani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/rsz_paniold.jpg"))); // NOI18N

        btnnoodles.setBackground(new java.awt.Color(0, 0, 0));
        btnnoodles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/rsz_1long-life-noodles-4.jpg"))); // NOI18N

        btnvada.setBackground(new java.awt.Color(0, 0, 0));
        btnvada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/rsz_1download_2.jpg"))); // NOI18N

        btnsandwich.setBackground(new java.awt.Color(0, 0, 0));
        btnsandwich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/gdgvh (1).jpeg"))); // NOI18N

        btnsalad.setBackground(new java.awt.Color(0, 0, 0));
        btnsalad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign/rsz_1salad (1).jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndosa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel6)
                                    .addGap(75, 75, 75)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(btnsalad)
                                                    .addGap(24, 24, 24))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(85, 85, 85))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(btnidli, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnjuice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnvada, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(labelcanteen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnnoodles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(jLabel8))
                                        .addComponent(btnpani))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(36, 36, 36)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton3)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(labelcanteen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnoodles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnjuice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnidli, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnsalad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnvada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnsandwich, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, "card2");

        setBounds(0, 0, 771, 630);
    }// </editor-fold>//GEN-END:initComponents
  
/*/*
    private void textbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbillActionPerformed
   
    }//GEN-LAST:event_textbillActionPerformed
*/
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       textbill.setText("");
       if(textbill.getText().equals("")){
           textbill.setText("0");
       }
    }//GEN-LAST:event_btnresetActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        double total=0;
        if (btndosa.isSelected()){
            total= total +50.0;}
        if (btnidli.isSelected()){
            total= total +30.0;}
        if (btnjuice.isSelected()){
            total= total +50.0;}
        if (btnsandwich.isSelected()){
            total= total +55.0;}
        if (btnnoodles.isSelected()){
            total= total +45.0;}
        if (btnpani.isSelected()){
            total= total +40.0;}
        if (btnvada.isSelected()){
            total= total +15.0;}
        if (btnsalad.isSelected()){
            total= total +30.0;
        }
      textbill.setText(Double.toString(total));
         
      
    }//GEN-LAST:event_btntotalActionPerformed

    private void btnwalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwalletActionPerformed
      btntotal.setEnabled(true);
     
           
    }//GEN-LAST:event_btnwalletActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btndosa;
    private javax.swing.JRadioButton btnidli;
    private javax.swing.JRadioButton btnjuice;
    private javax.swing.JRadioButton btnnoodles;
    private javax.swing.JRadioButton btnpani;
    private javax.swing.JButton btnproceed;
    private javax.swing.JButton btnreset;
    private javax.swing.JRadioButton btnsalad;
    private javax.swing.JRadioButton btnsandwich;
    private javax.swing.JButton btntotal;
    private javax.swing.JRadioButton btnvada;
    private javax.swing.JButton btnwallet;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelbill;
    private javax.swing.JLabel labelcanteen;
    private javax.swing.JLabel labelwallet;
    private javax.swing.JTextField textbill;
    // End of variables declaration//GEN-END:variables
}
