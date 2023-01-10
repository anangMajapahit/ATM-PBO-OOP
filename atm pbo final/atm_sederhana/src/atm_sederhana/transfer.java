
package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class transfer extends java.awt.Frame {

    public transfer() {
        initComponents();
    }

    Connection con = null;
    PreparedStatement pst = null,pst1=null;
    ResultSet rs = null,rs1=null,rs2=null;
    Statement st = null,st1=null,st2=null;
    PreparedStatement statement = null;
    
    int saldoLama;
    int saldoTujuan;
    int rekeningTujuan;
    
    int MyAkunNomor;
    public transfer(int akunNomor) {
        initComponents();
        MyAkunNomor = akunNomor;
        getBalance();
    }
    
    private void getBalance(){
        String Query = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        st1 = con.createStatement();
        rs1 = st1.executeQuery(Query);
        
            if(rs1.next()){
            saldoLama = rs1.getInt(9);
            SaldoLbl.setText(""+saldoLama);
            akun_nomorLbl.setText(""+MyAkunNomor);
            }
            else{
                
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    public void getRekening(){
        String Query = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        st1 = con.createStatement();
        rs1 = st1.executeQuery(Query);
        
            if(rs1.next()){
            rekeningTujuan = rs1.getInt(1);
            }
            else{
                
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    private void KosongkanField(){
        nominal_transfer.setText(null);
        rekening_tujuan.setText(null);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saldo_anda = new javax.swing.JLabel();
        SaldoLbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        transfer_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nominal_transfer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        akun_nomorLbl = new javax.swing.JLabel();
        rekening_tujuan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldo_anda.setBackground(new java.awt.Color(0, 102, 102));
        saldo_anda.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        saldo_anda.setForeground(new java.awt.Color(254, 181, 0));
        saldo_anda.setText("Saldo Anda");
        jPanel1.add(saldo_anda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 31));

        SaldoLbl.setBackground(new java.awt.Color(0, 102, 102));
        SaldoLbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        SaldoLbl.setForeground(new java.awt.Color(255, 255, 255));
        SaldoLbl.setText("0 0 0 0");
        jPanel1.add(SaldoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 20));

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
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 190, 50));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transfer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 181, 0));
        jLabel2.setText("Rekening Tujuan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 20));

        transfer_btn.setBackground(new java.awt.Color(0, 102, 102));
        transfer_btn.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        transfer_btn.setForeground(new java.awt.Color(255, 255, 255));
        transfer_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/transfer/transfer - home.png"))); // NOI18N
        transfer_btn.setBorder(null);
        transfer_btn.setBorderPainted(false);
        transfer_btn.setContentAreaFilled(false);
        transfer_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transfer_btnMouseClicked(evt);
            }
        });
        transfer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_btnActionPerformed(evt);
            }
        });
        jPanel1.add(transfer_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 190, 50));

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 181, 0));
        jLabel5.setText("Nominal Transfer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, 21));

        nominal_transfer.setBackground(new java.awt.Color(255, 255, 255));
        nominal_transfer.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        nominal_transfer.setForeground(new java.awt.Color(23, 50, 75));
        nominal_transfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nominal_transfer.setBorder(null);
        nominal_transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal_transferActionPerformed(evt);
            }
        });
        jPanel1.add(nominal_transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 230, 40));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 181, 0));
        jLabel7.setText("No. Rekening Anda");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 120, 31));

        akun_nomorLbl.setBackground(new java.awt.Color(0, 102, 102));
        akun_nomorLbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        akun_nomorLbl.setForeground(new java.awt.Color(255, 255, 255));
        akun_nomorLbl.setText("0 0 0 0 0");
        jPanel1.add(akun_nomorLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 230, 20));

        rekening_tujuan.setBackground(new java.awt.Color(255, 255, 255));
        rekening_tujuan.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        rekening_tujuan.setForeground(new java.awt.Color(23, 50, 75));
        rekening_tujuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rekening_tujuan.setBorder(null);
        rekening_tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekening_tujuanActionPerformed(evt);
            }
        });
        jPanel1.add(rekening_tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 230, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Poppins", 1, 9)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 181, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pastikan nomor rekening tujuan anda sudah benar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 250, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins", 1, 9)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 181, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nominal transfer berupa mata uang Rupiah (Rp.)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 250, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/transfer/ATMo - Menu Page Background.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void transfer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_btnActionPerformed
    }//GEN-LAST:event_transfer_btnActionPerformed

    private void nominal_transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominal_transferActionPerformed
    }//GEN-LAST:event_nominal_transferActionPerformed

    private void rekening_tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekening_tujuanActionPerformed

    }//GEN-LAST:event_rekening_tujuanActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        halaman_utama new_homepage = new halaman_utama(MyAkunNomor);
        new_homepage.setLocationRelativeTo(null);
        new_homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void transfer_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfer_btnMouseClicked
    if(rekening_tujuan.getText().isEmpty()||rekening_tujuan.getText().equals("0")){
        JOptionPane.showMessageDialog(this,"Rekening Tujuan tidak boleh kosong");
            
    }else if(nominal_transfer.getText().isEmpty()||nominal_transfer.getText().equals("0")){
        JOptionPane.showMessageDialog(this,"Jumlah Nominal tidak boleh kosong");
        
    }
    else if(saldoLama < Integer.valueOf(nominal_transfer.getText())){
        JOptionPane.showMessageDialog(this,"Saldo Tidak Cukup");
            
        }else{
 
            try{
                
                String Query= "Update tb_akun set saldo =? where akunNomor =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                statement = con.prepareStatement(Query);
                
                statement.setInt(1, saldoLama-Integer.valueOf(nominal_transfer.getText()));
                statement.setInt(2, MyAkunNomor);
                statement.executeUpdate();
                
                String Query2 = "select * from tb_akun where akunNomor ='"+Integer.valueOf(rekening_tujuan.getText())+"'";
                    try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                    st2 = con.createStatement();
                    rs2 = st2.executeQuery(Query2);

                        if(rs2.next()){
                        saldoTujuan= rs2.getInt(9);
                        System.out.println(saldoTujuan);
                        }
                        else{

                        }
                    }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this, e);
                        }
                
                statement.clearParameters();
                statement.setInt(1, saldoTujuan+Integer.valueOf(nominal_transfer.getText()));
                statement.setInt(2, Integer.valueOf(rekening_tujuan.getText()));
                statement.executeUpdate();
                
                
                
                if(statement.executeUpdate() == 1 || statement.executeUpdate() == 0)
                {
                    JOptionPane.showMessageDialog(this, "Berhasil Transfer");
                    String Query1 = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
                    try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                    st1 = con.createStatement();
                    rs1 = st1.executeQuery(Query1);

                        if(rs1.next()){
                            saldoLama = rs1.getInt(9);
                            SaldoLbl.setText(""+saldoLama);
                        }
                        else{
                            saldoLama = rs1.getInt(9);
                            SaldoLbl.setText(""+saldoLama);
                        }
                    }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this, e);
                        }
                }else
                {
                    JOptionPane.showMessageDialog(this, "Gagal Transfer");
                }
            }catch(Exception e){
            }

        }
        KosongkanField();
    }//GEN-LAST:event_transfer_btnMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SaldoLbl;
    private javax.swing.JLabel akun_nomorLbl;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nominal_transfer;
    private javax.swing.JTextField rekening_tujuan;
    private javax.swing.JLabel saldo_anda;
    private javax.swing.JButton transfer_btn;
    // End of variables declaration//GEN-END:variables
}
