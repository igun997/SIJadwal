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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import penjadwalanpribadi.entity.Dosen;
import penjadwalanpribadi.entity.Hari;
import penjadwalanpribadi.entity.Matkul;
import penjadwalanpribadi.temp.writeText;

/**
 *
 * @author Sys5
 */
public class jadwal extends javax.swing.JFrame {
    writeText session = new writeText();
    DefaultTableModel tabModel;
    String selectedRow = null;
    /**
     * Creates new form jadwal
     */
    public jadwal() {
        initComponents();
        initTimer();
        disabled();
        initForm();
        setJTable();
        initJtables();
    }
    public void initJtables(){
        listJadwal.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            if(listJadwal.getRowCount() > 0){
                selectedRow = listJadwal.getValueAt(listJadwal.getSelectedRow(), 0).toString();
                hapusdata.setEnabled(true);
                enabled();
            }
        }
    });
    }
    public void initForm(){
        Dosen dosen = new Dosen();
        Hari  haris = new Hari();
        ResultSet rshari = haris.getListHari();
        ResultSet rs = dosen.getPengajar();
        ResultSet rskelas = dosen.getListKelas(session.getsession());
        try {
            while(rs.next()){
                pengajar.addItem(rs.getString("id_dosen")+"-"+rs.getString("nama"));
            }
            while(rshari.next()){
                hari.addItem(rshari.getString("id_days")+"-"+rshari.getString("hari"));
            }
            while(rskelas.next()){
                kelas.addItem(rskelas.getString("id_kelas")+"-"+rskelas.getString("nama_kelas"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(jadwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void enabled(){
        nama.setEnabled(true);
        start_min.setEnabled(true);
        start_sec.setEnabled(true);
        end_min.setEnabled(true);
        end_sec.setEnabled(true);
        ruangmatkul.setEnabled(true);
        pengajar.setEnabled(true);
        hari.setEnabled(true);
        simpandata.setEnabled(true);
        kelas.setEnabled(true);
    }
    private void getData(){
        writeText session = new writeText();
        String sesi = session.getsession();
        Matkul data = new Matkul();
        ResultSet rs = data.getJadwal(Integer.parseInt(sesi));
        try {
            while(rs.next()){
                Object Apa[]={rs.getString("id_matkul"),rs.getString("nama_matkul"),rs.getString("nama_kelas"),rs.getString("waktu_mulai"),rs.getString("waktu_selesai"),rs.getString("ruang_matkul"),rs.getString("hari"),rs.getString("nama")};
                tabModel.addRow(Apa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(jadwal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setJTable(){
        String [] JudulKolom={"ID","Pelajaran","Kelas","Waktu Mulai","Waktu Selesai","Ruang","Hari","Dosen"};
        tabModel = new DefaultTableModel(null, JudulKolom){
                      boolean[] canEdit = new boolean [] { false, false, false, false, false,false,false,false };
                      @Override
                      public boolean isCellEditable(int rowIndex, int columnIndex) {
                       return canEdit [columnIndex];
                      }
                  };
        listJadwal.setModel(tabModel);
        getData();
    }
    public void disabled(){
        nama.setEnabled(false);
        start_min.setEnabled(false);
        start_sec.setEnabled(false);
        kelas.setEnabled(false);
        end_min.setEnabled(false);
        end_sec.setEnabled(false);
        ruangmatkul.setEnabled(false);
        pengajar.setEnabled(false);
        hari.setEnabled(false);
        editdata.setEnabled(false);
        simpandata.setEnabled(false);
        hapusdata.setEnabled(false);
    }
    public void initTimer(){
        start_min.removeAllItems();
        start_sec.removeAllItems();
        end_min.removeAllItems();
        end_sec.removeAllItems();
        for(int i = 1; i <= 24; i++){
            start_min.addItem(String.valueOf(i));
            end_min.addItem(String.valueOf(i));
        }
        for(int i = 1; i <= 60; i++){
            start_sec.addItem(String.valueOf(i));
            end_sec.addItem(String.valueOf(i));
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
        jTable1 = new javax.swing.JTable();
        nama = new javax.swing.JTextField();
        ruangmatkul = new javax.swing.JTextField();
        start_min = new javax.swing.JComboBox<>();
        start_sec = new javax.swing.JComboBox<>();
        pengajar = new javax.swing.JComboBox<>();
        hari = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ruang = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        end_sec = new javax.swing.JComboBox<>();
        end_min = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listJadwal = new javax.swing.JTable();
        simpandata = new javax.swing.JButton();
        tambahdata = new javax.swing.JButton();
        editdata = new javax.swing.JButton();
        tambahdata1 = new javax.swing.JButton();
        kelas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        hapusdata = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jadwal");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        start_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_secActionPerformed(evt);
            }
        });

        jLabel1.setText("Jam Mulai");

        jLabel2.setText("Pengajar");

        Ruang.setText("Nomor Ruangan");

        jLabel5.setText("Jam Selesai");

        jLabel6.setText("Mata Kuliah");

        jLabel8.setText("Hari");

        end_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_secActionPerformed(evt);
            }
        });

        listJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        listJadwal.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                listJadwalCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        listJadwal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listJadwalPropertyChange(evt);
            }
        });
        listJadwal.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                listJadwalVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(listJadwal);

        simpandata.setText("Simpan Data");
        simpandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpandataActionPerformed(evt);
            }
        });

        tambahdata.setText("Tambah Data");
        tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahdataActionPerformed(evt);
            }
        });

        editdata.setText("Edit Data");

        tambahdata1.setText("Batal");
        tambahdata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahdata1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Kelas");

        hapusdata.setText("Hapus");
        hapusdata.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hapusdataItemStateChanged(evt);
            }
        });
        hapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Ruang)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama)
                            .addComponent(ruangmatkul)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(end_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(start_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(end_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(start_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(106, 106, 106))))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(tambahdata)
                        .addGap(18, 18, 18)
                        .addComponent(editdata)
                        .addGap(18, 18, 18)
                        .addComponent(hapusdata)
                        .addGap(12, 12, 12)
                        .addComponent(simpandata)
                        .addGap(18, 18, 18)
                        .addComponent(tambahdata1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(pengajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(start_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(start_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(end_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(end_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruangmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ruang)
                    .addComponent(jLabel8)
                    .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpandata)
                    .addComponent(tambahdata)
                    .addComponent(editdata)
                    .addComponent(tambahdata1)
                    .addComponent(hapusdata))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void start_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_secActionPerformed

    private void end_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end_secActionPerformed

    private void tambahdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahdataActionPerformed
        enabled();
    }//GEN-LAST:event_tambahdataActionPerformed

    private void tambahdata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahdata1ActionPerformed
        disabled();
    }//GEN-LAST:event_tambahdata1ActionPerformed

    private void simpandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpandataActionPerformed
        String nama_matkul = nama.getText();
        String waktu_mulai = start_min.getSelectedItem().toString()+":"+start_sec.getSelectedItem().toString();
        String waktu_selesai = end_min.getSelectedItem().toString()+":"+end_sec.getSelectedItem().toString();
        String ruang_matkul = ruangmatkul.getText();
        String[] dosen = pengajar.getSelectedItem().toString().split("-");
        String id_dosen = dosen[0];
        String nama_dosen = dosen[1];
        String[] ghari = hari.getSelectedItem().toString().split("-");
        String id_hari = ghari[0];
        String nama_hari = ghari[1];
        String[] gkelas = kelas.getSelectedItem().toString().split("-");
        String id_kelas = gkelas[0];
        String nama_kelas = gkelas[1];
        String id_users = session.getsession();
        Matkul ins = new Matkul();
        ins.setDays_id(id_hari);
        ins.setDosen_id(id_dosen);
        ins.setKelas_id(id_kelas);
        ins.setNama_matkul(nama_matkul);
        ins.setRuang_matkul(ruang_matkul);
        ins.setUsers_id(id_users);
        ins.setWaktu_mulai(waktu_mulai);
        ins.setWaktu_selesai(waktu_selesai);
        int insert = ins.setJadwal(ins);
        if(insert == 1){
            JOptionPane.showMessageDialog(null,"Jadwal Berhasil Di Simpan");
        }else{
            JOptionPane.showMessageDialog(null,"Jadwal Gagal Di Simpan");
        }
        setJTable();
        disabled();
    }//GEN-LAST:event_simpandataActionPerformed

    private void hapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusdataActionPerformed
        int conf = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus ID = "+selectedRow);
        System.out.print(conf);
        if(conf == 0){
            if(selectedRow != null){
                Matkul del = new Matkul();
                del.setId_matkul(Integer.parseInt(selectedRow));
                int status = del.delJadwal(del);
                if(status == 1){
                    JOptionPane.showMessageDialog(null, "Data Terhapus");
                }else{
                    JOptionPane.showMessageDialog(null, "Gagal Hapus Data");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Pilih Salah Satu Data");
            }
        }
        setJTable();
        disabled();
    }//GEN-LAST:event_hapusdataActionPerformed

    private void listJadwalCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_listJadwalCaretPositionChanged
        
    }//GEN-LAST:event_listJadwalCaretPositionChanged

    private void hapusdataItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hapusdataItemStateChanged
      
    }//GEN-LAST:event_hapusdataItemStateChanged

    private void listJadwalVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_listJadwalVetoableChange

    }//GEN-LAST:event_listJadwalVetoableChange

    private void listJadwalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listJadwalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_listJadwalPropertyChange

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
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ruang;
    private javax.swing.JButton editdata;
    private javax.swing.JComboBox<String> end_min;
    private javax.swing.JComboBox<String> end_sec;
    private javax.swing.JButton hapusdata;
    private javax.swing.JComboBox<String> hari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JTable listJadwal;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pengajar;
    private javax.swing.JTextField ruangmatkul;
    private javax.swing.JButton simpandata;
    private javax.swing.JComboBox<String> start_min;
    private javax.swing.JComboBox<String> start_sec;
    private javax.swing.JButton tambahdata;
    private javax.swing.JButton tambahdata1;
    // End of variables declaration//GEN-END:variables
}
