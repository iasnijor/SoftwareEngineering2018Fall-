import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class ViewTutor extends javax.swing.JFrame {

    /**
     * Creates new form ViewTutor
     */
    File file = new File("./ScheduleSystem.db");
    myUser user;
    boolean signedIn, manual;
    int selectedIndex;
    private DefaultTableModel model;
    ArrayList<myTutor> allTutors = new ArrayList();
    ArrayList<myTutor> tutors = new ArrayList();
    
    public ViewTutor() throws ClassNotFoundException, SQLException {
        manual = true;
        initComponents();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(DB_NAME);
        statement = connection.createStatement();
        
        setModel();
    }
    
    public ViewTutor(int index) throws ClassNotFoundException, SQLException {
        selectedIndex = index;
        initComponents();
        
        ClassComboBox.setSelectedIndex(index);
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(DB_NAME);
        statement = connection.createStatement();
        
        setModel();
    }
    
    public ViewTutor(myUser user) throws ClassNotFoundException, SQLException {
        this.user = user;
        signedIn = true;
        manual = true;
        initComponents();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(DB_NAME);
        statement = connection.createStatement();
        
        setModel();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM tutor");
        while(rs.next()) {
            allTutors.add(new myTutor(rs.getString("name"), rs.getString("algebra"), rs.getString("precalc"), rs.getString("calc"), rs.getString("stats"), rs.getString("contact"),
                                      rs.getString("mon"), rs.getString("tues"), rs.getString("wed"), rs.getString("thurs"), rs.getString("fri")));
        }
        
        getTutors();
    }
    
    public ViewTutor(myUser user,int index) throws ClassNotFoundException, SQLException {
        this.user = user;
        selectedIndex = index;
        signedIn = true;
        manual = false;
        
        initComponents();
        
        ClassComboBox.setSelectedIndex(index);
        
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection(DB_NAME);
        statement = connection.createStatement();
        
        setModel();
        
    }
    
    private static final String DB_NAME = "jdbc:sqlite:ScheduleSystem.db";
    /**
    *Initializing the statement that's declared above
    **/
    public static Statement statement;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TutorTable = new javax.swing.JTable();
        ClassComboBox = new javax.swing.JComboBox<>();
        TimeSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DayComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        BookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        TutorTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TutorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tutor Name", "Subjects", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TutorTable.setPreferredSize(new java.awt.Dimension(625, 400));
        TutorTable.setRowHeight(40);
        TutorTable.setShowHorizontalLines(true);
        TutorTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(TutorTable);
        if (TutorTable.getColumnModel().getColumnCount() > 0) {
            TutorTable.getColumnModel().getColumn(0).setResizable(false);
            TutorTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            TutorTable.getColumnModel().getColumn(1).setResizable(false);
            TutorTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            TutorTable.getColumnModel().getColumn(2).setResizable(false);
            TutorTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        ClassComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algebra", "1505", "1507", "Pre-Calc", "1510", "1511", "1513", "Calculus", "1552", "1570", "1571", "1572", "1580", "1581", "2670", "2673", "3705", "Statistics", "2601", "2623", "2625", "3717" }));
        ClassComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassComboBoxActionPerformed(evt);
            }
        });

        TimeSpinner.setModel(new javax.swing.SpinnerListModel(new String[] {"8", "9", "10", "11", "12", "1", "2", "3", "4"}));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Class:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Time:");

        DayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" }));
        DayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Day:");

        BookButton.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        BookButton.setText("Book Session");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BookButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClassComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(TimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BookButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        ViewTutor.this.setVisible(false);
        
        if (signedIn) {
            Welcome1 wel= new Welcome1(user);
            wel.setVisible(true);
        }
        else {
            Welcome1 wel = new Welcome1();
            wel.setVisible(true);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ClassComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassComboBoxActionPerformed
        try {
            // TODO add your handling code here:
            
            getTutors();
        } catch (SQLException ex) {
            Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ClassComboBoxActionPerformed

    private void DayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayComboBoxActionPerformed
        try {
            // TODO add your handling code here:
            getTutors();
        } catch (SQLException ex) {
            Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DayComboBoxActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        if (!TutorTable.getValueAt(TutorTable.getSelectedRow(), 0).equals("")) {
            if(signedIn) {
                myTutor tutor;
                try {
                    ViewTutor.this.setVisible(false);
                    ResultSet rs = statement.executeQuery("SELECT * FROM tutor WHERE name = '" + TutorTable.getValueAt(TutorTable.getSelectedRow(), 0) + "'");
                    TutorBook book;
                    
                    do {
                    tutor = new myTutor(rs.getString("name"), rs.getString("algebra"), rs.getString("precalc"), rs.getString("calc"), rs.getString("stats"), rs.getString("contact"),
                        rs.getString("mon"), rs.getString("tues"), rs.getString("wed"), rs.getString("thurs"), rs.getString("fri"));
                    } while(rs.next());
                    
                    book = new TutorBook(this.user, tutor, allTutors, ClassComboBox.getSelectedItem().toString(),
                        TimeSpinner.getValue().toString(), DayComboBox.getSelectedItem().toString());
                    
                    statement.close();
                    book.setVisible(true);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_BookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewTutor().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewTutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void getHours() {
        String selection = DayComboBox.getSelectedItem().toString();
        
        switch(selection) {
            case "Monday":
                for(int i=0; i<tutors.size(); i++) {
                    String hours = tutors.get(i).getMonday();
                    if (!hours.equals("")) {
                        hours = hours.substring(0, hours.length() - 2);
                        TutorTable.setValueAt(hours, i, 2);
                    }
                }
                break;
            case "Tuesday":
                for(int i=0; i<tutors.size(); i++) {
                    String hours = tutors.get(i).getTuesday();
                    if (!hours.equals("")) {
                        hours = hours.substring(0, hours.length() - 2);
                        TutorTable.setValueAt(hours, i, 2);
                    }
                }
                break;
            case "Wednesday":
                for(int i=0; i<tutors.size(); i++) {
                    String hours = tutors.get(i).getWednesday();
                    if (!hours.equals("")) {
                        hours = hours.substring(0, hours.length() - 2);
                        TutorTable.setValueAt(hours, i, 2);
                    }
                }
                break;
            case "Thursday":
                for(int i=0; i<tutors.size(); i++) {
                    String hours = tutors.get(i).getThursday();
                    if (!hours.equals("")) {
                        hours = hours.substring(0, hours.length() - 2);
                        TutorTable.setValueAt(hours, i, 2);
                    }
                }
                break;
            case "Friday":
                for(int i=0; i<tutors.size(); i++) {
                    String hours = tutors.get(i).getFriday();
                    if (!hours.equals("")) {
                        hours = hours.substring(0, hours.length() - 2);
                        TutorTable.setValueAt(hours, i, 2);
                    }
                }
                break;
            default:
                break;
                    
        }
    }
    
    public void getTutors() throws SQLException, ClassNotFoundException {
        // create list of tutors
        // remove tutor from list if subject is not in their list
        // display tutors with the class

        String selection = ClassComboBox.getSelectedItem().toString();

        System.out.println("selection");

        

        resetTable();
        setModel();

        //list of tutors
        for(int i=0; i<allTutors.size(); i++) {
            tutors.add(allTutors.get(i));
        }
        
        //remove tutors

        System.out.println(tutors.toString());

        int ind = 0;

        switch(selection) {
            case "Algebra": 
                while(!tutors.isEmpty() && tutors.size() != ind) {
                    if (tutors.get(ind).getAlgebra().equals(""))  {
                        tutors.remove(ind);
                    }
                    else {
                        ind++;
                    }
                }
                for (int i=0; i<tutors.size(); i++) {
                    String classes = tutors.get(i).getAlgebra();
                    classes = classes.substring(0, classes.length() - 2);
                    TutorTable.setValueAt(tutors.get(i).getName(), i, 0);
                    TutorTable.setValueAt(classes, i, 1);
                }
                break;
            case "Pre-Calc":
                while(!tutors.isEmpty() && tutors.size() != ind) {
                    if (tutors.get(ind).getPreCalc().equals(""))  {
                        tutors.remove(ind);
                    }
                    else {
                        ind++;
                    }
                }
                for (int i=0; i<tutors.size(); i++) {
                    String classes = tutors.get(i).getPreCalc();
                    classes = classes.substring(0, classes.length() - 2);
                    TutorTable.setValueAt(tutors.get(i).getName(), i, 0);
                    TutorTable.setValueAt(classes, i, 1);
                }
                break;
            case "Calculus":
                while(!tutors.isEmpty() && tutors.size() != ind) {
                    if (tutors.get(ind).getCalc().equals(""))  {
                        tutors.remove(ind);
                    }
                    else {
                        ind++;
                    }
                }
                for (int i=0; i<tutors.size(); i++) {
                    String classes = tutors.get(i).getCalc();
                    classes = classes.substring(0, classes.length() - 2);
                    TutorTable.setValueAt(tutors.get(i).getName(), i, 0);
                    TutorTable.setValueAt(classes, i, 1);
                }
                break;
            case "Statistics":
                while(!tutors.isEmpty() && tutors.size() != ind) {
                    if (tutors.get(ind).getStats().equals(""))  {
                        tutors.remove(ind);
                    }
                    else {
                        ind++;
                    }
                }
                for (int i=0; i<tutors.size(); i++) {
                    String classes = tutors.get(i).getStats();
                    classes = classes.substring(0, classes.length() - 2);
                    TutorTable.setValueAt(tutors.get(i).getName(), i, 0);
                    TutorTable.setValueAt(classes, i, 1);
                }
                break;
            default:
                while(!tutors.isEmpty() && tutors.size() != ind) {
                    if ((!tutors.get(ind).getClasses().contains(selection))) {
                    tutors.remove(ind);
                    //removed = true;
                    }
                    else {
                        ind++;
                        //removed = false;
                    }
                }
                for (int i=0; i<tutors.size(); i++) {
                    TutorTable.setValueAt(tutors.get(i).getName(), i, 0);
                    TutorTable.setValueAt(selection, i, 1);
                }
                break;
        }
        
        getHours();
        statement.close();
        tutors.clear();
    }

    private void resetTable() {
        model.setRowCount(0);
    }
    
    private void setModel() {
        model = new DefaultTableModel((
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                }),
                new String [] {
                    "Tutor Name", "Subjects", "Schedule"
                }
            ) 
        {
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
        
        TutorTable.setModel(model);
    }
    
    private void setCModel() {
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BookButton;
    private javax.swing.JComboBox<String> ClassComboBox;
    private javax.swing.JComboBox<String> DayComboBox;
    private javax.swing.JSpinner TimeSpinner;
    private javax.swing.JTable TutorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

