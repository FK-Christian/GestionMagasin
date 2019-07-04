package Gestion.vues.InterfacesGraphiques;

import Notifications.Personne;
import Notifications.SMS_Message;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.json.simple.JSONObject;

/**
 *
 * @author FKC-Standard
 */
public class Notifications extends javax.swing.JFrame {

    private SMS_Message sms;
    private boolean testServeurSMS;
    private static JSONObject temp_contact;
    private static JSONObject les_contact;
    private static Vector les_contact_noms;
    /**
     * Creates new form Notifications
     */
    public Notifications() {
        initComponents();
        les_contact = new JSONObject();
        les_contact_noms = new Vector();
        temp_contact = new JSONObject();
        /****************************/
        Personne p1 = new Personne("Toto1","fr","123");
        Personne p2 = new Personne("Toto2","fr","124");
        Personne p3 = new Personne("Toto3","fr","125");
        Personne p4 = new Personne("Toto4","fr","126");
        Personne p5 = new Personne("Toto5","fr","127");
        temp_contact.put("Toto1",p1);
        temp_contact.put("Toto2",p2);
        temp_contact.put("Toto3",p3);
        temp_contact.put("Toto4",p4);
        temp_contact.put("Toto5",p5);
        JCheckBox[] t = new JCheckBox[5];
        t[0] = new JCheckBox("Toto1",false);
        t[1] = new JCheckBox("Toto2",false);
        t[2] = new JCheckBox("Toto3",false);
        t[3] = new JCheckBox("Toto4",false);
        t[4] = new JCheckBox("Toto5",false);
        SetCheckBoxToList(t,1);
        /****************************/
        testServeurSMS = false;
        sms = new SMS_Message();
        lancerserveur.setForeground(Color.GREEN);
        affiche.setText("SERVEUR: ............. : .....");
    }
    
    public JPanel getContainer(){
        return this.container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        menu1 = new java.awt.Menu();
        quitter = new java.awt.MenuItem();
        container = new javax.swing.JPanel();
        lared = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        vue = new javax.swing.JTextArea();
        affiche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        template = new javax.swing.JComboBox();
        testSMS = new javax.swing.JRadioButton();
        lancerserveur = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste_init = new Gestion.utils.CheckBoxList();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste_dest = new Gestion.utils.CheckBoxList();
        all2 = new javax.swing.JCheckBox();
        all1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("menu1");

        quitter.setLabel("Quitter");
        menu1.add(quitter);

        popupMenu1.add(menu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        container.setForeground(new java.awt.Color(204, 255, 255));

        lared.setBackground(new java.awt.Color(204, 204, 255));
        lared.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lared.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vue.setEditable(false);
        vue.setColumns(10);
        vue.setFont(new java.awt.Font("Perpetua Titling MT", 1, 9)); // NOI18N
        vue.setRows(5);
        vue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(vue);

        affiche.setEditable(false);
        affiche.setBackground(new java.awt.Color(255, 255, 255));
        affiche.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        affiche.setForeground(new java.awt.Color(0, 0, 204));
        affiche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        affiche.setText("SERVEUR:   127 . 0 . 0 . 1 : 254");
        affiche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setLabelFor(template);
        jLabel1.setText("TEMPLATE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JSONObject data = Gestion.utils.Utils.provider("Documents/parametres/templates.properties");
        template.setModel(new javax.swing.DefaultComboBoxModel(data.keySet().toArray()));
        template.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templateActionPerformed(evt);
            }
        });

