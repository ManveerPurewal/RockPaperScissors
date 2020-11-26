/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors_game;

import java.awt.Toolkit;

/**
 *
 * @author SchoolAcc
 */
public class IntroScreen extends javax.swing.JFrame {

    /**
     * Creates new form IntroScreen
     */
    public IntroScreen() {
        initComponents();
        wrongSelection.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rock = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        scissors = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wrongSelection = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rockpaperscissors_game/Rock.jpg"))); // NOI18N
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        paper.setBackground(new java.awt.Color(102, 102, 102));
        paper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rockpaperscissors_game/Paper.jpg"))); // NOI18N
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        scissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rockpaperscissors_game/Scissors.jpg"))); // NOI18N
        scissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("To Start Press Rock");

        wrongSelection.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        wrongSelection.setText("Do you even know what a rock is???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(scissors))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(wrongSelection)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(wrongSelection)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scissors)
                    .addComponent(paper))
                .addGap(160, 160, 160))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed
        MainMenu MM = new MainMenu();
        MM.setSize(1295, 780);
        MM.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
        wrongSelection.setVisible(true);
    }//GEN-LAST:event_paperActionPerformed

    private void scissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsActionPerformed
        wrongSelection.setVisible(true);
    }//GEN-LAST:event_scissorsActionPerformed

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
            java.util.logging.Logger.getLogger(IntroScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paper;
    private javax.swing.JButton rock;
    private javax.swing.JButton scissors;
    private javax.swing.JLabel wrongSelection;
    // End of variables declaration//GEN-END:variables
}