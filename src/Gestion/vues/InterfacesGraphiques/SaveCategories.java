/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.vues.InterfacesGraphiques;

import Gestion.controllers.ClassMetiers.GcategorieMetier;
import Gestion.passerelle.Passerelle;
import Gestion.vues.Messages.LesDonnees;
import java.awt.Color;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONObject;

/**
 *
 * @author christian
 */
public class SaveCategories extends javax.swing.JDialog {
    private boolean aPusauvegarder;
    private JSONObject requette;
    private JSONObject messageTosend;
    private JSONObject retour;
    private boolean peutSupprimer;
    private GcategorieMetier categorie;
    private Passerelle passerelle;
    /**
     * Creates new form SaveCategories
     * @param parent
     */
    public SaveCategories(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        requette = new JSONObject();
        messageTosend = new JSONObject();
        peutSupprimer=false;
        aPusauvegarder = false;
        placerTableau(LesDonnees.lesGcategories);
        categorie = new GcategorieMetier();
    }

    public boolean isaPusauvegarder() {
        return aPusauvegarder;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        message = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nouvelle categorie");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Categorie");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Description");

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Ok.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        message.setEditable(false);
        message.setBackground(new java.awt.Color(255, 255, 255));
        message.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tableau.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Categorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableau);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(message)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(designation)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 417, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(designation, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauMouseClicked
        ActionTableau();
    }//GEN-LAST:event_tableauMouseClicked
    
    private boolean testVide(){
        return designation.getText().isEmpty();
    }
    
    private void afficheMessage(String m,int type){
        switch(type){
            case 0:
                message.setForeground(Color.BLACK);
            break;
            case 1:
                message.setForeground(Color.orange);
            break;
            case 2:
                message.setForeground(Color.green);
            break;
            case 3:
                message.setForeground(Color.red);
            break;
        }
        message.setText(m);
    }
    
    private void initAllData(String[] data){
        designation.setText(data[0]);
        description.setText(data[1]);
    }
    
    private void recupererData(){
        categorie.setDescription(description.getText());
        categorie.setNom(designation.getText());
    }
    
    private void save(){
        if(testVide()){
            afficheMessage("La designation doit etre non vide !!!",1);
        }else{
           categorie.setDescription(description.getText());
           categorie.setNom(designation.getText());
           messageTosend.put("1",categorie);
           requette.put("message",messageTosend);
           if(peutSupprimer) requette.put("action",39);
           else requette.put("action",38);
           requette.put("user",PageDeLogin.currentUser);
           passerelle = new Passerelle(requette);
           retour = passerelle.ForwardQuery();
           if(retour.get("code").equals("0")){
               peutSupprimer = false;
               categorie = new GcategorieMetier();
               afficheMessage(Gestion.vues.Messages.MessagePasserelle.success_ajoutcategorie,2);
               aPusauvegarder = true;
               LesDonnees.initData(2);
               placerTableau(LesDonnees.lesGcategories);
               String[] d = {"",""};
               initAllData(d);
           }else{
               afficheMessage(Gestion.vues.Messages.MessagePasserelle.erreur_ajoutcategorie,3);
           }
        }
    }
    
    private void placerTableau(JSONObject data){
        Set cle = data.keySet();
        Object[][] donnee = new Object[data.size()][1];
        int i = 0;
        for (Iterator iterator = cle.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            donnee[i][0] = ((GcategorieMetier)data.get(next)).getNom();
            i++;
        }
        tableau.setModel(new javax.swing.table.DefaultTableModel(donnee,new String [] {"Categorie"}){
            boolean[] canEdit = new boolean [] {
                false
            };
        });
    }
    
    private void ActionTableau(){
       int n = tableau.getSelectedRow();
       String m = tableau.getValueAt(n,0).toString();
       categorie = ((GcategorieMetier)LesDonnees.lesGcategories.get(m));
       peutSupprimer = true;
       String[] data = new String[2];
       data[0] = categorie.getNom();
       data[1] = categorie.getDescription();
       initAllData(data);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea description;
    private javax.swing.JTextField designation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField message;
    private javax.swing.JTable tableau;
    // End of variables declaration//GEN-END:variables
}
