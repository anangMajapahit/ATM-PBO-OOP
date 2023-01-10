
package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class halaman_utama extends java.awt.Frame {

    public halaman_utama() {
        initComponents();
    }
    
    int MyAkunNomor;
    public halaman_utama(int akunNomor) {
        initComponents();
        MyAkunNomor = akunNomor;
        akunNomorlbl.setText(""+MyAkunNomor);

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
                isi_saldo.setText(""+SaldoLama);
                
            }
        }
        catch (Exception e) {
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cek_saldo_btn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        aaaaaa = new javax.swing.JLabel();
        akunNomorlbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bttransfer = new javax.swing.JButton();
        tbtarikTunai = new javax.swing.JButton();
        isi_saldo = new javax.swing.JLabel();
        btSetorTunai = new javax.swing.JButton();
        akun = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cek_saldo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/homepage/cek saldo.png"))); // NOI18N
        cek_saldo_btn.setBorder(null);
        cek_saldo_btn.setBorderPainted(false);
        cek_saldo_btn.setContentAreaFilled(false);
        cek_saldo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cek_saldo_btnActionPerformed(evt);
            }
        });
        jPanel2.add(cek_saldo_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 30, 30));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 181, 0));
        jLabel2.setText("Saldo Rekening");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 52));

        aaaaaa.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        aaaaaa.setForeground(new java.awt.Color(255, 255, 255));
        aaaaaa.setText("Nomor Rekening");
        jPanel2.add(aaaaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        akunNomorlbl.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        akunNomorlbl.setForeground(new java.awt.Color(255, 255, 255));
        akunNomorlbl.setText("jLabel5");
        jPanel2.add(akunNomorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, -1));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Rp. ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 30));

        bttransfer.setBackground(new java.awt.Color(0, 51, 51));
        bttransfer.setForeground(new java.awt.Color(255, 255, 255));
        bttransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/homepage/transfer - home.png"))); // NOI18N
        bttransfer.setBorder(null);
        bttransfer.setBorderPainted(false);
        bttransfer.setContentAreaFilled(false);
        bttransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttransferActionPerformed(evt);
            }
        });
        jPanel2.add(bttransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, 40));

        tbtarikTunai.setBackground(new java.awt.Color(0, 51, 51));
        tbtarikTunai.setForeground(new java.awt.Color(255, 255, 255));
        tbtarikTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/homepage/tarik tunai - home.png"))); // NOI18N
        tbtarikTunai.setBorder(null);
        tbtarikTunai.setBorderPainted(false);
        tbtarikTunai.setContentAreaFilled(false);
        tbtarikTunai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtarikTunaiMouseClicked(evt);
            }
        });
        tbtarikTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtarikTunaiActionPerformed(evt);
            }
        });
        jPanel2.add(tbtarikTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 180, 40));

        isi_saldo.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        isi_saldo.setForeground(new java.awt.Color(255, 255, 255));
        isi_saldo.setText("* * * * * * * *");
        jPanel2.add(isi_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, 40));

        btSetorTunai.setBackground(new java.awt.Color(0, 51, 51));
        btSetorTunai.setForeground(new java.awt.Color(255, 255, 255));
        btSetorTunai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/homepage/setor tunai - home.png"))); // NOI18N
        btSetorTunai.setBorder(null);
        btSetorTunai.setBorderPainted(false);
        btSetorTunai.setContentAreaFilled(false);
        btSetorTunai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSetorTunaiMouseClicked(evt);
            }
        });
        btSetorTunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSetorTunaiActionPerformed(evt);
            }
        });
        jPanel2.add(btSetorTunai, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 180, 40));

        akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                akunMouseClicked(evt);
            }
        });
        jPanel2.add(akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 90, 60));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 100, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/homepage/background - ATMo - Home Page.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void bttransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttransferActionPerformed

        transfer new_transfer = new transfer(MyAkunNomor);
        new_transfer.setLocationRelativeTo(null);
        new_transfer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bttransferActionPerformed

    private void tbtarikTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtarikTunaiActionPerformed
        tarik_tunai new_tarik_tunai = new tarik_tunai(MyAkunNomor);
        new_tarik_tunai.setLocationRelativeTo(null);
        new_tarik_tunai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbtarikTunaiActionPerformed

    private void btSetorTunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSetorTunaiActionPerformed
        setor_tunai new_setor_tunai = new setor_tunai(MyAkunNomor);
        new_setor_tunai.setLocationRelativeTo(null);
        new_setor_tunai.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSetorTunaiActionPerformed

    private void btSetorTunaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSetorTunaiMouseClicked
        new setor_tunai(MyAkunNomor).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSetorTunaiMouseClicked

    private void tbtarikTunaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtarikTunaiMouseClicked
        new tarik_tunai(MyAkunNomor).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbtarikTunaiMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        JFrame frame = new JFrame("Keluar");
        if(JOptionPane.showConfirmDialog(frame, "Anda yakin ingin keluar?","Keluar",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            Login open_login = new Login();
            open_login.setLocationRelativeTo(null);
            open_login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_exitMouseClicked

    private void akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akunMouseClicked
        akun new_akun = new akun(MyAkunNomor);
        new_akun.setLocationRelativeTo(null);
        new_akun.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_akunMouseClicked

    private void cek_saldo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cek_saldo_btnActionPerformed
        if (cek_saldo_btn.isSelected()) {
            getBalance();
        } else{
            isi_saldo.setText("* * * * * * * *");
        }
    }//GEN-LAST:event_cek_saldo_btnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            halaman_utama homepage = new halaman_utama();
            homepage.setLocationRelativeTo(null);
            homepage.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aaaaaa;
    private javax.swing.JLabel akun;
    private javax.swing.JLabel akunNomorlbl;
    private javax.swing.JButton btSetorTunai;
    private javax.swing.JButton bttransfer;
    private javax.swing.JToggleButton cek_saldo_btn;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel isi_saldo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton tbtarikTunai;
    // End of variables declaration//GEN-END:variables
}
