/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjadwalanpribadi.view.pages;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;
import penjadwalanpribadi.library.frs;
import penjadwalanpribadi.temp.writeText;

/**
 *
 * @author Sys5
 */
public class frskit extends javax.swing.JFrame {
    DefaultTableModel tabModel;
    /**
     * Creates new form frskit
     */
    public frskit() {
        setExtendedState(frskit.MAXIMIZED_BOTH);
        new JScrollPane(jTable1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        initComponents();
        setJTable();
    }
    private void getData(){
       writeText session = new writeText();
       String sesi = session.getsession();
       frs ob = new frs();
       String test = ob.getJson("http://app.phpina.net/?nim="+sesi);
       JSONObject  data = new JSONObject(test);
       JSONArray step = data.getJSONArray("header");
       String nims = "";
       String noreks = "";
       String memos = "";
       for(int i = 0; i < step.length(); i++){
           nims = step.getJSONObject(i).getString("nim");
           noreks = step.getJSONObject(i).getString("norek");
           memos = step.getJSONObject(i).getString("memo");
       }
       nim.setEnabled(false);
       norek.setEnabled(false);
       memo.setEnabled(false);
       nim.setText(nims);
       norek.setText(noreks);
       memo.setText(memos);
       JSONArray step1 = data.getJSONArray("detail"); 
       for(int i = 0; i < step1.length(); i++){
           String  a = step1.getJSONObject(i).get("nim").toString();
           String  b = step1.getJSONObject(i).get("tr").toString();
           String  c = step1.getJSONObject(i).get("br").toString();
           String  d = step1.getJSONObject(i).get("tang1").toString();
           String  e = step1.getJSONObject(i).get("ang1").toString();
           String  f = step1.getJSONObject(i).get("tang2").toString();
           String  g = step1.getJSONObject(i).get("ang2").toString();
           String  h = step1.getJSONObject(i).get("tang3").toString();
           String  ix = step1.getJSONObject(i).get("ang3").toString();
           String  j = step1.getJSONObject(i).get("tglsks1").toString();
           String  k = step1.getJSONObject(i).get("bsks1").toString();
           String  l = step1.getJSONObject(i).get("tang4").toString();
           String  m = step1.getJSONObject(i).get("ang4").toString();
           String  n = step1.getJSONObject(i).get("tang5").toString();
           String  o = step1.getJSONObject(i).get("ang5").toString();
           String  p = step1.getJSONObject(i).get("tang6").toString();
           String  q = step1.getJSONObject(i).get("ang6").toString();
           String  r = step1.getJSONObject(i).get("tglsks2").toString();
           String  s = step1.getJSONObject(i).get("bsks2").toString();
           String  t = step1.getJSONObject(i).get("tingkat").toString();
           String  u = step1.getJSONObject(i).get("thnakademik").toString();
           Object[] Data = {t,a,b,c,d,e,f,g,h,ix,j,k,l,m,n,o,p,q,r,s,u};
           tabModel.addRow(Data);
       }
    }
    private void setJTable(){
        String [] JudulKolom={"Tingkat","Tgl Registrasi","Biaya Registrasi","Tgl Angsuran 1","Biaya Angsuran 1","Tgl Angsuran 2","Biaya Angsuran 2","Tgl Angsuran 3","Biaya Angsuran 3","Tgl SKS Ganjil","Biaya SKS Ganjil","Tgl Angsuran 4","Biaya Angsuran 4","Tgl Angsuran 5","Biaya Angsuran 5","Tgl Angsuran 6","Biaya Angsuran 6","Tgl SKS Genap","Biaya SKS Genap","Tahun Akademik"};
        tabModel = new DefaultTableModel(null, JudulKolom){
                      boolean[] canEdit = new boolean [] { false, false,false, false,false,false, false,false, false,false,false, false,false, false,false,false, false,false, false,false};
                      @Override
                      public boolean isCellEditable(int rowIndex, int columnIndex) {
                       return canEdit [columnIndex];
                      }
                  };
        jTable1.setModel(tabModel);
        getData();
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
        jLabel2 = new javax.swing.JLabel();
        as = new javax.swing.JLabel();
        asas = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        norek = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        memo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

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

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Data FRS di Ambil Langsung Dari Perwalian Online");

        as.setText("NIM");

        asas.setText("Norek");

        memo.setColumns(20);
        memo.setRows(5);
        jScrollPane2.setViewportView(memo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(505, 505, 505))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(as, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asas, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nim)
                            .addComponent(norek, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(as)
                            .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asas)
                            .addComponent(norek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frskit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frskit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frskit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frskit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frskit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel as;
    private javax.swing.JLabel asas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea memo;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField norek;
    // End of variables declaration//GEN-END:variables
}
