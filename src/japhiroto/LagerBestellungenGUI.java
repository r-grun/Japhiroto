/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author philip
 */
public class LagerBestellungenGUI extends javax.swing.JFrame {

    /**
     * Creates new form LagerBestellungenGUI
     */
    private ArrayList<Bestellung> bestellungen;
    private NoDatabase noDB;
    public LagerBestellungenGUI() {
        initComponents();
        noDB = new NoDatabase();
        
        DefaultTableModel model = (DefaultTableModel) tblBestellungen.getModel();       //aktuelle Bestellungen in Tabelle anzeigen
        for (int i = 0; i < noDB.getAnzahlBestellungen(); i++) {
            model.addRow(new Object[]{noDB.getBestellungListenNummer(i).getBestellNr(), "z.Z. kein Lieferantverfügbar"});
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

        diaBestellung = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBestellungBestellung = new javax.swing.JTable();
        lblBestellungBestellung = new javax.swing.JLabel();
        lblBestellNr = new javax.swing.JLabel();
        txfBestellNr = new javax.swing.JTextField();
        diaWareneingang = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblWarenArtikel = new javax.swing.JTable();
        lblWarenWareneingang = new javax.swing.JLabel();
        lblWarenBestellNr = new javax.swing.JLabel();
        txfWarenBestellNr = new javax.swing.JTextField();
        btnWarenEingangSpeichern = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestellungen = new javax.swing.JTable();
        btnAnzeigen = new javax.swing.JToggleButton();
        btnWareneingang = new javax.swing.JButton();

        tblBestellungBestellung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menge", "Artikel"
            }
        ));
        jScrollPane2.setViewportView(tblBestellungBestellung);

        lblBestellungBestellung.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblBestellungBestellung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBestellungBestellung.setText("Bestellung");

        lblBestellNr.setText("Bestellnummer:");

        txfBestellNr.setEditable(false);
        txfBestellNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBestellNrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diaBestellungLayout = new javax.swing.GroupLayout(diaBestellung.getContentPane());
        diaBestellung.getContentPane().setLayout(diaBestellungLayout);
        diaBestellungLayout.setHorizontalGroup(
            diaBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaBestellungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diaBestellungLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblBestellNr)
                        .addGap(18, 18, 18)
                        .addComponent(txfBestellNr))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(lblBestellungBestellung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        diaBestellungLayout.setVerticalGroup(
            diaBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaBestellungLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBestellungBestellung)
                .addGap(5, 5, 5)
                .addGroup(diaBestellungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBestellNr)
                    .addComponent(txfBestellNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        diaWareneingang.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                diaWareneingangWindowClosed(evt);
            }
        });

        tblWarenArtikel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menge", "Artikel", "Eingang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblWarenArtikel);

        lblWarenWareneingang.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblWarenWareneingang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarenWareneingang.setText("Wareneingang");

        lblWarenBestellNr.setText("Bestellnummer:");

        txfWarenBestellNr.setEditable(false);

        btnWarenEingangSpeichern.setText("Eingang speichern");
        btnWarenEingangSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarenEingangSpeichernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diaWareneingangLayout = new javax.swing.GroupLayout(diaWareneingang.getContentPane());
        diaWareneingang.getContentPane().setLayout(diaWareneingangLayout);
        diaWareneingangLayout.setHorizontalGroup(
            diaWareneingangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diaWareneingangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diaWareneingangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addComponent(lblWarenWareneingang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(diaWareneingangLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(diaWareneingangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(diaWareneingangLayout.createSequentialGroup()
                                .addComponent(btnWarenEingangSpeichern)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(diaWareneingangLayout.createSequentialGroup()
                                .addComponent(lblWarenBestellNr)
                                .addGap(18, 18, 18)
                                .addComponent(txfWarenBestellNr)))))
                .addContainerGap())
        );
        diaWareneingangLayout.setVerticalGroup(
            diaWareneingangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diaWareneingangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWarenWareneingang)
                .addGap(5, 5, 5)
                .addGroup(diaWareneingangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarenBestellNr)
                    .addComponent(txfWarenBestellNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWarenEingangSpeichern)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bestellungen");

        tblBestellungen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bestellnummer", "Lieferant"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBestellungen.getTableHeader().setReorderingAllowed(false);
        tblBestellungen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblBestellungenPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblBestellungen);

        btnAnzeigen.setText("anzeigen");
        btnAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnzeigenActionPerformed(evt);
            }
        });

        btnWareneingang.setText("Wareneingang");
        btnWareneingang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWareneingangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnWareneingang, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnzeigen, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnzeigen)
                    .addComponent(btnWareneingang))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnzeigenActionPerformed
