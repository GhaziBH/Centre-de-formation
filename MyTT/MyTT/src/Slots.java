
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatma_boulabed
 */
public class Slots extends javax.swing.JInternalFrame {

    
    
    /**
     * Creates new form Slots
     */
    gestion_des_equipements_voix con=new gestion_des_equipements_voix();
    public Slots() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JLabel();
        txt_type = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_numero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JTextNomSlot = new javax.swing.JTextField();
        jTextTypeSlot = new javax.swing.JTextField();
        jTextDate = new javax.swing.JTextField();
        jTextNumeroSlot = new javax.swing.JTextField();
        jTextIdSlot = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("     Slots");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 255)));

        txt_nom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_nom.setText("Nom de Slot");

        txt_type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_type.setText("Type de slot");

        txt_date.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_date.setText("Date");

        txt_numero.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_numero.setText("Numero de Slot");

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ghazi\\Desktop\\add.png")); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JTextNomSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNomSlotActionPerformed(evt);
            }
        });

        jTextTypeSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTypeSlotActionPerformed(evt);
            }
        });

        jTextDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDateActionPerformed(evt);
            }
        });

        jTextNumeroSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroSlotActionPerformed(evt);
            }
        });

        jTextIdSlot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextIdSlotMouseClicked(evt);
            }
        });
        jTextIdSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdSlotActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID SLOT");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText(" MSAN");

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modify.png"))); // NOI18N
        jButton2.setText("Modifier");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/delete.png"))); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ghazi\\Desktop\\consulter.png")); // NOI18N
        jButton4.setText("Consulter");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titre 1", "Titre 2", "Titre 3", "Titre 4", "Titre 5", "Titre 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jTextIdSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nom)
                            .addComponent(txt_type)
                            .addComponent(txt_date)
                            .addComponent(txt_numero)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextNumeroSlot, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTypeSlot, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(JTextNomSlot, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextIdSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(txt_date)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_numero)
                                    .addComponent(jTextNumeroSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextNomSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nom))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextTypeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_type))
                                .addGap(18, 18, 18)
                                .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Slot slot=this.getSlot();
        try{String sql="INSERT INTO `slots` ( `id slots`, `nom slot`, `type slot`, `id msan`, `date`, `numero slot`) VALUES ('"+slot.idslots+"','"+slot.nomslot+"','"+slot.typeslot+"','"+slot.idmsan+"','"+slot.date+"','"+slot.numeroslot+"');";
           // BD_Connect bd=new BD_Connect();
            //boolean result=bd.test_char(500, 800);
            //System.out.println("   comparaison 500 et   800 "+ result);
    
          //  con.Connection_BD(sql);
          
           
   
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class for name    okokokok");
            Connection con1 = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_des_equipements_voix","root","");
            System.out.println("connection retablie");
             PreparedStatement pst = (PreparedStatement) con1.prepareStatement(sql);
                pst.execute();
            System.out.println("sql ok    okokokok      sql  =    "+ sql);
              

            
     //       pst.setString(1,txt_nom.getText());
      //     pst.setString(2,txt_type.getText());
      //      pst.setString(3,txt_date.getText());
      //      pst.setString(4,txt_numero.getText());
            
            
                    
                    
                    
                    
         //   pst.execute();
            JOptionPane.showMessageDialog(null,"saved");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTextNomSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNomSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNomSlotActionPerformed

    private void jTextIdSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdSlotActionPerformed

    private void jTextDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextDateActionPerformed

    private void jTextNumeroSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroSlotActionPerformed

    private void jTextTypeSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTypeSlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTypeSlotActionPerformed

    private void jTextIdSlotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextIdSlotMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdSlotMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
public Slot getSlot(){
        try {
            Slot slt= new Slot();
            DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
            slt.idslots= Integer.parseInt(this.jTextIdSlot.getText());
            slt.idmsan= (this.jComboMSAN.getItemCount());
            slt.date= df.parse(this.jTextDate.getText());
            slt.nomslot=this.JTextNomSlot.getText();
            slt.numeroslot=Integer.parseInt(this.jTextNumeroSlot.getText());
            slt.typeslot=this.jTextTypeSlot.getText();
            
            return slt;
        } catch (ParseException ex) {
            Logger.getLogger(Slots.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextNomSlot;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDate;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextIdSlot;
    private javax.swing.JTextField jTextNumeroSlot;
    private javax.swing.JTextField jTextTypeSlot;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_nom;
    private javax.swing.JLabel txt_numero;
    private javax.swing.JLabel txt_type;
    // End of variables declaration//GEN-END:variables
}
