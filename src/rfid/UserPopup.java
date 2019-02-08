/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfid;

import com.alee.extended.panel.GroupPanel;
import com.alee.laf.button.WebButton;
import com.alee.laf.label.WebLabel;
import com.alee.laf.text.WebTextField;
import com.alee.managers.popup.PopupStyle;
import com.alee.managers.popup.PopupWay;
import com.alee.managers.popup.WebButtonPopup;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

/**
 *
 * @author alienware
 */
public class UserPopup extends javax.swing.JFrame {

    /**
     * Creates new form UserPopup
     */
    public UserPopup() {
        initComponents();
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();// size of the screen
        Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());// height of the task bar
        setLocation(scrSize.width - getWidth(), scrSize.height - toolHeight.bottom - getHeight());
        setAlwaysOnTop(true);
        webImage1.setImage(new helper.helper().LoadImage("popup.png"));
        popup.setPopupStyle(PopupStyle.gray);
        popup.packPopup();
        popup.show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new com.alee.managers.popup.WebPopup();
        webImage1 = new com.alee.extended.image.WebImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(1, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        popup.setBackground(new java.awt.Color(1, 1, 1));
        popup.setForeground(new java.awt.Color(254, 254, 254));
        popup.setAnimated(true);
        popup.setMargin(new java.awt.Insets(-15, -15, -15, -15));

        webImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webImage1MouseClicked(evt);
            }
        });
        popup.add(webImage1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popup, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popup, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void webImage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webImage1MouseClicked
        createPopupButton(PopupWay.rightUp);
    }//GEN-LAST:event_webImage1MouseClicked
    private void createPopupButton(PopupWay way) {
        // Button that calls for popup
        WebButton showPopup = new WebButton();

        // Popup itself
        WebButtonPopup popup = new WebButtonPopup(showPopup, way);

        // Sample popup content
        WebLabel label = new WebLabel("Sample label", WebLabel.CENTER);
        WebTextField field = new WebTextField("Sample field", 10);
        field.setHorizontalAlignment(SwingConstants.CENTER);
        GroupPanel content = new GroupPanel(5, false, label, field);
        content.setMargin(15);
        // Setup popup content
        popup.setContent(content);
        // Component focused by default
        popup.setDefaultFocusComponent(field);
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
            java.util.logging.Logger.getLogger(UserPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.managers.popup.WebPopup popup;
    private com.alee.extended.image.WebImage webImage1;
    // End of variables declaration//GEN-END:variables
}
