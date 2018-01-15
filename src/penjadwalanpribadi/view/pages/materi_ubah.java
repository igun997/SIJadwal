/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.view.pages;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import penjadwalanpribadi.entity.Kelas;
import penjadwalanpribadi.temp.writeText;

/**
 *
 * @author Sys5
 */
public class materi_ubah extends javax.swing.JFrame {
    String id = null;
    public static String curId = null;
    String curIds = null;
    /**
     * Creates new form materi_ubah
     */
    public materi_ubah() {
        initComponents();
        cmbMat();
        initcur();
    }
    public void initcur(){
        Kelas ob = new Kelas();
        ResultSet rs = ob.getListMateriByID(curId);
        currentID.setEnabled(false);
        currentID.setText(curId);
        try {
            while(rs.next()){
                txtJudul.setText(rs.getString("judul_materi"));
                cmbMatkul.setSelectedItem(rs.getString("id_matkul")+"-"+rs.getString("nama_matkul"));
                textMateri.setText(rs.getString("isi_materi"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(materi_ubah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cmbMat(){
        writeText session = new writeText();
        String sesi = session.getsession();
        id = sesi;
        Kelas cmbk = new Kelas();
        ResultSet rs = cmbk.getListMatkul(sesi);
        try {
            while(rs.next()){
                cmbMatkul.addItem(rs.getString("id_matkul")+"-"+rs.getString("nama_matkul"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(materi_tambah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textMateri = new javax.swing.JEditorPane();
        txtJudul = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbMatkul = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        currentID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(textMateri);

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });

        jLabel1.setText("Judul Materi ");

        jLabel2.setText("Mata Kuliah");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        currentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMatkul, 0, 170, Short.MAX_VALUE)
                            .addComponent(txtJudul))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal))
                            .addComponent(currentID))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan)
                        .addComponent(btnBatal)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(currentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Kelas ob  = new Kelas();
        String judul = txtJudul.getText();
        String isi = textMateri.getText();
        String matkul_id = cmbMatkul.getSelectedItem().toString().split("-")[0];
        String idgo = currentID.getText();
        String[] data = {judul,isi,matkul_id,idgo};
        int status = ob.upMateri(data);
        if(status == 1){
            JOptionPane.showMessageDialog(null,"Data Berhasil di Update");
        }else{
            JOptionPane.showMessageDialog(null,"Data Gagal di Update");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void currentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(materi_ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(materi_ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(materi_ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(materi_ubah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new materi_ubah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbMatkul;
    private javax.swing.JTextField currentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane textMateri;
    private javax.swing.JTextField txtJudul;
    // End of variables declaration//GEN-END:variables
}
