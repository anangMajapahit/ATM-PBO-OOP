
package atm_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class akun extends java.awt.Frame{

    int MyAkunNomor;
    public akun() {
        initComponents();
    }
    
    Connection con = null;
    PreparedStatement pst = null,pst1=null;
    ResultSet rs = null,rs1=null;
    Statement st = null,st1=null;
    int saldoLama;
    String sekolah;
    String namalengkap;
    String kerjaan;
    String Alamat;
    String tanggal;
    String notelp;

    public akun(int akunNomor) {
        initComponents();
        MyAkunNomor = akunNomor;
        akunNomorlbl.setText(""+akunNomor);
        
        System.out.println(MyAkunNomor);
        getDataAkun();
    }
    
    private void getDataAkun(){
        String Query = "select * from tb_akun where akunNomor ='"+MyAkunNomor+"'";
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
        st1 = con.createStatement();
        rs1 = st1.executeQuery(Query);
        
            if(rs1.next()){
            namalengkap = rs1.getString(3);
            nama_pengguna.setText(""+namalengkap);
            tanggal = rs1.getString(4);
            notelp = rs1.getString(5);
            no_hp.setText(""+notelp);
            Alamat = rs1.getString(6);
            alamat.setText(""+Alamat);
            tanggal_lahir.setText(""+tanggal.toString());
            sekolah = rs1.getString(7);
            pendidikan.setText(""+sekolah);
            kerjaan = rs1.getString(8);
            pekerjaan.setText(""+kerjaan);
            }
            else{
                
            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        no_rekening = new javax.swing.JLabel();
        akunNomorlbl = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        nama_pengguna = new javax.swing.JLabel();
        ttl = new javax.swing.JLabel();
        tanggal_lahir = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        no_hp = new javax.swing.JLabel();
        almt = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        pdd = new javax.swing.JLabel();
        pendidikan = new javax.swing.JLabel();
        kerja = new javax.swing.JLabel();
        pekerjaan = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
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

        no_rekening.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        no_rekening.setForeground(new java.awt.Color(48, 104, 156));
        no_rekening.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        no_rekening.setText("No. Rekening");
        jPanel2.add(no_rekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 20));

        akunNomorlbl.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        akunNomorlbl.setForeground(new java.awt.Color(23, 50, 75));
        akunNomorlbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        akunNomorlbl.setText("0000000");
        jPanel2.add(akunNomorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 20));

        Nama.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        Nama.setForeground(new java.awt.Color(48, 104, 156));
        Nama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Nama.setText("Nama");
        jPanel2.add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 20));

        nama_pengguna.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        nama_pengguna.setForeground(new java.awt.Color(23, 50, 75));
        nama_pengguna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nama_pengguna.setText("Nama Pengguna");
        jPanel2.add(nama_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 20));

        ttl.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        ttl.setForeground(new java.awt.Color(48, 104, 156));
        ttl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ttl.setText("Tanggal Lahir");
        jPanel2.add(ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 20));

        tanggal_lahir.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        tanggal_lahir.setForeground(new java.awt.Color(23, 50, 75));
        tanggal_lahir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tanggal_lahir.setText("01-01-1991");
        jPanel2.add(tanggal_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 20));

        hp.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        hp.setForeground(new java.awt.Color(48, 104, 156));
        hp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hp.setText("No. Handphone");
        jPanel2.add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 20));

        no_hp.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        no_hp.setForeground(new java.awt.Color(23, 50, 75));
        no_hp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        no_hp.setText("082102102102");
        jPanel2.add(no_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 20));

        almt.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        almt.setForeground(new java.awt.Color(48, 104, 156));
        almt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        almt.setText("Alamat");
        jPanel2.add(almt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 20));

        alamat.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        alamat.setForeground(new java.awt.Color(23, 50, 75));
        alamat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        alamat.setText("Rungkut, Surabaya");
        jPanel2.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 20));

        pdd.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        pdd.setForeground(new java.awt.Color(48, 104, 156));
        pdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pdd.setText("Pendidikan");
        jPanel2.add(pdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 180, 20));

        pendidikan.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        pendidikan.setForeground(new java.awt.Color(23, 50, 75));
        pendidikan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pendidikan.setText("S1 (Sistem Informasi)");
        jPanel2.add(pendidikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 180, 20));

        kerja.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        kerja.setForeground(new java.awt.Color(48, 104, 156));
        kerja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kerja.setText("Pekerjaan");
        jPanel2.add(kerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 20));

        pekerjaan.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        pekerjaan.setForeground(new java.awt.Color(23, 50, 75));
        pekerjaan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pekerjaan.setText("Mahasiswa");
        jPanel2.add(pekerjaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 180, 20));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 90, 60));

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 100, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm_sederhana/akun/ATMo -Akun.png"))); // NOI18N
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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        halaman_utama home = new halaman_utama(MyAkunNomor);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            akun new_akun = new akun();
            new_akun.setLocationRelativeTo(null);
            new_akun.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel akunNomorlbl;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel almt;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel hp;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kerja;
    private javax.swing.JLabel nama_pengguna;
    private javax.swing.JLabel no_hp;
    private javax.swing.JLabel no_rekening;
    private javax.swing.JLabel pdd;
    private javax.swing.JLabel pekerjaan;
    private javax.swing.JLabel pendidikan;
    private javax.swing.JLabel tanggal_lahir;
    private javax.swing.JLabel ttl;
    // End of variables declaration//GEN-END:variables
}