        testSMS.setSelected(true);
        testSMS.setText("SMS / EMAIL ( pour SMS case cochée)");
        testSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testSMSActionPerformed(evt);
            }
        });

        lancerserveur.setBackground(new java.awt.Color(102, 102, 102));
        lancerserveur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lancerserveur.setText("RUN");
        lancerserveur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lancerserveur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancerserveurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(affiche, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lancerserveur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(template, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(affiche, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(lancerserveur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(template, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testSMS)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setLabelFor(message);
        jLabel2.setText("MESSAGE");

        message.setColumns(20);
        message.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        message.setForeground(new java.awt.Color(102, 102, 102));
        message.setRows(8);
        message.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(message);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Cancel.png"))); // NOI18N
        jButton3.setText("Annuler");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gestion/Images/Icons/Ok.png"))); // NOI18N
        jButton4.setText("Envoyer");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        liste_init.setBackground(new java.awt.Color(204, 255, 255));
        liste_init.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        liste_init.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(liste_init);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "les Fournisseurs", "les Utilisateurs", "les Clients", "Tous les contacts" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(liste_dest);
        jLabel3.setText("Envoyer à :");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText(">>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        liste_dest.setBackground(new java.awt.Color(204, 255, 255));
        liste_dest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        liste_dest.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(liste_dest);

        all2.setText("ALL");
        all2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                all2MouseReleased(evt);
            }
        });

        all1.setText("ALL");
        all1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                all1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(all2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addGap(55, 55, 55)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(all1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2)))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lared.addTab("NOTIFICATIONS", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        lared.addTab("CONFIG", jPanel2);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lared, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lared)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        deplacer(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void testSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testSMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testSMSActionPerformed

    private void lancerserveurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancerserveurActionPerformed
        runORstopServeur();
    }//GEN-LAST:event_lancerserveurActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        envoyer();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void templateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_templateActionPerformed
        getModel();
    }//GEN-LAST:event_templateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deplacer(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void all2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all2MouseReleased
        selectALL(false);
    }//GEN-LAST:event_all2MouseReleased

    private void all1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all1MouseReleased
        selectALL(true);
    }//GEN-LAST:event_all1MouseReleased

    private void construireMessage(){
        if(testSMS.isSelected()){
            sms = new SMS_Message();
            sms.setMessage(message.getText());
            sms.setDestinataires(getDestinataires());
            sms.setPort(Integer.parseInt(Gestion.utils.Utils.provider("Documents/parametres/param.properties").get("port").toString()));
            sms.setServerAddr((String) Gestion.utils.Utils.provider("Documents/parametres/param.properties").get("serveurAdress"));
        }else{
            // MAIL
        }
    }
    
    private void envoyer(){
        if(testSMS.isSelected()){
            construireMessage();
            sms.sentMessage(sms.EncapsulerSMS());
        }
    }
    
    private JSONObject getDestinataires(){
        JSONObject des = new JSONObject();
        JSONObject des_SIM1 = new JSONObject();
        JSONObject des_SIM2 = new JSONObject();
        JSONObject des_ODERS = new JSONObject();
        if(testSMS.isSelected()){
            for (int i = 0; i < liste_dest.getModel().getSize(); i++) {
                String m = ((JCheckBox)liste_dest.getModel().getElementAt(i)).getText();
                Personne pers = (Personne) les_contact.get(m);
                String tel_sim1 = formateNumTel(pers.getTels(),1);
                String tel_sim2 = formateNumTel(pers.getTels(),2);
                String tel_oders = formateNumTel(pers.getTels(),3);
                if(!tel_sim1.isEmpty() && tel_sim1 != null){
                    des_SIM1.put(i,tel_sim1);
                }
                if(!tel_sim2.isEmpty() && tel_sim2 != null){
                    des_SIM2.put(i,tel_sim2);
                }
                if(!tel_oders.isEmpty() && tel_oders != null){
                    des_ODERS.put(i,tel_oders);
                }
            }
            des.put(1,des_SIM1);
            des.put(2,des_SIM2);
            des.put(3,des_ODERS);
        }else{
            // MAIL
        }
        return des;
    }
    
    /**
     * @param numTel
     * @return correction format telephonique
     * classer par sim (1,2,3)
     */
    private String formateNumTel(String numTel,int typeSIM){
        return "Merci FKC";
    }
    
    private void runORstopServeur(){
        if(!testServeurSMS){
            sms.setPort(Integer.parseInt(Gestion.utils.Utils.provider("Documents/parametres/param.properties").get("port").toString()));
            sms.runServeur();
            lancerserveur.setText("STOP");
            lancerserveur.setForeground(Color.red);
            testServeurSMS = true;
            try {
                InetAddress host_address = InetAddress.getLocalHost();
                affiche.setText("SERVEUR: "+host_address.getHostAddress()+" : "+sms.getport());
            } catch (UnknownHostException ex) {
                Logger.getLogger(Notifications.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            sms.stopServeur();
            affiche.setText("SERVEUR: ............. : .....");
            sms.setServerAddr("127.0.0.1");
            sms.setDestinataires(null);
            sms.setMessage("----- SERVEUR STOP ----------");
            sms.sentMessage(sms.EncapsulerSMS());
            lancerserveur.setText("RUN");
            lancerserveur.setForeground(Color.GREEN);
            testServeurSMS = false;
        }
    }
    
    private void initTemplate(){
        JSONObject data = Gestion.utils.Utils.provider("Documents/parametres/templates.properties");
        template.setModel(new javax.swing.DefaultComboBoxModel(
            data.keySet().toArray()
        ));
    }
    
    private void getModel(){
        message.setText(Gestion.utils.Utils.provider("Documents/parametres/templates.properties").get((String)template.getSelectedItem()).toString());
    }
    
    private void SetCheckBoxToList(JCheckBox[] checks, int listeNumero){
        switch(listeNumero){
            case 1:
                liste_init.setModel(new javax.swing.AbstractListModel() {
                    JCheckBox[] strings = checks;
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
            break;
            case 2:
                liste_dest.setModel(new javax.swing.AbstractListModel() {
                    JCheckBox[] strings = checks;
                    public int getSize() { return strings.length; }
                    public Object getElementAt(int i) { return strings[i]; }
                });
            break;
        }
    }
    
    private void deplacer(boolean source) {
        if(source){
            for (int i = 0; i < liste_init.getModel().getSize(); i++) {
                if(((JCheckBox)liste_init.getModel().getElementAt(i)).isSelected()){
                    String m = ((JCheckBox)liste_init.getModel().getElementAt(i)).getText();
                    if(!les_contact_noms.contains(m)) les_contact_noms.add(m);
                    les_contact.put(((JCheckBox)liste_init.getModel().getElementAt(i)).getText(),temp_contact.get(((JCheckBox)liste_init.getModel().getElementAt(i)).getText()));
                }
            }
        }else{
            for (int i = 0; i < liste_dest.getModel().getSize(); i++) {
                if(((JCheckBox)liste_dest.getModel().getElementAt(i)).isSelected()){
                    les_contact_noms.remove(((JCheckBox)liste_dest.getModel().getElementAt(i)).getText());
                    les_contact.remove(((JCheckBox)liste_dest.getModel().getElementAt(i)).getText());
                }
            }  
        }
        mettreAjourListeDestinataire();
    }
    
    private void mettreAjourListeDestinataire(){
        JCheckBox[] j = new JCheckBox[les_contact_noms.size()];
        for (int i = 0; i < les_contact_noms.size(); i++) {
            j[i] = new JCheckBox(les_contact_noms.elementAt(i).toString(),false);
        }
        SetCheckBoxToList(j,2);
    }
    
    private void selectALL(boolean liste_initiale){
        if(liste_initiale){
            for (int i = 0; i < liste_init.getModel().getSize(); i++) {
                ((JCheckBox)liste_init.getModel().getElementAt(i)).setSelected(all1.isSelected());
            }
            liste_init.repaint();
        }else{
            for (int i = 0; i < liste_dest.getModel().getSize(); i++) {
                ((JCheckBox)liste_dest.getModel().getElementAt(i)).setSelected(all2.isSelected());
            }
            liste_dest.repaint();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Notifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notifications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField affiche;
    private javax.swing.JCheckBox all1;
    private javax.swing.JCheckBox all2;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton lancerserveur;
    private javax.swing.JTabbedPane lared;
    private javax.swing.JList liste_dest;
    private javax.swing.JList liste_init;
    private java.awt.Menu menu1;
    private javax.swing.JTextArea message;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.MenuItem quitter;
    private javax.swing.JComboBox template;
    private javax.swing.JRadioButton testSMS;
    public static javax.swing.JTextArea vue;
    // End of variables declaration//GEN-END:variables
}
