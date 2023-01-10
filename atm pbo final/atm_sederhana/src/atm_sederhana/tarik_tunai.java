


package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class tarik_tunai extends java.awt.Frame {

    public tarik_tunai() {
        initComponents();
    }
    
    int MyAkunNomor;

    public tarik_tunai(int akunNomor) {
        initComponents();
        MyAkunNomor = akunNomor;
        rekeningLbl.setText(""+MyAkunNomor);
        getBalance();
    }
    
    Connection con = null;
    PreparedStatement pst = null, pst1 = null;
    ResultSet rs = null, rs1 = null;
    Statement st = null, st1 = null;
    int SaldoLama;
    
    private void getBalance(){
        String Query = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
            st1 = con.createStatement();
            rs1 = st1.executeQuery(Query);
            
            if(rs1.next()){
                SaldoLama = rs1.getInt(9);
                SaldoLbl.setText(""+SaldoLama);
                
            }
        }
        catch (Exception e) {
        }
    }
    
    private void kosong_field(){
        nominal_tarik.setText(null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saldo_anda = new javax.swing.JLabel();
        SaldoLbl = new javax.swing.JLabel();
        rekeningLbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        nominal_tarik = new javax.swing.JTextField();
        tarik_tunai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldo_anda.setBackground(new java.awt.Color(0, 102, 102));
        saldo_anda.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        saldo_anda.setForeground(new java.awt.Color(254, 181, 0));
        saldo_anda.setText("Saldo Anda");
        jPanel1.add(saldo_anda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 31));

        SaldoLbl.setBackground(new java.awt.Color(0, 102, 102));
        SaldoLbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        SaldoLbl.setForeground(new java.awt.Color(255, 255, 255));
        SaldoLbl.setText("0 0 0 0");
        jPanel1.add(SaldoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 30));

        rekeningLbl.setBackground(new java.awt.Color(0, 102, 102));
        rekeningLbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        rekeningLbl.setForeground(new java.awt.Color(255, 255, 255));
        rekeningLbl.setText("0 0 0 0");
        jPanel1.add(rekeningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, 30));

        back_btn.setBackground(new java.awt.Color(0, 102, 102));
        back_btn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/transfer/back - btn.png"))); // NOI18N
        back_btn.setBorderPainted(false);
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 190, 50));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/tarik_tunai/tarik tunai - home.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 190, 50));

        nominal_tarik.setBackground(new java.awt.Color(255, 255, 255));
        nominal_tarik.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        nominal_tarik.setForeground(new java.awt.Color(23, 50, 75));
        nominal_tarik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nominal_tarik.setBorder(null);
        nominal_tarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal_tarikActionPerformed(evt);
            }
        });
        jPanel1.add(nominal_tarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 40));

        tarik_tunai.setBackground(new java.awt.Color(0, 102, 102));
        tarik_tunai.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        tarik_tunai.setForeground(new java.awt.Color(255, 255, 255));
        tarik_tunai.setText("Tarik Tunai");
        jPanel1.add(tarik_tunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 181, 0));
        jLabel7.setText("No. Rekening Anda");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 31));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Poppins", 1, 9)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 181, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nominal tarik tunai berupa mata uang Rupiah (Rp.)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 181, 0));
        jLabel6.setText("Nominal Penarikan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/transfer/ATMo - Menu Page Background.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void nominal_tarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominal_tarikActionPerformed

    }//GEN-LAST:event_nominal_tarikActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        halaman_utama new_homepage = new halaman_utama(MyAkunNomor);
        new_homepage.setLocationRelativeTo(null);
        new_homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if(nominal_tarik.getText().isEmpty() || nominal_tarik.getText().equals("0")){
            JOptionPane.showMessageDialog(this,"Masukan Jumlah Pasti");
        }
    else if(SaldoLama < Integer.valueOf(nominal_tarik.getText())){
        JOptionPane.showMessageDialog(this,"Saldo Tidak Cukup");
            
    }else{
           
            try{
                
                String Query= "Update tb_akun set saldo =? where akunNomor =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                PreparedStatement pst = con.prepareStatement(Query);
                
                pst.setInt(1, SaldoLama-Integer.valueOf(nominal_tarik.getText()));
                pst.setInt(2, MyAkunNomor);
                
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Berhasil Tarik Tunai");
                    
                }else
                {
                    JOptionPane.showMessageDialog(this, "Gagal Tarik Tunai");
                }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Nominal Berupa Angka");
            }
        }    
            getBalance();
            kosong_field();
    }//GEN-LAST:event_jButton6MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tarik_tunai new_tarik_tunai = new tarik_tunai();
            new_tarik_tunai.setLocationRelativeTo(null);
            new_tarik_tunai.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SaldoLbl;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nominal_tarik;
    private javax.swing.JLabel rekeningLbl;
    private javax.swing.JLabel saldo_anda;
    private javax.swing.JLabel tarik_tunai;
    // End of variables declaration//GEN-END:variables
}
