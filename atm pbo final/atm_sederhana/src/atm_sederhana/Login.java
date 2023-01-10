

package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Login extends java.awt.Frame {

    
    public Login() {
        initComponents();
    }


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JButton();
        pin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rekening = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationRelativeTo(this);
        setMinimumSize(new java.awt.Dimension(350, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(0, 51, 51));
        Login.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/login_img/login - btn.png"))); // NOI18N
        Login.setText("Login");
        Login.setAlignmentY(0.0F);
        Login.setBorder(null);
        Login.setBorderPainted(false);
        Login.setContentAreaFilled(false);
        Login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        pin.setBackground(new java.awt.Color(255, 255, 255));
        pin.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        pin.setForeground(new java.awt.Color(23, 50, 75));
        pin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pin.setBorder(null);
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 30));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 181, 0));
        jLabel2.setText("Rekening");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, -1));

        jLabel3.setBackground(new java.awt.Color(0, 51, 51));
        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 181, 0));
        jLabel3.setText("Pin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 90, 20));

        rekening.setBackground(new java.awt.Color(255, 255, 255));
        rekening.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        rekening.setForeground(new java.awt.Color(23, 50, 75));
        rekening.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rekening.setBorder(null);
        rekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekeningActionPerformed(evt);
            }
        });
        jPanel1.add(rekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 230, 32));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/login_img/background - ATMo - Login Page.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 590));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void rekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekeningActionPerformed

    }//GEN-LAST:event_rekeningActionPerformed
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked

        
        if (rekening.getText().isEmpty() || pin.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan Username dan pin !!!");
        }    
        else{
        String Query = "select * from tb_akun where akunNomor ='"+rekening.getText()+"' and PIN="+pin.getText()+"";
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        st = con.createStatement();
        rs = st.executeQuery(Query);
        
            if(rs.next()){
                halaman_utama homepage = new halaman_utama(rs.getInt(1));
                homepage.setLocationRelativeTo(null);
                homepage.setVisible(true);;
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Nama akun atau pin salah !!!");
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Pin berupa angka !!!");
            }
        }
    }//GEN-LAST:event_LoginMouseClicked

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed

    }//GEN-LAST:event_pinActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

    }//GEN-LAST:event_LoginActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseEntered


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login newlogin = new Login();
                newlogin.setLocationRelativeTo(null);
                newlogin.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pin;
    private javax.swing.JTextField rekening;
    // End of variables declaration//GEN-END:variables
}
