
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class TutorDayandTime extends javax.swing.JFrame {

    /**
     * Creates new form TutorDayandTime
     */
    myTutor mytutor;
    myUser user;
    private boolean signedIn;
/**
 * Creates a New TutorDayandTime form
 */
    public TutorDayandTime() {
        initComponents();
    }
    
    public TutorDayandTime(myTutor tutor, Statement statement) throws SQLException {
        
        mytutor = tutor;
        initComponents();
        
        getSchedule(statement);
        
        statement.close();
    }
    
    public TutorDayandTime(myUser user, myTutor tutor, Statement statement) throws SQLException {
        this.user = user;
        signedIn = true;
        mytutor = tutor;
        initComponents();
        
        getSchedule(statement);
        statement.close();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        EditScheduleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutor Schedule");

        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Monday", null, null, null, null, null, null, null, null, null},
                {"Tuesday", null, null, null, null, null, null, null, null, null},
                {"Wednesday", null, null, null, null, null, null, null, null, null},
                {"Thursday", null, null, null, null, null, null, null, null, null},
                {"Friday", null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Day/Time", "8", "9", "10", "11", "12", "1", "2", "3", "4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ScheduleTable.setPreferredSize(new java.awt.Dimension(750, 250));
        ScheduleTable.setRowHeight(50);
        jScrollPane1.setViewportView(ScheduleTable);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        EditScheduleButton.setText("Edit Schedule");
        EditScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditScheduleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(572, 572, 572)
                .addComponent(EditScheduleButton)
                .addContainerGap(636, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(EditScheduleButton)
                .addGap(56, 56, 56))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        TutorDayandTime.this.setVisible(false);
        if (user.getLevel().equals("admin")){
            Tutor tutor;
            try {
                tutor = new Tutor(user);
                tutor.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TutorDayandTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
        TutorWelcome tutor;
        try {
            tutor = new TutorWelcome(user);
            tutor.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TutorDayandTime.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TutorDayandTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void EditScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditScheduleButtonActionPerformed
        // TODO add your handling code here:
        TutorDayandTime.this.setVisible(false);
        TutorAdd tutor;
        
        try {
            tutor = new TutorAdd(user, true, mytutor);
            tutor.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TutorDayandTime.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TutorDayandTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditScheduleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TutorDayandTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorDayandTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorDayandTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorDayandTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorDayandTime().setVisible(true);
            }
        });
    }
    /**
     * Get method for getting the schedule of the tutor
     * @param statement  Statement is the statement declared  before
     */
    public void getSchedule(Statement statement) {
        for (int day = 0; day < ScheduleTable.getRowCount(); day++) {
            for (int hour = 0; hour < ScheduleTable.getColumnCount(); hour++) {
                if (mytutor.getSchedule(day).contains(", " + ScheduleTable.getColumnName(hour) + ", ") || 
                        mytutor.getSchedule(day).startsWith(ScheduleTable.getColumnName(hour) + ", "))
                    ScheduleTable.setValueAt("X", day, hour);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton EditScheduleButton;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

