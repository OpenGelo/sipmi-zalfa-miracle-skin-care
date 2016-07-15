/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.view;

import aplikasi.config.KoneksiDB;
import aplikasi.entity.Pengguna;
import aplikasi.repository.RepoPengguna;
import aplikasi.service.ServicePengguna;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dimmaryanto
 */
public class LoginView extends javax.swing.JDialog {

    private static final long serialVersionUID = 1L;

    private final MainMenuView menuUtamaController;
    private final RepoPengguna repoPengguna;

    /**
     * Creates new form Login
     *
     * @param menuUtama
     * @param parent
     * @param modal
     */
    public LoginView(MainMenuView menuUtama, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.menuUtamaController = menuUtama;
        this.repoPengguna = new ServicePengguna(KoneksiDB.getDataSource());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(218, 45));
        jToolBar1.setMinimumSize(new java.awt.Dimension(218, 45));
        jToolBar1.setPreferredSize(new java.awt.Dimension(100, 45));

        btnLogin.setText("Login");
        btnLogin.setFocusable(false);
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setMaximumSize(new java.awt.Dimension(100, 35));
        btnLogin.setMinimumSize(new java.awt.Dimension(100, 35));
        btnLogin.setPreferredSize(new java.awt.Dimension(100, 35));
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogin);

        btnExit.setText("Kembali");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMaximumSize(new java.awt.Dimension(100, 35));
        btnExit.setMinimumSize(new java.awt.Dimension(100, 35));
        btnExit.setPreferredSize(new java.awt.Dimension(100, 35));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Aplikasi"));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            char[] password = txtPassword.getPassword();
            Pengguna pengguna = repoPengguna.findByUsernameAndPasswordAndIsStatusEnabled(txtUsername.getText(), String.copyValueOf(password));
            this.menuUtamaController.setLoginEnabled(pengguna != null);
            if (pengguna != null && pengguna.getJabatan() == Pengguna.Role.ADMIN) {
                this.menuUtamaController.enabledMenu(true);
                this.dispose();
            } else if (pengguna != null && pengguna.getJabatan() == Pengguna.Role.GUDANG) {
                this.menuUtamaController.enabledMenu(true);
                this.menuUtamaController.setEnabledMenuBarang(true);
                this.menuUtamaController.setEnabledMenuKategoriBarang(true);
                this.menuUtamaController.setEnabledMenuPemasok(true);
                this.menuUtamaController.setEnabledMenuPembelian(true);
                this.dispose();
            } else if (pengguna != null && pengguna.getJabatan() == Pengguna.Role.KASIR) {
                this.menuUtamaController.enabledMenu(true);
                this.menuUtamaController.setEnabledMenuBarang(true);
                this.menuUtamaController.setEnabledMenuKategoriBarang(true);
                this.menuUtamaController.setEnabledMenuPenjualan(true);
                this.menuUtamaController.setEnabledMenuPelanggan(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username dan password salah", getTitle(), JOptionPane.WARNING_MESSAGE);
                txtPassword.setText("");
                txtUsername.setText("");
                txtUsername.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Tidak dapat mendapatkan data user", getTitle(), JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
