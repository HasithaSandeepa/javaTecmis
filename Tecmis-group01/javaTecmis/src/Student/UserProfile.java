/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

/**
 *
 * @author Hiru
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form UserProfile
     */
    public UserProfile() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        backLBL = new javax.swing.JLabel();
        bgImgLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateProPNL = new javax.swing.JPanel();
        userprofileIconLBL = new javax.swing.JLabel();
        idnoLBL = new javax.swing.JLabel();
        idnoTXT = new javax.swing.JTextField();
        nameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        phoneLBL = new javax.swing.JLabel();
        genderLBL = new javax.swing.JLabel();
        levelLBL = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        emailTXT = new javax.swing.JTextField();
        phonrTXT = new javax.swing.JTextField();
        genderTXT = new javax.swing.JTextField();
        levelTXT = new javax.swing.JTextField();
        updateproBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 750));

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        backLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });

        bgImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-profile.jpg"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        jLabel1.setText("User Profile");

        updateProPNL.setBackground(new java.awt.Color(245, 245, 245));

        userprofileIconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Male User.png"))); // NOI18N

        idnoLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        idnoLBL.setForeground(new java.awt.Color(153, 153, 153));
        idnoLBL.setText("ID Number");

        idnoTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        idnoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoTXTActionPerformed(evt);
            }
        });

        nameLBL.setBackground(new java.awt.Color(208, 208, 208));
        nameLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        nameLBL.setForeground(new java.awt.Color(153, 153, 153));
        nameLBL.setText("Name");

        emailLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        emailLBL.setForeground(new java.awt.Color(153, 153, 153));
        emailLBL.setText("Email");

        phoneLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        phoneLBL.setForeground(new java.awt.Color(153, 153, 153));
        phoneLBL.setText("Phone No");

        genderLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        genderLBL.setForeground(new java.awt.Color(153, 153, 153));
        genderLBL.setText("Gender");

        levelLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        levelLBL.setForeground(new java.awt.Color(153, 153, 153));
        levelLBL.setText("Level");

        nameTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        nameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTActionPerformed(evt);
            }
        });

        emailTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        emailTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTXTActionPerformed(evt);
            }
        });

        phonrTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        phonrTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonrTXTActionPerformed(evt);
            }
        });

        genderTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        genderTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTXTActionPerformed(evt);
            }
        });

        levelTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        levelTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelTXTActionPerformed(evt);
            }
        });

        updateproBTN.setBackground(new java.awt.Color(76, 159, 255));
        updateproBTN.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        updateproBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateproBTN.setText("Update Profile");
        updateproBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateproBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateproBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateProPNLLayout = new javax.swing.GroupLayout(updateProPNL);
        updateProPNL.setLayout(updateProPNLLayout);
        updateProPNLLayout.setHorizontalGroup(
            updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNLLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateproBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(updateProPNLLayout.createSequentialGroup()
                        .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idnoLBL)
                            .addComponent(nameLBL)
                            .addComponent(emailLBL)
                            .addComponent(phoneLBL)
                            .addComponent(genderLBL)
                            .addComponent(levelLBL))
                        .addGap(38, 38, 38)
                        .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idnoTXT)
                            .addComponent(nameTXT)
                            .addComponent(emailTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(phonrTXT)
                            .addComponent(genderTXT)
                            .addComponent(levelTXT))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateProPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userprofileIconLBL)
                .addGap(220, 220, 220))
        );
        updateProPNLLayout.setVerticalGroup(
            updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateProPNLLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(userprofileIconLBL)
                .addGap(18, 18, 18)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idnoLBL)
                    .addComponent(idnoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLBL)
                    .addComponent(phonrTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLBL)
                    .addComponent(genderTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(updateProPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLBL)
                    .addComponent(levelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(updateproBTN)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addComponent(bgImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addComponent(updateProPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backLBL)
                                .addGap(26, 26, 26)))
                        .addGap(32, 32, 32)
                        .addComponent(bgImgLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(updateProPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idnoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoTXTActionPerformed
        // take the S_ID from login and display
    }//GEN-LAST:event_idnoTXTActionPerformed

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // display the name from the database related to above S_ID
    }//GEN-LAST:event_nameTXTActionPerformed

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard userDb = new Dashboard();
        userDb.show();
        dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    private void updateproBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateproBTNActionPerformed
       UpdateProfile update = new UpdateProfile();
       update.show();
       dispose();
    }//GEN-LAST:event_updateproBTNActionPerformed

    private void emailTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTXTActionPerformed
        // display the email from the database related to above S_ID
    }//GEN-LAST:event_emailTXTActionPerformed

    private void phonrTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonrTXTActionPerformed
        // display the phone number from the database related to above S_ID
    }//GEN-LAST:event_phonrTXTActionPerformed

    private void genderTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTXTActionPerformed
        // display the gender from the database related to above S_ID
    }//GEN-LAST:event_genderTXTActionPerformed

    private void levelTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelTXTActionPerformed
        //display the level from the database related to above S_ID
    }//GEN-LAST:event_levelTXTActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bgImgLBL;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JLabel genderLBL;
    private javax.swing.JTextField genderTXT;
    private javax.swing.JLabel idnoLBL;
    private javax.swing.JTextField idnoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel levelLBL;
    private javax.swing.JTextField levelTXT;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JLabel phoneLBL;
    private javax.swing.JTextField phonrTXT;
    private javax.swing.JPanel updateProPNL;
    private javax.swing.JButton updateproBTN;
    private javax.swing.JLabel userprofileIconLBL;
    // End of variables declaration//GEN-END:variables
}