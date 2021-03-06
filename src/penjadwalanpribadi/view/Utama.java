/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.view;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import penjadwalanpribadi.view.pages.*;

/**
 *
 * @author Sys5
 */
public class Utama extends javax.swing.JFrame {

    /**
     * Creates new form Utama
     */
    public Utama() {;
        initComponents();
        setResizable(false);
        DateFormat df;
        df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date tgl = new Date();
        curdate.setText(df.format(tgl));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homePage = new javax.swing.JButton();
        materiPage = new javax.swing.JButton();
        jadwalPage = new javax.swing.JButton();
        kelasPage = new javax.swing.JButton();
        pengaturanPage = new javax.swing.JButton();
        logoutPage = new javax.swing.JButton();
        curdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Utama");

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        homePage.setText("Halaman Utama");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });

        materiPage.setText("Materi");
        materiPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiPageActionPerformed(evt);
            }
        });

        jadwalPage.setText("Jadwal");
        jadwalPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadwalPageActionPerformed(evt);
            }
        });

        kelasPage.setText("Kelas");
        kelasPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasPageActionPerformed(evt);
            }
        });

        pengaturanPage.setText("FRS KIT");
        pengaturanPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengaturanPageActionPerformed(evt);
            }
        });

        logoutPage.setText("Logout");
        logoutPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(homePage)
                .addGap(27, 27, 27)
                .addComponent(materiPage)
                .addGap(18, 18, 18)
                .addComponent(jadwalPage)
                .addGap(18, 18, 18)
                .addComponent(kelasPage)
                .addGap(18, 18, 18)
                .addComponent(pengaturanPage)
                .addGap(18, 18, 18)
                .addComponent(logoutPage)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePage)
                    .addComponent(materiPage)
                    .addComponent(jadwalPage)
                    .addComponent(kelasPage)
                    .addComponent(pengaturanPage)
                    .addComponent(logoutPage))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        curdate.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        curdate.setText("Current Date ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(curdate, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(curdate)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homePageActionPerformed

    private void materiPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiPageActionPerformed
        materi p = new materi();
        p.setTitle("Halaman Materi");
        p.setAlwaysOnTop(true);
        p.setVisible(true);
            
    }//GEN-LAST:event_materiPageActionPerformed

    private void jadwalPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadwalPageActionPerformed
        jadwal p = new jadwal();
        p.setTitle("Halaman Jadwal");
        p.setAlwaysOnTop(true);
        p.setVisible(true);
    }//GEN-LAST:event_jadwalPageActionPerformed

    private void kelasPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasPageActionPerformed
        kelas p = new kelas();
        p.setTitle("Halaman Kelas");
        p.setAlwaysOnTop(true);
        p.setVisible(true);
    }//GEN-LAST:event_kelasPageActionPerformed

    private void pengaturanPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengaturanPageActionPerformed
        frskit p = new frskit();
        p.setTitle("FRS UNIKOM KIT");
        p.setAlwaysOnTop(true);
        p.setVisible(true);
    }//GEN-LAST:event_pengaturanPageActionPerformed

    private void logoutPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutPageActionPerformed
        dispose();
        Login ob = new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_logoutPageActionPerformed

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curdate;
    private javax.swing.JButton homePage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jadwalPage;
    private javax.swing.JButton kelasPage;
    private javax.swing.JButton logoutPage;
    private javax.swing.JButton materiPage;
    private javax.swing.JButton pengaturanPage;
    // End of variables declaration//GEN-END:variables
}
