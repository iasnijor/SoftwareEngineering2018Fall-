import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rojen
 */
public class Resource extends javax.swing.JFrame {

    File file = new File("./ScheduleSystem.db");
    User user;   
    private boolean signedIn;
    
    
    public Resource() throws ClassNotFoundException, SQLException {
        initComponents();
        
        Class.forName("org.sqlite.JDBC");
        
        Connection connection = DriverManager.getConnection(DB_NAME);
        
        statement = connection.createStatement();
        getEvents(statement);
    }
    
    public Resource(User user) throws ClassNotFoundException, SQLException {
        initComponents();
        signedIn = true;
        this.user = user;
        System.out.println(this.user.getName());
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            Connection connection = DriverManager.getConnection(DB_NAME);
            statement = connection.createStatement();

            getEvents(statement);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    private static final String DB_NAME = "jdbc:sqlite:ScheduleSystem.db";
    // Initializing the statement that's declared above
    public static Statement statement;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        BookButton = new javax.swing.JButton();
        MathLabel = new javax.swing.JLabel();
        Calender = new com.toedter.calendar.JDayChooser();

        jTextField2.setText("jTextField2");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Conference Small", null, null, null, null, null, null, null, null, null},
                {"Conference Suite", null, null, null, null, null, null, null, null, null},
                {"Conference 524", null, null, null, null, null, null, null, null, null},
                {"Lab 214", null, null, null, null, null, null, null, null, null},
                {"Lab 403", null, null, null, null, null, null, null, null, null},
                {"Lab 414", null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Room", "8:00", "9:00", "10:00", "11:00", "12:00", "1:00", "2:00", "3:00", "4:00"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setToolTipText("");
        Table.setMinimumSize(new java.awt.Dimension(155, 295));
        Table.setPreferredSize(new java.awt.Dimension(525, 300));
        Table.setRowHeight(50);
        Table.setRowSelectionAllowed(false);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(20);
            Table.getColumnModel().getColumn(0).setPreferredWidth(150);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        BackButton.setBackground(new java.awt.Color(153, 0, 0));
        BackButton.setForeground(new java.awt.Color(0, 0, 0));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        BookButton.setBackground(new java.awt.Color(0, 0, 0));
        BookButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BookButton.setForeground(new java.awt.Color(153, 0, 0));
        BookButton.setText("Book");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        MathLabel.setBackground(new java.awt.Color(153, 0, 0));
        MathLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        MathLabel.setForeground(new java.awt.Color(0, 0, 0));
        MathLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MathLabel.setText("Math Department Room Schedule");

        Calender.setBackground(new java.awt.Color(255, 255, 255));
        Calender.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(MathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Calender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(437, 437, 437))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Calender, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        Resource.this.setVisible(false);
        
        if (!signedIn) {
            Beginning begin = new Beginning();
            begin.setVisible(true);
        }
        else {
            Beginning begin = new Beginning(user);
            begin.setVisible(true);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        // TODO add your handling code here:
        Resource.this.setVisible(false);
        Bookroom room;
        
        System.out.println(Calender.getDay());
        
        try {
            String selectedTime = Table.getColumnName(Table.getSelectedColumn());
            String selectedRoom = Table.getValueAt(Table.getSelectedRow(), 0).toString();
            
            if (Table.getSelectedRow() > -1 ) {
                String[] parts = selectedTime.split(":");
                if (Table.getSelectedColumn() > 0) {
                    if (signedIn) {
                        room = new Bookroom(parts[0], selectedRoom, Calender.getDay(), this.user);
                        room.setDay(Calender.getDay());
                        room.setVisible(true);        
                    }
                    else {
                        room = new Bookroom(parts[0], selectedRoom, Calender.getDay());
                        room.setDay(Calender.getDay());
                        room.setVisible(true);
                    }
                }
                else {
                    if (signedIn) {
                        room = new Bookroom("8", selectedRoom, Calender.getDay(), user);
                        room.setDay(Calender.getDay());
                        room.setVisible(true);
                    }
                    else {
                        room = new Bookroom("8", selectedRoom, Calender.getDay());
                        room.setDay(Calender.getDay());
                        room.setVisible(true);
                    } //bot else
                } //top else 
            } //top if
            
            else {
                if (signedIn) {
                    room = new Bookroom(Calender.getDay(), user);
                    room.setDay(Calender.getDay());
                    room.setVisible(true);
                }
                else {
                    room = new Bookroom(Calender.getDay());
                    room.setDay(Calender.getDay());
                    room.setVisible(true);
                } //bot else
            } //top else
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BookButtonActionPerformed

    private void jDayChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDayChooser1MouseClicked
        try {
            // TODO add your handling code here:
            getEvents(statement);
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDayChooser1MouseClicked

    private void jDayChooser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDayChooser1MousePressed
        try {
            // TODO add your handling code here:

            getEvents(statement);
            System.out.println("day mouse pressed");

        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDayChooser1MousePressed

    private void jDayChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDayChooser1FocusLost
        try {
            // TODO add your handling code here:

            getEvents(statement);
            System.out.println("day focus lost");
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDayChooser1FocusLost

    
    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        System.out.println("panel click");
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        System.out.println("panel press");
        try {
            getEvents(statement);
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jDayChooser1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDayChooser1MouseReleased
        
        System.out.println("hi");
        try {
            // TODO add your handling code here:
            getEvents(statement);
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jDayChooser1MouseReleased

    private void actionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
        getEvents(statement);
    }
    
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
            java.util.logging.Logger.getLogger(Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Resource().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public int getDay() {
        return Calender.getDay();
    }

    public void getEvents(Statement statement) throws SQLException {
        
        ResultSet resultSet = statement.executeQuery("SELECT * FROM event");
        
        while (resultSet.next()) {
            for (int i = 0; i < Table.getRowCount(); i++) { // 0-5
                for (int j = 0; j < Table.getColumnCount(); j++) { // 0-9

                    String columntime = Table.getColumnName(j);
                    String[] parts = columntime.split(":");
                
                    int day = Calender.getDay();
                
                    if (Table.getValueAt(i, 0).equals(resultSet.getString("room")) && parts[0].equals(resultSet.getString("time"))) {                    
                        if (day == resultSet.getInt("day")) {
                            Table.setValueAt("X", i, j);
                            //System.out.println("FOUND");
                        }
                        else 
                            Table.setValueAt("", i, j);
                    } //1st if
                } //2nd for
            } //1st for
        } //while
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BookButton;
    private com.toedter.calendar.JDayChooser Calender;
    private javax.swing.JLabel MathLabel;
    private javax.swing.JTable Table;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}

