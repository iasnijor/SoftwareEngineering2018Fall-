
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class TutorWelcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome3
     */
    File file = new File("./ScheduleSystem.db");
    private User user;
    private boolean signedIn;
    /**
     * Creates new form NewJFrame
     */
    public TutorWelcome() throws ClassNotFoundException, SQLException {
        signedIn = false;
        initComponents();
        SignOutButton.setVisible(false);
        
        Class.forName("org.sqlite.JDBC");
        
        Connection connection = DriverManager.getConnection(DB_NAME);
        
        statement = connection.createStatement();
    }
    
    public TutorWelcome(User user) throws ClassNotFoundException, SQLException {
        
        initComponents();
        signedIn = true;
        this.user = user;
        NotSignInLabel.setText("Hello " + this.user.getName());
        SignInButton.setVisible(false);
        SignOutButton.setVisible(true);
        System.out.println(user.getName());
        Class.forName("org.sqlite.JDBC");
        
        Connection connection = DriverManager.getConnection(DB_NAME);
        
        statement = connection.createStatement();
    }
    
    private static final String DB_NAME = "jdbc:sqlite:ScheduleSystem.db";
    // Initializing the statement that's declared above
    public static Statement statement;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        RoomScheduleButton = new javax.swing.JButton();
        ViewSchdeuleButton = new javax.swing.JButton();
        TheMACIcon = new javax.swing.JLabel();
        YSULabel = new javax.swing.JLabel();
        YoungstownLabel = new javax.swing.JLabel();
        RoomButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SignInButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        NotSignInLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        WelcomeLabel.setText("                    Welcome to Math Resource Scheduling ");

        RoomScheduleButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RoomScheduleButton.setText("Room Schedule");
        RoomScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomScheduleButtonActionPerformed(evt);
            }
        });

        ViewSchdeuleButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ViewSchdeuleButton.setText("View Schedule");
        ViewSchdeuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSchdeuleButtonActionPerformed(evt);
            }
        });

        TheMACIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/The MAC Logo w Kate Penguin 2.png"))); // NOI18N


        YSULabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        YSULabel.setText("Youngstown State Univeristy");

        YoungstownLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        YoungstownLabel.setText("Youngstown, Ohio");

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

        NotSignInLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        NotSignInLabel.setText("Not Signed In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(RoomScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(ViewSchdeuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addContainerGap(333, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TheMACIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YSULabel)
                    .addComponent(YoungstownLabel))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NotSignInLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SignInButton)
                        .addComponent(SignOutButton))
                    .addComponent(NotSignInLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewSchdeuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(YSULabel)
                        .addGap(18, 18, 18)
                        .addComponent(YoungstownLabel)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TheMACIcon)
                        .addContainerGap())))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomScheduleButtonActionPerformed

        // TODO add your handling code here:
        TutorWelcome.this.setVisible(false);
        Resource room;
        
        try {
            if (signedIn) {
                room = new Resource(user);
                room.setVisible(true);
            }
            else {
                room = new Resource();
                room.setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TutorWelcome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TutorWelcome.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }//GEN-LAST:event_RoomScheduleButtonActionPerformed

    private void ViewSchdeuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSchdeuleButtonActionPerformed
        // TODO add your handling code here:
        TutorWelcome.this.setVisible(false);
        TutorDayandTime tutor = new TutorDayandTime();
        tutor.setVisible(true);
    }//GEN-LAST:event_ViewSchdeuleButtonActionPerformed

    }//GEN-LAST:event_RoomButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        // TODO add your handling code here:
        
        
        myTutor mytutor;
        try {
            if (signedIn) {
            TutorWelcome.this.setVisible(false);
            
            ResultSet rs = statement.executeQuery("SELECT * FROM tutor WHERE name = '" + user.getName() + "'");
            
            mytutor = new myTutor(rs.getString("name"), rs.getString("algebra"), rs.getString("precalc"), rs.getString("calc"), rs.getString("stats"), rs.getString("contact"),
            rs.getString("mon"), rs.getString("tues"), rs.getString("wed"), rs.getString("thurs"), rs.getString("fri"));
            
            TutorDayandTime tutor = new TutorDayandTime(user, mytutor, statement);
            tutor.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Please Sign In.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TutorWelcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ScheduleButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        // TODO add your handling code here:
        signedIn = false;
        SignOutButton.setVisible(false);
        SignInButton.setVisible(true);

        NotSignInLabel.setText("Not Signed In");
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:
        TutorWelcome.this.setVisible(false);
        SignIn signin;
        try {
            signin = new SignIn();
            signin.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Welcome1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SignInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TutorWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TutorWelcome().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TutorWelcome.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TutorWelcome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RoomScheduleButton;
    private javax.swing.JLabel TheMACIcon;
    private javax.swing.JButton ViewSchdeuleButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel YSULabel;
    private javax.swing.JLabel YoungstownLabel;
    private javax.swing.JLabel NotSignInLabel;
    private javax.swing.JButton RoomButton;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JButton SignInButton;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

