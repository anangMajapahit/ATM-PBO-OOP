
package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class setor_tunai extends java.awt.Frame {

    public setor_tunai() {
        initComponents();
    }
    int MyAkunNomor;
    public setor_tunai(int akunNomor) {
        initComponents();
        MyAkunNomor = akunNomor;
        no_rekening.setText(""+MyAkunNomor);
        getBalance();
    }
    
    Connection con = null;
    PreparedStatement pst = null,pst1=null;
    ResultSet rs = null,rs1=null;
    Statement st = null,st1=null;
    int saldoLama;
    
    private void getBalance(){
        String Query = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        st1 = con.createStatement();
        rs1 = st1.executeQuery(Query);
        
            if(rs1.next()){
            saldoLama = rs1.getInt(9);
            SaldoLbl.setText(""+saldoLama);
            }
            else{
                
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }
    
    private void KosongkanField(){
        nominal_setor.setText(null);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saldo_anda = new javax.swing.JLabel();
        no_rekening = new javax.swing.JLabel();
        setor_tunai = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SaldoLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nominal_setor = new javax.swing.JTextField();
        Setor = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
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

        no_rekening.setBackground(new java.awt.Color(0, 102, 102));
        no_rekening.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        no_rekening.setForeground(new java.awt.Color(255, 255, 255));
        no_rekening.setText("0 0 0 0");
        jPanel1.add(no_rekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, 30));

        setor_tunai.setBackground(new java.awt.Color(0, 102, 102));
        setor_tunai.setFont(new java.awt.Font("Poppins", 1, 22)); // NOI18N
        setor_tunai.setForeground(new java.awt.Color(255, 255, 255));
        setor_tunai.setText("Setor Tunai");
        jPanel1.add(setor_tunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 181, 0));
        jLabel7.setText("No. Rekening Anda");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 31));

        SaldoLbl.setBackground(new java.awt.Color(0, 102, 102));
        SaldoLbl.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        SaldoLbl.setForeground(new java.awt.Color(255, 255, 255));
        SaldoLbl.setText("0 0 0 0");
        jPanel1.add(SaldoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 181, 0));
        jLabel5.setText("Nominal Setor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, 30));

        nominal_setor.setBackground(new java.awt.Color(255, 255, 255));
        nominal_setor.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        nominal_setor.setForeground(new java.awt.Color(23, 50, 75));
        nominal_setor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nominal_setor.setBorder(null);
        nominal_setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal_setorActionPerformed(evt);
            }
        });
        jPanel1.add(nominal_setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 40));

        Setor.setBackground(new java.awt.Color(0, 102, 102));
        Setor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Setor.setForeground(new java.awt.Color(255, 255, 255));
        Setor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/setor_tunai/setor tunai - home.png"))); // NOI18N
        Setor.setBorder(null);
        Setor.setBorderPainted(false);
        Setor.setContentAreaFilled(false);
        Setor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SetorMouseClicked(evt);
            }
        });
        Setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetorActionPerformed(evt);
            }
        });
        jPanel1.add(Setor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 190, 50));

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

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Poppins", 1, 9)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 181, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nominal setor tunai berupa mata uang Rupiah (Rp.)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 250, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/transfer/ATMo - Menu Page Background.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void SetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetorActionPerformed

    }//GEN-LAST:event_SetorActionPerformed

    private void nominal_setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominal_setorActionPerformed

    }//GEN-LAST:event_nominal_setorActionPerformed

    private void SetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SetorMouseClicked
        
        if(nominal_setor.getText().isEmpty()||nominal_setor.getText().equals("0")){
            JOptionPane.showMessageDialog(this,"Masukan Jumlah Pasti");

        }
        else{
           
            try{
                
                String Query= "Update tb_akun set saldo =? where akunNomor =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                PreparedStatement pst = con.prepareStatement(Query);
                
                pst.setInt(1, saldoLama+Integer.valueOf(nominal_setor.getText()));
                pst.setInt(2, MyAkunNomor);
                
                if(pst.executeUpdate() == 1)
                {
                    JOptionPane.showMessageDialog(this, "Berhasil Setor Tunai");
                    
                }else
                {
                    JOptionPane.showMessageDialog(this, "Gagal Setor Tunai");
                }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Nominal Berupa Angka");
            }
            getBalance();
            KosongkanField();
        }                                  
    }//GEN-LAST:event_SetorMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        halaman_utama new_homepage = new halaman_utama(MyAkunNomor);
        new_homepage.setLocationRelativeTo(null);
        new_homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setor_tunai newsetor_tunai = new setor_tunai();
                newsetor_tunai.setLocationRelativeTo(null);
                newsetor_tunai.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SaldoLbl;
    private javax.swing.JButton Setor;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel no_rekening;
    private javax.swing.JTextField nominal_setor;
    private javax.swing.JLabel saldo_anda;
    private javax.swing.JLabel setor_tunai;
    // End of variables declaration//GEN-END:variables
}
