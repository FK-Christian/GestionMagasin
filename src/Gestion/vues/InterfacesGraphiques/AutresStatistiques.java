/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.vues.InterfacesGraphiques;
import Gestion.controllers.ClassMetiers.UtilisateurMetier;
import Gestion.utils.Graphique;
import Gestion.vues.Messages.LesDonnees;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JPanel;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class AutresStatistiques extends javax.swing.JFrame {

    private Graphique graphe1;
    private Graphique graphe2;

    public AutresStatistiques() {
        initComponents();
        placerstat();
    }
    
    public JPanel getContainer(){
        return this.container;
    }
    
    private void placerstat(){
        placerStat1();
        placerStat2();
    }
    
    private void placerStat1(){
        graphe1 = placerHistogramme(LesDonnees.getStat("prix_de_vente"),"VENTES","MONTANT DES VENTES");
        ChangerContenairePrincipal(stat1,graphe1);
    }
    
    private void placerStat2(){
        graphe2 = placerHistogramme(LesDonnees.getStat("benefices"),"BENEFICES","MONTANT DES BENEFICES");
        ChangerContenairePrincipal(stat2,graphe2);
    }
    
    private Graphique placerHistogramme(JSONObject info,String titre1,String ordonnee1){
        String titre = "REPARTITION DES "+titre1+" PAR MOIS ET PAR VENDEURS";
        String abscisse = "DATE ET VENDEURS";
        String ordonnee = ordonnee1;
        Color c = Color.white;
        boolean legende = true;
        ArrayList series = new ArrayList();
        ArrayList category = new ArrayList();
        ArrayList valeurs = new ArrayList();
        category.add("Janvier");
        category.add("Fevrier");
        category.add("Mars");
        category.add("Avril");
        category.add("Mai");
        category.add("Juin");
        category.add("Juillet");
        category.add("Aout");
        category.add("Septembre");
        category.add("Octobre");
        category.add("Novembre");
        category.add("Decembre");
        JSONObject json = info;
        Set cle = LesDonnees.lesusers.keySet();
        for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            series.add(((UtilisateurMetier)LesDonnees.lesusers.get(next)).getNom()+" "+((UtilisateurMetier)LesDonnees.lesusers.get(next)).getPrenom());
        }
        for (int i = 0; i < category.size(); i++) {
            for (int j = 0; j < series.size(); j++) {
                Object get = series.get(j);
                if(json.containsKey((i+1)+"--"+get)){
                    valeurs.add(Double.parseDouble(json.get((i+1)+"--"+get).toString()));
                }else{
                    valeurs.add(0.0);
                }
            }
        }
        return new Graphique(titre, abscisse, ordonnee, valeurs, c, series, category, legende);
    }
    
    private void ChangerContenairePrincipal(JPanel lastPanneau, JPanel newPanneau){
        lastPanneau.removeAll();
        lastPanneau.setLayout(new CardLayout(0,0));
        lastPanneau.add(newPanneau);
        repaint();
    }
    
    private void ChangeRadio(boolean m){
        if(m) {
            if(mois.isSelected()) annee.setSelected(false);
            else annee.setSelected(true);
        }else{
            if(annee.isSelected()) mois.setSelected(false);
            else mois.setSelected(true);
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

        container = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        stat1 = new javax.swing.JPanel();
        stat2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        moisComp = new javax.swing.JComboBox();
        AnnComp = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        moisVar = new javax.swing.JComboBox();
        mois = new javax.swing.JRadioButton();
        annee = new javax.swing.JRadioButton();
        annVar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        javax.swing.GroupLayout stat1Layout = new javax.swing.GroupLayout(stat1);
        stat1.setLayout(stat1Layout);
        stat1Layout.setHorizontalGroup(
            stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        stat1Layout.setVerticalGroup(
            stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1976, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Statistique de vente par utilisateur", stat1);

        javax.swing.GroupLayout stat2Layout = new javax.swing.GroupLayout(stat2);
        stat2.setLayout(stat2Layout);
        stat2Layout.setHorizontalGroup(
            stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
        );
        stat2Layout.setVerticalGroup(
            stat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1976, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Statistique de benefice", stat2);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Visalisation des clients stockés"));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton2.setText("VOIR liste des clients");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(846, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualisation des Fournisseurs stockés"));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton3.setText("VOIR liste des fournisseurs");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(847, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualisation des Utilisateurs stockés"));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton1.setText("VOIR liste des utilisateurs");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(847, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualisation des Dettes des clients"));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton5.setText("VOIR Dette des Clients");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton8.setText("VOIR Toutes les Ventes");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(773, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Comptabilite Mensuelle"));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton6.setText("Etat des stocks");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton7.setText("Comptabilite");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        moisComp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        moisComp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));

        AnnComp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AnnComp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AnnComp.setText("2016");
        AnnComp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(moisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnnComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnnComp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(773, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(879, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistique de vente Mensuelle/annuelle"));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Show.png"))); // NOI18N
        jButton4.setText("VOIR variantions");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        moisVar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        moisVar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));

        mois.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mois.setSelected(true);
        mois.setText("Mensuelle");
        mois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moisActionPerformed(evt);
            }
        });

        annee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        annee.setText("Annuelle");
        annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anneeActionPerformed(evt);
            }
        });

        annVar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        annVar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        annVar.setText("2016");
        annVar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mois)
                            .addComponent(moisVar, 0, 119, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(annee))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(annVar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mois)
                    .addComponent(annee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annVar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moisVar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(774, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);

        jTabbedPane1.addTab("Visualisation/Impression", jPanel1);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        String[] titre = {"Client","Telephone","Adress Mail"};
        Gestion.utils.Utils.impression("VegasClients_"+Gestion.utils.Utils.getCurrentTime()+".pdf",1,0);
//        Gestion.utils.Utils.impression(titre,"VegasClients_"+Gestion.utils.Utils.getDateActuel()+".pdf","LISTE DES CLIENTS PRESENTS",Gestion.utils.DataUtils.getEltToPrint(0,""));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        String[] titre = {"Fournisseur","Telephone","Adress Mail"};
        Gestion.utils.Utils.impression("VegasFournisseurs_"+Gestion.utils.Utils.getCurrentTime()+".pdf",2,0);
//        Gestion.utils.Utils.impression(titre,"VegasFournisseurs_"+Gestion.utils.Utils.getDateActuel()+".pdf","LISTE DES FOURNISSEURS PRESENTS",Gestion.utils.DataUtils.getEltToPrint(1,""));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String[] titre = {"Utilisateur ","Type","Telephone","Adress Mail"};
        Gestion.utils.Utils.impression("VegasUtilisateurs_"+Gestion.utils.Utils.getCurrentTime()+".pdf",3,0);
//        Gestion.utils.Utils.impression(titre,"VegasUtilisateurs_"+Gestion.utils.Utils.getDateActuel()+".pdf","LISTE DES UTILISATEURS PRESENTS",Gestion.utils.DataUtils.getEltToPrint(2,""));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        String[] titre = {"Client ","Telephone","Adress Mail","Montant total des Dettes"};
        Gestion.utils.Utils.impression("VegasClientDettes_"+Gestion.utils.Utils.getCurrentTime()+".pdf",6,0);
//        Gestion.utils.Utils.impression(titre,"VegasClientDettes_"+Gestion.utils.Utils.getDateActuel()+".pdf","LISTE DES DETTES PRESENTES",Gestion.utils.DataUtils.getEltToPrint(3,"")); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        String[] titre = {"Produit","Date Vente","Qte","Pu A","PU V","PRU V","Montant"};
        Gestion.utils.Utils.impression("VegasCompte_"+Gestion.utils.Utils.getCurrentTime()+".pdf",8,0);
//        Gestion.utils.Utils.impression(titre,"VegasCompte_"+Gestion.utils.Utils.getDateActuel()+".pdf","COMPTABILITE DU MOI DE LA DATE "+Gestion.utils.Utils.getDateActueloder(),Gestion.utils.DataUtils.getEltToPrint(4,Gestion.utils.Utils.getMoisActuel()));         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        String[] titre = {"Code","Produit","Categories","Qte"};
        Gestion.utils.Utils.impression("VegasStock_"+Gestion.utils.Utils.getCurrentTime()+".pdf",4,0);
//        Gestion.utils.Utils.impression(titre,"VegasStock_"+Gestion.utils.Utils.getDateActuel()+".pdf","ETAT DES STOCKS ",Gestion.utils.DataUtils.getEltToPrint(5,""));  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        String[] titre = {"Grande Categorie","Sous-Categorie","Nbre Produit Vendu"};
        Gestion.utils.Utils.impression("Vegasbilan_"+Gestion.utils.Utils.getCurrentTime()+".pdf",7,0);
//        Gestion.utils.Utils.impression(titre,"Vegasbilan_"+Gestion.utils.Utils.getDateActuel()+".pdf","BILAN DES VENTES "+n,Gestion.utils.DataUtils.getEltToPrint(6,m)); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//        String[] titre = {"Les Ventes"};
        Gestion.utils.Utils.impression("VegasAllVente_"+Gestion.utils.Utils.getCurrentTime()+".pdf",5,0);
//        Gestion.utils.Utils.impression(titre,"VegasAllVente_"+Gestion.utils.Utils.getDateActuel()+".pdf","VISUALISATION DES VENTES GLOBALES ",Gestion.utils.DataUtils.getEltToPrint(7,"")); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void moisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moisActionPerformed
        ChangeRadio(true);
    }//GEN-LAST:event_moisActionPerformed

    private void anneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anneeActionPerformed
        ChangeRadio(false);
    }//GEN-LAST:event_anneeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AnnComp;
    public static javax.swing.JTextField annVar;
    private javax.swing.JRadioButton annee;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JRadioButton mois;
    public static javax.swing.JComboBox moisComp;
    public static javax.swing.JComboBox moisVar;
    private javax.swing.JPanel stat1;
    private javax.swing.JPanel stat2;
    // End of variables declaration//GEN-END:variables
}
