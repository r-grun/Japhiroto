/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import java.awt.Graphics2D;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas.hrubec
 */
public class Marktleiter_GUI extends javax.swing.JFrame {
    
    private Graphics2D diagram;
    private int sizeX; // =500
    private int sizeY; // =400
    private int zeroX = sizeX;
    private int zeroY = sizeY;
    
    private DB_Verbindung database;
          
    /**
     * Creates new form Marktleiter_GUI
     * @throws java.io.IOException
     */
    public Marktleiter_GUI() throws IOException {
        initComponents();
        
        diagram = (Graphics2D)cvDrawField.getGraphics();
        sizeX = cvDrawField.getWidth();
        sizeY = cvDrawField.getHeight();
                        
        //set zero
        // sizeX = 500, sizeY = 400
        // zeroX = 25;
        // zeroY = 370;
               
        zeroX = sizeX - 475;
        zeroY = sizeY - 30;
        
        
        try {
            database = new DB_Verbindung();
            database.verbindungAufbauen();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Could not establish connection to the database", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
                          
    }
    
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.setFont(new Font("Dialog", Font.PLAIN, 18));
//        g.setColor(Color.BLUE);
//        g.drawString("Hallo Welt", 100,400);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblUmsatz = new javax.swing.JLabel();
        lblMitarbeiter = new javax.swing.JLabel();
        lblAuswahl = new javax.swing.JLabel();
        scrlPanAuswahl = new javax.swing.JScrollPane();
        jListEmployees = new javax.swing.JList<>();
        txfMitarbeiterID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblVorname = new javax.swing.JLabel();
        txfVorname = new javax.swing.JTextField();
        txfNachname = new javax.swing.JTextField();
        lblNachname = new javax.swing.JLabel();
        ComBoxDatumVon = new javax.swing.JComboBox<>();
        lblDatumauswahl = new javax.swing.JLabel();
        lblDatumVon = new javax.swing.JLabel();
        lblDatumBis = new javax.swing.JLabel();
        ComBoxDatumBis = new javax.swing.JComboBox<>();
        btnShowSales = new javax.swing.JButton();
        btnWarehouseList = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        lblStatusBestellungen = new javax.swing.JLabel();
        txfBestellt = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        lblBestellt = new javax.swing.JLabel();
        txfVerschickt = new javax.swing.JTextField();
        lblVerschickt = new javax.swing.JLabel();
        txfInBearb = new javax.swing.JTextField();
        lblInBearb = new javax.swing.JLabel();
        lblAnrede = new javax.swing.JLabel();
        txfAnrede = new javax.swing.JTextField();
        txfStrasse = new javax.swing.JTextField();
        lblStarsse = new javax.swing.JLabel();
        txfHausNr = new javax.swing.JTextField();
        lblHausNr = new javax.swing.JLabel();
        txfPLZ = new javax.swing.JTextField();
        lblPLZ = new javax.swing.JLabel();
        txfOrt = new javax.swing.JTextField();
        lblOrt = new javax.swing.JLabel();
        txfStundenlohn = new javax.swing.JTextField();
        lblStundenlohn = new javax.swing.JLabel();
        txfRolle = new javax.swing.JTextField();
        lblRolle = new javax.swing.JLabel();
        cvDrawField = new java.awt.Canvas();
        btnLoadList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblUmsatz.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUmsatz.setText("Umsatz- und Warenverwaltung");

        lblMitarbeiter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMitarbeiter.setText("Mitarbeiterverwaltung");

        lblAuswahl.setText("Auswahl");

        scrlPanAuswahl.setViewportView(jListEmployees);

        lblID.setText("Mitarbeiter ID");

        lblVorname.setText("Vorname");

        txfVorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfVornameActionPerformed(evt);
            }
        });

        lblNachname.setText("Nachname");

        ComBoxDatumVon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDatumauswahl.setText("Datumauswahl");

        lblDatumVon.setText("Von:");

        lblDatumBis.setText("Bis:");

        ComBoxDatumBis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComBoxDatumBis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComBoxDatumBisActionPerformed(evt);
            }
        });

        btnShowSales.setText("Umsatz Anzeigen");
        btnShowSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSalesActionPerformed(evt);
            }
        });

        btnWarehouseList.setText("Lager Anzeigen");
        btnWarehouseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarehouseListActionPerformed(evt);
            }
        });

        btnOrders.setText("Bestellungen Anzeigen");
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        lblStatusBestellungen.setText("Status offener Bestellungen:");

        txfBestellt.setText("Anzahl");

        btnPrint.setText("<html>  Aktuelle<br />Darstellung<br />  Drucken</html>");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblBestellt.setText("Bestellt:");

        txfVerschickt.setText("Anzahl");
        txfVerschickt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfVerschicktActionPerformed(evt);
            }
        });

        lblVerschickt.setText("Verschickt:");

        txfInBearb.setText("Anzahl");
        txfInBearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfInBearbActionPerformed(evt);
            }
        });

        lblInBearb.setText("In Bearbeitung:");

        lblAnrede.setText("Anrede");

        lblStarsse.setText("Strasse");

        txfHausNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfHausNrActionPerformed(evt);
            }
        });

        lblHausNr.setText("Haus Nr.");

        lblPLZ.setText("PLZ");

        lblOrt.setText("Ort");

        lblStundenlohn.setText("Stundenlohn");

        lblRolle.setText("Rolle");

        cvDrawField.setBackground(new java.awt.Color(255, 255, 255));

        btnLoadList.setText("Liste Laden");
        btnLoadList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMitarbeiter, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(scrlPanAuswahl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAuswahl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoadList, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStundenlohn)
                                    .addComponent(txfStundenlohn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRolle)
                                    .addComponent(txfRolle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txfMitarbeiterID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txfAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVorname)
                                    .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNachname)
                                    .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStarsse)
                                    .addComponent(txfStrasse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHausNr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txfHausNr, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPLZ)
                                    .addComponent(txfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrt)
                                    .addComponent(txfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID)
                                .addGap(18, 18, 18)
                                .addComponent(lblAnrede))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPrint, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblStatusBestellungen)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblBestellt)
                                                    .addComponent(lblVerschickt)
                                                    .addComponent(lblInBearb))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txfBestellt)
                                                    .addComponent(txfVerschickt)
                                                    .addComponent(txfInBearb)))))
                                    .addComponent(btnOrders, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWarehouseList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnShowSales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComBoxDatumBis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDatumauswahl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblDatumVon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDatumBis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComBoxDatumVon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(lblUmsatz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvDrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUmsatz)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnShowSales)
                                    .addComponent(lblDatumauswahl))
                                .addGap(20, 20, 20)
                                .addComponent(btnWarehouseList)
                                .addGap(20, 20, 20)
                                .addComponent(btnOrders))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDatumVon)
                                    .addGap(73, 73, 73))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ComBoxDatumVon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(ComBoxDatumBis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(lblDatumBis))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(lblStatusBestellungen)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBestellt)
                            .addComponent(txfBestellt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfVerschickt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVerschickt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfInBearb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInBearb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cvDrawField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMitarbeiter)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoadList)
                            .addComponent(lblAuswahl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrlPanAuswahl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVorname)
                            .addComponent(lblNachname)
                            .addComponent(lblStarsse)
                            .addComponent(lblHausNr)
                            .addComponent(lblPLZ)
                            .addComponent(lblOrt)
                            .addComponent(lblAnrede)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfStrasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfHausNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfAnrede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfMitarbeiterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRolle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfRolle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStundenlohn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfStundenlohn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfVornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfVornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfVornameActionPerformed

    private void ComBoxDatumBisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComBoxDatumBisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComBoxDatumBisActionPerformed

    private void btnWarehouseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarehouseListActionPerformed
        // TODO add your handling code here:
        new LagerArtikelSuchen().setVisible(true);
    }//GEN-LAST:event_btnWarehouseListActionPerformed

    private void txfVerschicktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfVerschicktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfVerschicktActionPerformed

    private void txfInBearbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfInBearbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfInBearbActionPerformed

    private void txfHausNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfHausNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfHausNrActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        // Lager BestellungenGUI aufrufen
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
                new LagerBestellungenGUI().setVisible(true);
