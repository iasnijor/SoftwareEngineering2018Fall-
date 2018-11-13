
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean-
 */
public class myEvent {
    String roomName;
    int time;
    String contact;
    String eventName;
    String contactName;
    
    public myEvent(String roomName, int time, String contactName, String contact, String eventName) {
        this.roomName = roomName;
        this.time = time;
        this.contactName = contactName;
        this.contact = contact;
        this.eventName = eventName;
    }
    
    public void save(Statement statement) throws SQLException {
        if(roomName == "" || time == -1 || eventName == "" || contact == "") {
            throw new RuntimeException("Invalid (ID, First Name, Last Name)");
        }
        if (isGood(statement, time, roomName)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("INSERT INTO event (name, contact, event, room, time) VALUES (")
                    .append("'").append(contactName).append("','")
                    .append(contact).append("','")
                    .append(eventName).append("','")
                    .append(roomName).append("','")
                    .append(time).append("');");
        
                statement.executeUpdate(stringBuilder.toString());
        }
        
        else {
            System.out.println("Error adding new event");
        }
        //This is the command required to send our new string
        // statement was originally created in DBUI.java and handles
        //  sending SQL statements to the DataBase
    }
    public boolean isGood(Statement statement, int newtime, String newRoom) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM event");
        
        while (resultSet.next()) {
            if (resultSet.getString("room").equals(newRoom) || newtime == Integer.parseInt(resultSet.getString("time")))
                return false;
        }
        return true;
    }
}

