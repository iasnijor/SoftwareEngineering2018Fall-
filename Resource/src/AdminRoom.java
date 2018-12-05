
import java.sql.Statement;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *AdminRoom Panel for allowing admin to approve and decline Room requests
 * @author Rojen
 */
public class AdminRoom extends javax.swing.JFrame {

    /**
     * Creates new form AdminRoom
     */
    // path to db
    File file = new File("./ScheduleSystem.db");
    myUser user;
    boolean first = true;
    ArrayList<myRequest> requests = new ArrayList();
    
    private boolean signedIn;
    
    public AdminRoom() {
        initComponents();
    }
    
    public AdminRoom(myUser user) {
        initComponents();
        this.user = user;
        signedIn = true;
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            Connection connection = DriverManager.getConnection(DB_NAME);
            statement = connection.createStatement();
            
            getRequests();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RoomRequestTable = new javax.swing.JTable();
        ApproveButton = new javax.swing.JButton();
        DeclineButton = new javax.swing.JButton();
        RoomLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RoomRequestTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RoomRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room", "Date"
            }
        ));
        RoomRequestTable.setRowHeight(30);
        RoomRequestTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(RoomRequestTable);

        ApproveButton.setText("Approve");
        ApproveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveButtonActionPerformed(evt);
            }
        });

        DeclineButton.setText("Decline");
        DeclineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeclineButtonActionPerformed(evt);
            }
        });

        RoomLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RoomLabel.setText("Room Requests");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 344, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)
                        .addGap(440, 440, 440)
                        .addComponent(RoomLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(ApproveButton)
                        .addGap(83, 83, 83)
                        .addComponent(DeclineButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BackButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(RoomLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApproveButton)
                    .addComponent(DeclineButton))
                .addGap(36, 36, 36))
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

/**
 * Back Button takes to the previous window for the admin
 * @param evt evt is and ActionEvent
 */                                     


    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        if (signedIn) {
            // holds user to pass back to home page
            // keeps user signed in
            AdminRoom.this.setVisible(false);
            AdminWelcome welcome = new AdminWelcome(user);
            welcome.setVisible(true);
        }
        else {
            AdminRoom.this.setVisible(false);
            AdminWelcome welcome = new AdminWelcome();
            welcome.setVisible(true);
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeclineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeclineButtonActionPerformed
        int index = RoomRequestTable.getSelectedRow();
        try {
            removeRequest(index);
            AdminRoom.this.setVisible(false);
            AdminRoom newad = new AdminRoom(user);
            newad.setVisible(true);
            //RoomRequestTable.removeAll();
            
            getRequests();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_DeclineButtonActionPerformed

    private void ApproveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveButtonActionPerformed
        // TODO add your handling code here:
        int index = RoomRequestTable.getSelectedRow();
        try {
            createEvent(index);
            AdminRoom.this.setVisible(false);
            AdminRoom newad = new AdminRoom(user);
            newad.setVisible(true);
            //RoomRequestTable.removeAll();
            
            getRequests();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ApproveButtonActionPerformed


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
            java.util.logging.Logger.getLogger(AdminRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoom().setVisible(true);
            }
        });
    }

// variables for different Buttons and Labels
    

    
    public void getRequests() throws SQLException {
        ResultSet rs;
        //statement.cancel();
        //statement.close();
        rs = statement.executeQuery("SELECT * FROM request");
        
            
        while (rs.next()) {
            requests.add(new myRequest(rs.getString("room"), rs.getInt("time"), rs.getString("name"), rs.getString("contact"), rs.getString("event"), rs.getInt("day")));
        }
        
        for (int i=0; i < requests.size(); i++) {
            RoomRequestTable.setValueAt(requests.get(i).getRoomName(), i, 0);
            RoomRequestTable.setValueAt("Day: " + String.valueOf(requests.get(i).getDay()) + ", Time: " + String.valueOf(requests.get(i).getTime()), i, 1);
        }
        
        rs.close();
        
    }
    
    public void createEvent(int index) throws SQLException {
        myEvent newEvent;
        myRequest selectedRequest = new myRequest(requests.get(index));
        newEvent = new myEvent(requests.get(index));
        newEvent.save(statement);
        selectedRequest.removeRequest(statement);
        requests.remove(index);
    }
    
    public void removeRequest(int index) throws SQLException {
        if(RoomRequestTable.getSelectedRow() != -1 && !(RoomRequestTable.getValueAt(RoomRequestTable.getSelectedRow(), 0) == null)) {
            myRequest selectedRequest = new myRequest(requests.get(index));
            selectedRequest.removeRequest(statement);
            requests.remove(index);
        }
        else {
            JOptionPane.showMessageDialog(this, "Select a Request");
        }
    }
    
    public void removeEvent(String contact) {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DeclineButton;
    private javax.swing.JLabel RoomLabel;
    private javax.swing.JTable RoomRequestTable;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

