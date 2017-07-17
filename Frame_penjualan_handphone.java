package program.penjualan.handphone;

import javax.swing.table.TableColumn;

/**
 *
 * @author Dodoedoo
 */
public class Frame_penjualan_handphone extends javax.swing.JFrame {
    double nama,harga,jmlhjual,total;
    long hargaProduk1,hargaProduk2,hargaProduk3,hargaSatuan;
    String kodeMerk,merk,jenis,Merk1,Merk2,Merk3,warna,kondisi,kodeTipe;
    int a=0;
    Model_penyimpanan penjualan = new Model_penyimpanan();

    
    public Frame_penjualan_handphone() {
        initComponents();
        tblBarang.setModel(penjualan.getTabel());
        
        TableColumn column;
        tblBarang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = tblBarang.getColumnModel().getColumn(0); 
        column.setPreferredWidth(50);
        column = tblBarang.getColumnModel().getColumn(1); 
        column.setPreferredWidth(250); 
        column = tblBarang.getColumnModel().getColumn(2); 
        column.setPreferredWidth(150); 
        
        cboMerk.addItem("Samsung");
        cboMerk.addItem("Apple");
        cboMerk.addItem("Oppo");
        cboMerk.addItem("Sony");
    }




   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLihat = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        cboMerk = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtTipe = new javax.swing.JTextField();
        txtWarna = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtKondisi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBeli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Penjualan Handphone");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pilih No Tipe Handphone");

        btnLihat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLihat.setText("Lihat");
        btnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblBarang);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pilih Merk Handphone");

        txtTipe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtWarna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Warna Handphone");

        txtKondisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kondisi Handphone");

        txtSatuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Harga Satuan");

        btnBeli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBeli.setText("Beli");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBeli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLihat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHapus)
                                        .addGap(11, 11, 11))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel3)
                    .addContainerGap(325, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cboMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLihat)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBeli)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(jLabel3)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );

        pack();
    }

    private void btnLihatActionPerformed(java.awt.event.ActionEvent evt) {
        String[] data = new String[3];
        a = a + 1;
        data[0] = String.valueOf(a);
        kodeMerk = (String) cboMerk.getSelectedItem();
        
        
         switch (kodeMerk) {
            case "Samsung":
                Merk1 = "Samsung Galaxy J1 mini";
                Merk2 = "Samsung Galaxy S7";
                Merk3 = "Samsung Galaxy V Plus";
                hargaProduk1=1199000;
                hargaProduk2=8999000;
                hargaProduk3=1099000;

            break;
            case "Apple": {
                Merk1 = "Apple iPhone 6s Plus";
                Merk2 = "iPhone 5C 32GB";
                Merk3 = "iPhone 5S 16 GB";
                hargaProduk1=15999000;
                hargaProduk2=6999000;
                hargaProduk3=8499000;
         

            break;
            }
            case "Oppo": {
                Merk1 = "Oppo F1";
                Merk2 = "Oppo R7s";
                Merk3 = "Oppo Mirror 5";
                hargaProduk1=6999000;
                hargaProduk2=4999000;
                hargaProduk3=2999000;

            break;
            }
            case "Sony": {
                Merk1 = "Sony Xperia Z5 Premium";
                Merk2 = "Sony Xperia M5 Dual";
                Merk3 = "Sony Xperia Z3 D6653";
                hargaProduk1=11999000;
                hargaProduk2=5999000;
                hargaProduk3=6800000;

            }
             break;
        }
        
        
        
        data[1] = String.valueOf(Merk1);
        data[2] = String.valueOf("Rp. "+hargaProduk1);
        penjualan.getTabel().addRow(data);

        String[] data2 = new String[3];
        a = a + 1;
        data[0] = String.valueOf(a);
        kodeMerk = (String) cboMerk.getSelectedItem();
        data[1] = String.valueOf(Merk2);
        data[2] = String.valueOf("Rp. "+hargaProduk2);
        penjualan.getTabel().addRow(data);
        
        String[] data3 = new String[3];
        a = a + 1;
        data[0] = String.valueOf(a);
        kodeMerk = (String) cboMerk.getSelectedItem();
        data[1] = String.valueOf(Merk3);
        data[2] = String.valueOf("Rp. "+hargaProduk3);
        penjualan.getTabel().addRow(data);
        
        
            

    }//GEN-LAST:event_btnLihatActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        penjualan.getTabel().removeRow(tblBarang.getSelectedRow());
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // TODO add your handling code here:
        kodeTipe = String.valueOf(txtTipe.getText());
        
             switch (kodeTipe) {
            case "1":
                hargaSatuan=hargaProduk1;
                warna="Hitam dan Silver";
                kondisi="Baru";

            break;
            case "2": {
                hargaSatuan=hargaProduk2;
                warna="Hitam dan Silver";
                kondisi="Baru";
         

            break;
            }
            case "3": {
                hargaSatuan=hargaProduk3;
                warna="Hitam dan Silver";
                kondisi="Baru";

            }
             break;
        }
        
                
                txtWarna.setText("" + warna);
                txtKondisi.setText("" + kondisi); 
                txtSatuan.setText("" + hargaSatuan);
    }

    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_handphone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame_penjualan_handphone().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLihat;
    private javax.swing.JComboBox cboMerk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKondisi;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtTipe;
    private javax.swing.JTextField txtWarna;
    // End of variables declaration//GEN-END:variables
}
