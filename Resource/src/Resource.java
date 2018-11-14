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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();

        jTextField2.setText("jTextField2");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setToolTipText("");
        jTable1.setMinimumSize(new java.awt.Dimension(155, 295));
        jTable1.setPreferredSize(new java.awt.Dimension(525, 300));
        jTable1.setRowHeight(50);
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(20);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Math Department Room Schedule");

        jDayChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDayChooser1FocusLost(evt);
            }
        });
        jDayChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDayChooser1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDayChooser1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDayChooser1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(553, 553, 553))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Resource.this.setVisible(false);
        Bookroom room;
        
        System.out.println(jDayChooser1.getDay());
        
        try {
            String selectedTime = jTable1.getColumnName(jTable1.getSelectedColumn());
            String selectedRoom = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            
            if (jTable1.getSelectedRow() > -1 ) {
                String[] parts = selectedTime.split(":");
                if (jTable1.getSelectedColumn() > 0) {
                    if (signedIn) {
                        room = new Bookroom(parts[0], selectedRoom, jDayChooser1.getDay(), this.user);
                        room.setDay(jDayChooser1.getDay());
                        room.setVisible(true);        
                    }
                    else {
                        room = new Bookroom(parts[0], selectedRoom, jDayChooser1.getDay());
                        room.setDay(jDayChooser1.getDay());
                        room.setVisible(true);
                    }
                }
                else {
                    if (signedIn) {
                        room = new Bookroom("8", selectedRoom, jDayChooser1.getDay(), user);
                        room.setDay(jDayChooser1.getDay());
                        room.setVisible(true);
                    }
                    else {
                        room = new Bookroom("8", selectedRoom, jDayChooser1.getDay());
                        room.setDay(jDayChooser1.getDay());
                        room.setVisible(true);
                    } //bot else
                } //top else 
            } //top if
            
            else {
                if (signedIn) {
                    room = new Bookroom(jDayChooser1.getDay(), user);
                    room.setDay(jDayChooser1.getDay());
                    room.setVisible(true);
                }
                else {
                    room = new Bookroom(jDayChooser1.getDay());
                    room.setDay(jDayChooser1.getDay());
                    room.setVisible(true);
                } //bot else
            } //top else
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
        return jDayChooser1.getDay();
    }

    public void getEvents(Statement statement) throws SQLException {
        
        ResultSet resultSet = statement.executeQuery("SELECT * FROM event");
        
        while (resultSet.next()) {
            for (int i = 0; i < jTable1.getRowCount(); i++) { // 0-5
                for (int j = 0; j < jTable1.getColumnCount(); j++) { // 0-9

                    String columntime = jTable1.getColumnName(j);
                    String[] parts = columntime.split(":");
                
                    int day = jDayChooser1.getDay();
                
                    if (jTable1.getValueAt(i, 0).equals(resultSet.getString("room")) && parts[0].equals(resultSet.getString("time"))) {                    
                        if (day == resultSet.getInt("day")) {
                            jTable1.setValueAt("X", i, j);
                            //System.out.println("FOUND");
                        }
                        else 
                            jTable1.setValueAt("", i, j);
                    } //1st if
                } //2nd for
            } //1st for
        } //while
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}