//            }
//        });           
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnShowSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSalesActionPerformed
        // TODO add your handling code here:
        drawSales();
    }//GEN-LAST:event_btnShowSalesActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnLoadListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadListActionPerformed
        // TODO add your handling code here:             
        DefaultListModel list = new DefaultListModel();
        jListEmployees.setModel(list);        
        list.addElement("Liste Aller Mitarbeiter: ");

        int emplNumber = 0;
        Mitarbeiter[] employeesList;
        
        try {
            emplNumber = database.getNumberOfEmployees();
        } catch (SQLException ex) {
            Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at: database.getNumberOfEmployees() "
                    + "\n LocalizedMessage:  " + ex.getLocalizedMessage() + "\n Message: " + ex.getMessage() 
                    + "\n String: " + ex.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        employeesList = new Mitarbeiter[emplNumber];
        

        try {
            employeesList = database.getAllEmployeesArray();
        } catch (SQLException ex) {
            Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error at: database.getAllEmployeesArray() " 
                    + "\n LocalizedMessage:  " + ex.getLocalizedMessage() + "\n Message: " + ex.getMessage() 
                    + "\n String: " + ex.toString(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        for (int i = 0; i < employeesList.length; i++) {
            list.addElement(employeesList[i].getAnrede() + " " + employeesList[i].getVorname() + " " + employeesList[i].getNachname());
        }    
        
        // Employee data in txf
        
        try {        
            txfMitarbeiterID.setText(Integer.toString(database.mitarbeiterAbfragen(1).getMitarbeiterId()));
            txfAnrede.setText(database.mitarbeiterAbfragen(1).getAnrede());
            txfVorname.setText(database.mitarbeiterAbfragen(1).getVorname());
            txfNachname.setText(database.mitarbeiterAbfragen(1).getNachname());
            txfStrasse.setText(database.mitarbeiterAbfragen(1).getStrasse());
            txfHausNr.setText(Integer.toString(database.mitarbeiterAbfragen(1).getHausNr()));
            txfPLZ.setText(Integer.toString(database.mitarbeiterAbfragen(1).getPlz()));
            txfOrt.setText(database.mitarbeiterAbfragen(1).getOrt());
            txfStundenlohn.setText(Double.toString(database.mitarbeiterAbfragen(1).getStundenLohn()));
//            txfRolle.setText(database.mitarbeiterAbfragen(1).getRolle());
        } catch (SQLException ex) {
            Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLoadListActionPerformed

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
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marktleiter_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Marktleiter_GUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Marktleiter_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void drawSales(){  
        //testline
//        diagram.drawLine(zeroX, zeroY, sizeX, 0);    
                
        // draw axes        
        diagram.drawLine(zeroX - 10, zeroY, sizeX - 15, zeroY);
        diagram.drawLine(zeroX, sizeY - 385, zeroX, sizeY - 15);
        
        
        // draw scale 
        // X-axis
        for (int i = 1; i < sizeX/20 - 2; i++) {
            diagram.drawLine(zeroX + i*20, zeroY - 5, zeroX + i*20, zeroY + 5);
            diagram.drawString(""+i, zeroX + i*20 - 3, zeroY + 20);            
        }
        
        // Y-axis
        for (int i = 1; i < sizeY/20 - 2; i++) {
            diagram.drawLine(zeroX - 5, zeroY - i*20, zeroX + 5, zeroY - i*20);
            diagram.drawString(""+i, zeroX - 20, zeroY - i*20 + 5);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBoxDatumBis;
    private javax.swing.JComboBox<String> ComBoxDatumVon;
    private javax.swing.JButton btnLoadList;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnShowSales;
    private javax.swing.JButton btnWarehouseList;
    private java.awt.Canvas cvDrawField;
    private javax.swing.JList<String> jListEmployees;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnrede;
    private javax.swing.JLabel lblAuswahl;
    private javax.swing.JLabel lblBestellt;
    private javax.swing.JLabel lblDatumBis;
    private javax.swing.JLabel lblDatumVon;
    private javax.swing.JLabel lblDatumauswahl;
    private javax.swing.JLabel lblHausNr;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInBearb;
    private javax.swing.JLabel lblMitarbeiter;
    private javax.swing.JLabel lblNachname;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPLZ;
    private javax.swing.JLabel lblRolle;
    private javax.swing.JLabel lblStarsse;
    private javax.swing.JLabel lblStatusBestellungen;
    private javax.swing.JLabel lblStundenlohn;
    private javax.swing.JLabel lblUmsatz;
    private javax.swing.JLabel lblVerschickt;
    private javax.swing.JLabel lblVorname;
    private javax.swing.JScrollPane scrlPanAuswahl;
    private javax.swing.JTextField txfAnrede;
    private javax.swing.JTextField txfBestellt;
    private javax.swing.JTextField txfHausNr;
    private javax.swing.JTextField txfInBearb;
    private javax.swing.JTextField txfMitarbeiterID;
    private javax.swing.JTextField txfNachname;
    private javax.swing.JTextField txfOrt;
    private javax.swing.JTextField txfPLZ;
    private javax.swing.JTextField txfRolle;
    private javax.swing.JTextField txfStrasse;
    private javax.swing.JTextField txfStundenlohn;
    private javax.swing.JTextField txfVerschickt;
    private javax.swing.JTextField txfVorname;
    // End of variables declaration//GEN-END:variables
}