//        tblBestellungen.clearSelection();
//        diaBestellung.setVisible(true);
        int selectZeile = tblBestellungen.getSelectedRow();
        if (selectZeile == -1) {
            JOptionPane.showMessageDialog(this, "keine Bestellung ausgewählt!");
        }
        else {
            diaBestellung.setVisible(true);
            diaBestellung.setSize(380, 590);
            txfBestellNr.setText(String.valueOf(selectZeile));
        }
    }//GEN-LAST:event_btnAnzeigenActionPerformed

    private void tblBestellungenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblBestellungenPropertyChange

    }//GEN-LAST:event_tblBestellungenPropertyChange

    private void btnWareneingangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWareneingangActionPerformed
        int selectZeile = tblBestellungen.getSelectedRow();
        if (selectZeile == -1) {
            JOptionPane.showMessageDialog(this, "keine Bestellung ausgewählt!");
        }
        else {
            diaWareneingang.setVisible(true);
            diaWareneingang.setSize(380, 590);
            txfWarenBestellNr.setText(String.valueOf(selectZeile));
            DefaultTableModel model = (DefaultTableModel) tblWarenArtikel.getModel();       //aktuelle Bestellungen in Tabelle anzeigen
            for (int i = 0; i < noDB.getBestellungListenNummer(selectZeile).getAnzahlArtikel(); i++) {
                model.addRow(new Object[]{noDB.getBestellungListenNummer(selectZeile).anzahlArtikel(i), noDB.getBestellungListenNummer(selectZeile).bestellterArtikel(i).getName(), 0});
            }
        }
    }//GEN-LAST:event_btnWareneingangActionPerformed

    private void txfBestellNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBestellNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBestellNrActionPerformed

    private void btnWarenEingangSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarenEingangSpeichernActionPerformed
        int bestellung = Integer.valueOf(txfWarenBestellNr.getText());
        System.out.println(bestellung);
        for (int i = 0; i < noDB.getBestellungListenNummer(bestellung).getAnzahlArtikel(); i++) {
            String strEingang = tblWarenArtikel.getModel().getValueAt(i, 2).toString();
            int intEingang = Integer.valueOf(strEingang);
            if (intEingang > 0) {
                noDB.getBestellungListenNummer(bestellung).artikelAngekommen(i, intEingang);
            }
            System.out.println(intEingang);
        }
        DefaultTableModel model = (DefaultTableModel) tblWarenArtikel.getModel();
        model.setRowCount(0);
        txfWarenBestellNr.setText("");
        diaWareneingang.setVisible(false);
    }//GEN-LAST:event_btnWarenEingangSpeichernActionPerformed

    private void diaWareneingangWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_diaWareneingangWindowClosed
        DefaultTableModel model = (DefaultTableModel) tblWarenArtikel.getModel();
        model.setRowCount(0);
        txfWarenBestellNr.setText("");
    }//GEN-LAST:event_diaWareneingangWindowClosed

    
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
            java.util.logging.Logger.getLogger(LagerBestellungenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LagerBestellungenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LagerBestellungenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LagerBestellungenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LagerBestellungenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAnzeigen;
    private javax.swing.JButton btnWarenEingangSpeichern;
    private javax.swing.JButton btnWareneingang;
    private javax.swing.JDialog diaBestellung;
    private javax.swing.JDialog diaWareneingang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBestellNr;
    private javax.swing.JLabel lblBestellungBestellung;
    private javax.swing.JLabel lblWarenBestellNr;
    private javax.swing.JLabel lblWarenWareneingang;
    private javax.swing.JTable tblBestellungBestellung;
    private javax.swing.JTable tblBestellungen;
    private javax.swing.JTable tblWarenArtikel;
    private javax.swing.JTextField txfBestellNr;
    private javax.swing.JTextField txfWarenBestellNr;
    // End of variables declaration//GEN-END:variables
}
