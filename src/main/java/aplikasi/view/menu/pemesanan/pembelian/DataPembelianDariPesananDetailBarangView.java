/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.view.menu.pemesanan.pembelian;

import aplikasi.entity.Barang;
import aplikasi.entity.PembelianDetail;
import aplikasi.view.MainMenuView;

/**
 *
 * @author dimmaryanto
 */
public class DataPembelianDariPesananDetailBarangView extends javax.swing.JDialog {

    private final PembelianDetail pembelianDetail;
    private final DataPembelianDariPemesananView pembelianController;
    private final Integer position;

    /**
     * Creates new form DataPembelianDariPesananDetailBarangView
     *
     * @param parent
     * @param modal
     */
    DataPembelianDariPesananDetailBarangView(MainMenuView parent, boolean modal, DataPembelianDariPemesananView pembelianController, PembelianDetail pembelianDetail, Integer position) {
        super(parent, modal);
        initComponents();
        this.position = position;
        this.pembelianController = pembelianController;
        this.pembelianDetail = pembelianDetail;
        setFields(pembelianDetail);

    }

    private void setFields(PembelianDetail pd) {
        Barang brg = pd.getBarang();
        txtKode.setText(brg.getKode());
        txtNama.setText(brg.getNama());
        txtJumlah.setValue(pd.getJumlah());
        txtHarga.setValue(pd.getHarga());
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
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JSpinner();
        txtJumlah = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Data Barang");

        jToolBar1.setRollover(true);

        btnSimpan.setText("Simpan");
        btnSimpan.setFocusable(false);
        btnSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSimpan.setMaximumSize(new java.awt.Dimension(120, 35));
        btnSimpan.setMinimumSize(new java.awt.Dimension(120, 35));
        btnSimpan.setPreferredSize(new java.awt.Dimension(120, 35));
        btnSimpan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSimpan);

        btnKembali.setText("Kembali");
        btnKembali.setFocusable(false);
        btnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKembali.setMaximumSize(new java.awt.Dimension(120, 35));
        btnKembali.setMinimumSize(new java.awt.Dimension(120, 35));
        btnKembali.setPreferredSize(new java.awt.Dimension(120, 35));
        btnKembali.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKembali);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubah harga dan jumlah barang yang dibeli"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Kode");

        jLabel2.setText("Nama");

        jLabel3.setText("Harga");

        jLabel4.setText("Jumlah");

        txtKode.setEditable(false);

        txtNama.setEditable(false);

        txtHarga.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 500));

        txtJumlah.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        this.pembelianDetail.setHarga(Double.valueOf(txtHarga.getValue().toString()));
        this.pembelianDetail.setJumlah(Integer.valueOf(txtJumlah.getValue().toString()));
        this.pembelianController.updateBarang(position, pembelianDetail);
        this.dispose();
    }//GEN-LAST:event_btnSimpanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JSpinner txtHarga;
    private javax.swing.JSpinner txtJumlah;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
