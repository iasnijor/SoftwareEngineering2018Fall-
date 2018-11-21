import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rojen
 */
public class Beginning extends javax.swing.JFrame {

    private User user;
    private boolean signedIn;
    /**
     * Creates new form NewJFrame
     */
    public Beginning() {
        signedIn = false;
        initComponents();
        SignOutButton.setVisible(false);
    }
    
    public Beginning(User user) {
        
        initComponents();
        signedIn = true;
        this.user = user;
        NotSignInLabel.setText("Hello " + this.user.getName());
        SignInButton.setVisible(false);
        SignOutButton.setVisible(true);
        System.out.println(user.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RoomButton = new javax.swing.JButton();
        TutorButton = new javax.swing.JButton();
        WelcomeLabel = new javax.swing.JLabel();
        DepartmentLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NotSignInLabel = new javax.swing.JLabel();
        SignInButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        TheMacLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resource Scheduling System");

        RoomButton.setText("Room Scheduling");
        RoomButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomButtonMouseClicked(evt);
            }
        });
        RoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomButtonActionPerformed(evt);
            }
        });

        TutorButton.setText("Tutor Scheduling");
        TutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorButtonActionPerformed(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        WelcomeLabel.setText("                    Welcome to Math Resource Scheduling ");

        DepartmentLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DepartmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DepartmentLabel.setText("Departmen Of Mathematics,YSU");

        NotSignInLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        NotSignInLabel.setText("Not Signed In");

        SignInButton.setText("Sign In");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        TheMacLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/The MAC Logo w Kate Penguin 2.png"))); // NOI18N
        TheMacLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignOutButton))
                    .addComponent(TheMacLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(NotSignInLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(TutorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(351, 351, 351))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(TheMacLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NotSignInLabel)
                                    .addComponent(SignInButton)
                                    .addComponent(SignOutButton))
                                .addGap(82, 82, 82)
                                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(339, 339, 339))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TutorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(189, 189, 189)))
                        .addComponent(DepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomButtonActionPerformed
        Beginning.this.setVisible(false);
        Resource room;
        try {
            if (!signedIn) {
                room = new Resource();
                room.setVisible(true);
            }
            else {
                room = new Resource(this.user);
                room.setVisible(true);
            }
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RoomButtonActionPerformed

    private void RoomButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomButtonMouseClicked
        // TODO a
    }//GEN-LAST:event_RoomButtonMouseClicked

    private void TutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorButtonActionPerformed
       Beginning.this.setVisible(false);
        Tutor tutor= new Tutor();
        tutor.setVisible(true);
    }//GEN-LAST:event_TutorButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:
        Beginning.this.setVisible(false);
        SignIn signin;
        try {
            signin = new SignIn();
            signin.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
        signedIn = false;
        SignOutButton.setVisible(false);
        SignInButton.setVisible(true);
        
        NotSignInLabel.setText("Not Signed In");
    }//GEN-LAST:event_SignOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beginning().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JLabel NotSignInLabel;
    private javax.swing.JButton RoomButton;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel TheMacLabel;
    private javax.swing.JButton TutorButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

