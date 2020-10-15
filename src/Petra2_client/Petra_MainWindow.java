/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petra2_client;

import java.net.*;
import java.io.*; 
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class Petra_MainWindow extends javax.swing.JFrame {
    Socket cliSock = null; /* Initialisations indispensables */
    DataInputStream dis=null;
    DataOutputStream dos=null; 
    String IP; int port;
    
    /**
     * Creates new form Petra_MainWindow
     */
    public Petra_MainWindow() {
        initComponents();
        this.jLabel_recu.setText("");
        this.jLabel_envoye.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonConv1 = new javax.swing.JRadioButton();
        jRadioButtonConv2 = new javax.swing.JRadioButton();
        jRadioButtonPlongeur = new javax.swing.JRadioButton();
        jRadioButtonVentouse = new javax.swing.JRadioButton();
        jRadioButtonChariot = new javax.swing.JRadioButton();
        jRadioButtonBras = new javax.swing.JRadioButton();
        jRadioButtonGrappin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_recu = new javax.swing.JLabel();
        jLabel_envoye = new javax.swing.JLabel();
        jTextField_serverPort = new javax.swing.JTextField();
        jTextField_serverIP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Deconnexion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Capteurs");

        jCheckBox2.setText("L2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("T");

        jCheckBox4.setText("S");

        jCheckBox5.setText("CS");

        jCheckBox6.setText("H");

        jCheckBox7.setText("AP");

        jCheckBox1.setText("PP");

        jCheckBox9.setText("DE");

        jLabel3.setText("Actuateurs");

        buttonGroup1.add(jRadioButtonConv1);
        jRadioButtonConv1.setText("Convoyeur 1");
        jRadioButtonConv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConv1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonConv2);
        jRadioButtonConv2.setText("Convoyeur 2");
        jRadioButtonConv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConv2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPlongeur);
        jRadioButtonPlongeur.setText("Plongeur");
        jRadioButtonPlongeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPlongeurActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonVentouse);
        jRadioButtonVentouse.setText("Ventouse");
        jRadioButtonVentouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVentouseActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonChariot);
        jRadioButtonChariot.setText("Chariot");
        jRadioButtonChariot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonChariotActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonBras);
        jRadioButtonBras.setText("Bras");
        jRadioButtonBras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBrasActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonGrappin);
        jRadioButtonGrappin.setText("Grappin");
        jRadioButtonGrappin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGrappinActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petra2_client/petra.png"))); // NOI18N

        jButtonConnect.setText("Connexion au serveur");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jLabel1.setText("Reçu:");

        jLabel5.setText("Envoyé:");

        jLabel_recu.setText("[data]");

        jLabel_envoye.setText("[data]");

        jTextField_serverPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_serverPortFocusLost(evt);
            }
        });

        jTextField_serverIP.setText("10.59.40.64");
        jTextField_serverIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_serverIPFocusLost(evt);
            }
        });

        jLabel6.setText("IP du serveur:");

        jLabel7.setText("Port:");

        jButton_Deconnexion.setText("Déconnexion");
        jButton_Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(701, 701, 701))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonConv1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonConv2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonPlongeur)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonVentouse)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonChariot)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonBras)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonGrappin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel_recu)
                                    .addComponent(jLabel_envoye)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_serverIP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Deconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConnect))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonConv1)
                            .addComponent(jRadioButtonConv2)
                            .addComponent(jRadioButtonPlongeur)
                            .addComponent(jRadioButtonVentouse)
                            .addComponent(jRadioButtonChariot)
                            .addComponent(jRadioButtonBras)
                            .addComponent(jRadioButtonGrappin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox5)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox7)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_recu)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_envoye)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_serverIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_serverPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Deconnexion)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        try
        {
            cliSock = new Socket(IP, port);
            System.out.println(cliSock.getInetAddress().toString());
            dis = new DataInputStream(cliSock.getInputStream());
            dos = new DataOutputStream(cliSock.getOutputStream());
        }
        catch (UnknownHostException e)
        {
            System.err.println("Erreur ! Host non trouvé [" + e + "]");
        }
        catch (IOException e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e + "]");
        } 
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jRadioButtonConv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConv1ActionPerformed
        try
        {
            sendMsg(1);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonConv1ActionPerformed

    private void jRadioButtonConv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConv2ActionPerformed
        try
        {
            sendMsg(2);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonConv2ActionPerformed

    private void jRadioButtonPlongeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPlongeurActionPerformed
        try
        {
            sendMsg(3);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonPlongeurActionPerformed

    private void jRadioButtonVentouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVentouseActionPerformed
        try
        {
            sendMsg(4);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonVentouseActionPerformed

    private void jRadioButtonChariotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonChariotActionPerformed
        try
        {
            sendMsg(5);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonChariotActionPerformed

    private void jRadioButtonBrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBrasActionPerformed
        try
        {
            sendMsg(6);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonBrasActionPerformed

    private void jRadioButtonGrappinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGrappinActionPerformed
        try
        {
            sendMsg(7);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jRadioButtonGrappinActionPerformed

    private void jTextField_serverIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_serverIPFocusLost
        try
        {
            IP = this.jTextField_serverIP.getText();
            System.out.println("IP: " + IP);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jTextField_serverIPFocusLost

    private void jTextField_serverPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_serverPortFocusLost
        try
        {
            port = Integer.valueOf(this.jTextField_serverPort.getText());
            System.out.println("Port: " + port);
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jTextField_serverPortFocusLost

    private void jButton_DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeconnexionActionPerformed
        try
        {
            sendMsg(8);
        }
        catch(Exception e)
        {
            System.err.println("Erreur ! Pas de connexion ? [" + e.getMessage() + "]");
        }
    }//GEN-LAST:event_jButton_DeconnexionActionPerformed

    public void sendMsg(int num)
    {
        try
        {
            this.jLabel_envoye.setText(String.valueOf(num));
            //dos.write(num.getBytes()); dos.flush();
            dos.writeByte(num); dos.flush();
        }
        catch (IOException e)
        {
            System.err.println("Erreur de communication ? [" + e + "]");
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
            java.util.logging.Logger.getLogger(Petra_MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petra_MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petra_MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petra_MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Petra_MainWindow().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButton_Deconnexion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_envoye;
    private javax.swing.JLabel jLabel_recu;
    private javax.swing.JRadioButton jRadioButtonBras;
    private javax.swing.JRadioButton jRadioButtonChariot;
    private javax.swing.JRadioButton jRadioButtonConv1;
    private javax.swing.JRadioButton jRadioButtonConv2;
    private javax.swing.JRadioButton jRadioButtonGrappin;
    private javax.swing.JRadioButton jRadioButtonPlongeur;
    private javax.swing.JRadioButton jRadioButtonVentouse;
    private javax.swing.JTextField jTextField_serverIP;
    private javax.swing.JTextField jTextField_serverPort;
    // End of variables declaration//GEN-END:variables
}
