/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfid;

import database.MySqlConnections;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alienware
 */
public class voting extends javax.swing.JFrame {

    static int Vot1 = 0;
    static int Vot2 = 0;
    protected String AN;

    /**
     * Creates new form voting
     */
    public voting() {

    }

    voting(String AccountSession) {
        initComponents();
        this.AN = AccountSession;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private void Select1(int level) {
        Vot1 = level;
        switch (level) {
            case 0:
                Ch0.setSelected(true);
                Ch1.setSelected(false);
                Ch2.setSelected(false);
                Ch3.setSelected(false);
                Ch4.setSelected(false);
                break;
            case 1:
                Ch0.setSelected(true);
                Ch1.setSelected(true);
                Ch2.setSelected(false);
                Ch3.setSelected(false);
                Ch4.setSelected(false);
                break;
            case 2:
                Ch0.setSelected(true);
                Ch1.setSelected(true);
                Ch2.setSelected(true);
                Ch3.setSelected(false);
                Ch4.setSelected(false);
                break;
            case 3:
                Ch0.setSelected(true);
                Ch1.setSelected(true);
                Ch2.setSelected(true);
                Ch3.setSelected(true);
                Ch4.setSelected(false);
                break;
            case 4:
                Ch0.setSelected(true);
                Ch1.setSelected(true);
                Ch2.setSelected(true);
                Ch3.setSelected(true);
                Ch4.setSelected(true);
                break;
        }
    }

    private void Select2(int level) {
        Vot2 = level;
        switch (level) {
            case 0:
                Chv1.setSelected(true);
                Chv2.setSelected(false);
                Chv3.setSelected(false);
                Chv4.setSelected(false);
                Chv5.setSelected(false);
                break;
            case 1:
                Chv1.setSelected(true);
                Chv2.setSelected(true);
                Chv3.setSelected(false);
                Chv4.setSelected(false);
                Chv5.setSelected(false);
                break;
            case 2:
                Chv1.setSelected(true);
                Chv2.setSelected(true);
                Chv3.setSelected(true);
                Chv4.setSelected(false);
                Chv5.setSelected(false);
                break;
            case 3:
                Chv1.setSelected(true);
                Chv2.setSelected(true);
                Chv3.setSelected(true);
                Chv4.setSelected(true);
                Chv5.setSelected(false);
                break;
            case 4:
                Chv1.setSelected(true);
                Chv2.setSelected(true);
                Chv3.setSelected(true);
                Chv4.setSelected(true);
                Chv5.setSelected(true);
                break;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Ch0 = new com.alee.laf.radiobutton.WebRadioButton();
        Ch1 = new com.alee.laf.radiobutton.WebRadioButton();
        Ch2 = new com.alee.laf.radiobutton.WebRadioButton();
        Ch3 = new com.alee.laf.radiobutton.WebRadioButton();
        Ch4 = new com.alee.laf.radiobutton.WebRadioButton();
        Chv1 = new com.alee.laf.radiobutton.WebRadioButton();
        Chv2 = new com.alee.laf.radiobutton.WebRadioButton();
        Chv3 = new com.alee.laf.radiobutton.WebRadioButton();
        Chv4 = new com.alee.laf.radiobutton.WebRadioButton();
        Chv5 = new com.alee.laf.radiobutton.WebRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setName("Voting"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jLabel2.setText("Насколько просто?");

        jLabel3.setText(" Насколько скучно?");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Ch0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Ch0.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Ch0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ch0MouseClicked(evt);
            }
        });
        Ch0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ch0ActionPerformed(evt);
            }
        });

        Ch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Ch1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Ch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ch1MouseClicked(evt);
            }
        });
        Ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ch1ActionPerformed(evt);
            }
        });

        Ch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Ch2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Ch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ch2MouseClicked(evt);
            }
        });
        Ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ch2ActionPerformed(evt);
            }
        });

        Ch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Ch3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Ch3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ch3MouseClicked(evt);
            }
        });
        Ch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ch3ActionPerformed(evt);
            }
        });

        Ch4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Ch4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Ch4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ch4MouseClicked(evt);
            }
        });
        Ch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ch4ActionPerformed(evt);
            }
        });

        Chv1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Chv1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Chv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chv1ActionPerformed(evt);
            }
        });

        Chv2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Chv2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Chv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chv2ActionPerformed(evt);
            }
        });

        Chv3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Chv3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Chv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chv3ActionPerformed(evt);
            }
        });

        Chv4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Chv4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Chv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chv4ActionPerformed(evt);
            }
        });

        Chv5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupoff.png"))); // NOI18N
        Chv5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/rfid/image/popupon.png"))); // NOI18N
        Chv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chv5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Слишком просто");

        jLabel5.setText("Очень сложно");

        jLabel6.setText("Очень скучно");

        jLabel7.setText("Не скучно");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ch0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Chv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Chv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Chv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Chv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Chv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ch0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Chv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ch1ActionPerformed
        Select1(1);
    }//GEN-LAST:event_Ch1ActionPerformed

    private void Ch0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ch0ActionPerformed
        Select1(0);
    }//GEN-LAST:event_Ch0ActionPerformed

    private void Ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ch2ActionPerformed
        Select1(2);
    }//GEN-LAST:event_Ch2ActionPerformed

    private void Ch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ch3ActionPerformed
        Select1(3);
    }//GEN-LAST:event_Ch3ActionPerformed

    private void Ch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ch4ActionPerformed
        Select1(4);
    }//GEN-LAST:event_Ch4ActionPerformed

    private void Chv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chv1ActionPerformed
        Select2(0);
    }//GEN-LAST:event_Chv1ActionPerformed

    private void Chv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chv2ActionPerformed
        Select2(1);
    }//GEN-LAST:event_Chv2ActionPerformed

    private void Chv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chv3ActionPerformed
        Select2(2);
    }//GEN-LAST:event_Chv3ActionPerformed

    private void Chv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chv4ActionPerformed
        Select2(3);
    }//GEN-LAST:event_Chv4ActionPerformed

    private void Chv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chv5ActionPerformed
        Select2(4);
    }//GEN-LAST:event_Chv5ActionPerformed

    private void Ch0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ch0MouseClicked
        Select1(0);
    }//GEN-LAST:event_Ch0MouseClicked

    private void Ch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ch1MouseClicked
        Select1(1);
    }//GEN-LAST:event_Ch1MouseClicked

    private void Ch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ch2MouseClicked
        Select1(2);
    }//GEN-LAST:event_Ch2MouseClicked

    private void Ch3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ch3MouseClicked
        Select1(3);
    }//GEN-LAST:event_Ch3MouseClicked

    private void Ch4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ch4MouseClicked
        Select1(4);
    }//GEN-LAST:event_Ch4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int lV1 = voting.Vot1 + 1;
        int lV2 = voting.Vot2 + 1;
        int WorkDay = ScreenView.GroupWorkID;
        String AccountID = this.AN;
        MySqlConnections MySQLDB = new MySqlConnections();
        Map<String, String> Record = new HashMap<>();
        Record.put("vot1", String.valueOf(lV1));
        Record.put("vot2", String.valueOf(lV2));
        Record.put("workday", String.valueOf(WorkDay));
        Record.put("userid", AccountID);
        MySQLDB.set("voting", Record);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.radiobutton.WebRadioButton Ch0;
    private com.alee.laf.radiobutton.WebRadioButton Ch1;
    private com.alee.laf.radiobutton.WebRadioButton Ch2;
    private com.alee.laf.radiobutton.WebRadioButton Ch3;
    private com.alee.laf.radiobutton.WebRadioButton Ch4;
    private com.alee.laf.radiobutton.WebRadioButton Chv1;
    private com.alee.laf.radiobutton.WebRadioButton Chv2;
    private com.alee.laf.radiobutton.WebRadioButton Chv3;
    private com.alee.laf.radiobutton.WebRadioButton Chv4;
    private com.alee.laf.radiobutton.WebRadioButton Chv5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}