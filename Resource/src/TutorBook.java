
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean-
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TutorBook extends javax.swing.JFrame {
    boolean firstLoad = true;
    myUser user;
    myTutor tutor;
    ArrayList<myTutor> allTutors = new ArrayList();
    ArrayList<myTutor> newTutors = new ArrayList();
    String Algebra[] = {"1505", "1507"};
    String PreCalc[] = {"1510", "1511", "1513"};
    String Calc[] = {"1552", "1570", "1571", "1572", "1580", "1581", "2670", "2673", "3705"};
    String Stats[] = {"2623", "2601", "2625", "3717"};
    
    /**
     * Creates new form TutorBook
     */
    public TutorBook() {
        initComponents();
    }
    public TutorBook(String course, int time, String day) {
        initComponents();
        if (course.equals("Algebra")) {
            ClassComboBox = new JComboBox(Algebra);
        }
        //ClassComboBox.setSelectedItem(course);
        TimeSpinner.setValue(time);
        DayComboBox.setSelectedItem(day);
    }
    public TutorBook(myTutor tutor, String course, int time, String day) {
        initComponents();
        ClassComboBox.setSelectedItem(course);
        TimeSpinner.setValue(time);
        DayComboBox.setSelectedItem(day);
        this.tutor = tutor;
    }
    public TutorBook(myUser user, String course, int time, String day) {
        initComponents();
        NameTextField.setText(user.getName());
        ClassComboBox.setSelectedItem(course);
        TimeSpinner.setValue(time);
        DayComboBox.setSelectedItem(day);
        this.user = user;
    }
    public TutorBook(myUser user, myTutor tutor, ArrayList<myTutor> allTutors, String course, String time, String day) throws ClassNotFoundException, SQLException {
        initComponents();
        System.out.println(user.getName());
        this.tutor = tutor;
        this.allTutors = allTutors;
        System.out.println("FUCKYOU");
        switch(course) {
            case "Algebra":
                ClassComboBox.removeAllItems();
                for (String Subject : Algebra) 
                    ClassComboBox.addItem(Subject);
                break;
            case "Pre-Calc":
                ClassComboBox.removeAllItems();
                for (String Subject : PreCalc) 
                    ClassComboBox.addItem(Subject);
                break;
            case "Calculus":
                if(ClassComboBox.getItemCount() > 0)
                    ClassComboBox.removeAllItems();
                for (String Subject : Calc) 
                    ClassComboBox.addItem(Subject);
                break;
            case "Statistics":
                ClassComboBox.removeAllItems();
                for (String Subject : Stats) 
                    ClassComboBox.addItem(Subject);
                break;
            default:
                ClassComboBox.setSelectedItem(course);
                break;
                
            
        }
        
        firstLoad = false;
        
        
        NameTextField.setText(user.getName());
        //ClassComboBox.setSelectedItem(course);
        TimeSpinner.setValue(time);
        DayComboBox.setSelectedItem(day);
        this.user = user;
        this.tutor = tutor;
        //TutorLabel.setText("Tutor: " + tutor.getName());
        //TutorComboBox.addItem(tutor.getName());
        //TutorComboBox.setSelectedItem(tutor.getName());
        getTutors(DayComboBox.getSelectedItem().toString(), ClassComboBox.getSelectedItem().toString());
        TutorComboBox.removeAllItems();
        for(myTutor newtutor : newTutors) {
            
            TutorComboBox.addItem(newtutor.getName());
        }
        newTutors.clear();
       TutorComboBox.setSelectedItem(tutor.getName());

        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(DB_NAME);
        statement = connection.createStatement();
    }
    
    private static final String DB_NAME = "jdbc:sqlite:ScheduleSystem.db";
    
    public static Statement statement;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ClassComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TimeSpinner = new javax.swing.JSpinner();
        DayComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BookButton = new javax.swing.JButton();
        TutorLabel = new javax.swing.JLabel();
        TutorComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Book Tutoring Session");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Class:");

        ClassComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1505", "1507", "1510", "1511", "1513", "1552", "1570", "1571", "1572", "1580", "1581", "2670", "2673", "3705", "2601", "2623", "2625", "3717" }));
        ClassComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Time:");

        TimeSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"8", "9", "10", "11", "12", "1", "2", "3", "4"}));

        DayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        DayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Day:");

        BookButton.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        BookButton.setText("Book Session");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        TutorLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TutorLabel.setText("Tutor: ");

        TutorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(BookButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimeSpinner)
                            .addComponent(ClassComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TutorLabel))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DayComboBox, 0, 104, Short.MAX_VALUE)
                            .addComponent(TutorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TutorLabel)
                    .addComponent(TutorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(BookButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayComboBoxActionPerformed
        getTutors(DayComboBox.getSelectedItem().toString(), ClassComboBox.getSelectedItem().toString());
        newTutors.clear();
    }//GEN-LAST:event_DayComboBoxActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        String day = DayComboBox.getSelectedItem().toString();
        String time = TimeSpinner.getValue().toString();
        myTutor t = null;
        
        for (myTutor newtutor : allTutors) {
            if (newtutor.getName().equals(TutorComboBox.getSelectedItem().toString())) {
                
                System.out.println(newtutor.getName());
                t = new myTutor(newtutor);
                System.out.println("HITNIGGA");
            }
            else 
                t = new myTutor(tutor);
        }
        
        switch(day) {
            case "Monday":
                if (t.getMonday().contains(", " + time + ", ") || t.getMonday().startsWith(time + ", ")) {
                    try {
                        createSession(t);
                    } catch (SQLException ex) {
                        Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                else {
                    JOptionPane.showMessageDialog(this, "Please select: " + t.getMonday());
                }
                break;
            case "Tuesday":
                if (t.getTuesday().contains(", " + time + ", ") || t.getTuesday().startsWith(time + ", ")) {
                    try {
                        createSession(t);
                    } catch (SQLException ex) {
                        Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                else {
                    JOptionPane.showMessageDialog(this, "Please select: " + t.getTuesday());
                }
                break;
            case "Wednesday":
                if (t.getWednesday().contains(", " + time + ", ") || t.getWednesday().startsWith(time + ", ")) {
                    try {
                        createSession(t);
                    } catch (SQLException ex) {
                        Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                else {
                    JOptionPane.showMessageDialog(this, "Please select: " + t.getWednesday());
                }
                break;
            case "Thursday":
                if (t.getThursday().contains(", " + time + ", ") || t.getThursday().startsWith(time + ", ")) {
                    try {
                        createSession(t);
                    } catch (SQLException ex) {
                        Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                else {
                    JOptionPane.showMessageDialog(this, "Please select: " + t.getThursday());
                }
                break;
            case "Friday":
                if (t.getFriday().contains(", " + time + ", ") || t.getFriday().startsWith(time + ", ")) {
                    try {
                        createSession(t);
                    } catch (SQLException ex) {
                        Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        }
                else {
                    JOptionPane.showMessageDialog(this, "Please select: " + t.getFriday());
                }
                break;
            default:
                t = null;
                break;
               
        }
        
        TutorBook.this.setVisible(false);
        try {
            ViewTutor tutor = new ViewTutor(user);
            tutor.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TutorBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookButtonActionPerformed

    private void ClassComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassComboBoxActionPerformed
        // TODO add your handling code here:
        //String sub = ClassComboBox.getSelectedItem().toString();
       if (!firstLoad) {
        getTutors(DayComboBox.getSelectedItem().toString(), ClassComboBox.getSelectedItem().toString());
        
        
        TutorComboBox.removeAllItems();
        for(myTutor tutor : newTutors) {
            
            TutorComboBox.addItem(tutor.getName());
        }
        newTutors.clear();
       }
    }//GEN-LAST:event_ClassComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(TutorBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorBook().setVisible(true);
            }
        });
    }
    
    public void createSession(myTutor createtutor) throws SQLException {
        mySession session;
        session = new mySession(createtutor, NameTextField.getText(), ClassComboBox.getSelectedItem().toString(), DayComboBox.getSelectedItem().toString(), TimeSpinner.getValue().toString(), user.getUser());
        
        System.out.println(session.toString());
        session.save(statement);
        statement.close();
    }
    
    public void getTutors(String day, String subject) {
        
        switch(subject) {
            case "Algebra":
                
                break;
            default:
                break;
        }
        
        for(myTutor newTutor : allTutors) {                
            if (newTutor.getClasses().contains(subject) && !newTutor.getSchedule(DayComboBox.getSelectedIndex()).equals("")) {
                newTutors.add(newTutor);
            }
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookButton;
    private javax.swing.JComboBox<String> ClassComboBox;
    private javax.swing.JComboBox<String> DayComboBox;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JSpinner TimeSpinner;
    private javax.swing.JComboBox<String> TutorComboBox;
    private javax.swing.JLabel TutorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
