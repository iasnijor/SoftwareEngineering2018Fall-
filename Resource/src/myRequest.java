
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
public class myRequest {
    String roomName;
    int time;
    String contact;
    String eventName;
    String contactName;

    public String getContact() {
        return contact;
    }

    public String getEventName() {
        return eventName;
    }

    public String getContactName() {
        return contactName;
    }
    int day;
    int month;
        
    public myRequest(String roomName, int time, String contactName, String contact, String eventName, int day) {
        this.roomName = roomName;
        this.time = time;
        this.contactName = contactName;
        this.contact = contact;
        this.eventName = eventName;
        this.day = day;
    }
    
    public myRequest(myRequest request) {
        roomName = request.getRoomName();
        time = request.getTime();
        contactName = request.getContactName();
        contact = request.getContact();
        eventName = request.getEventName();
        day = request.getDay();
    }
    
    public void save(Statement statement) throws SQLException {
        if(roomName == "" || time == -1 || eventName == "" || contact == "") {
            throw new RuntimeException("Invalid (ID, First Name, Last Name)");
        }
        

        
        if (isGood(statement, time, roomName, day)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("INSERT INTO request (name, contact, event, room, time, day) VALUES (")
                    .append("'").append(contactName).append("','")
                    .append(contact).append("','")
                    .append(eventName).append("','")
                    .append(roomName).append("','")
                    .append(time).append("','")
                    .append(day).append("');");
        
                statement.executeUpdate(stringBuilder.toString());
        }
        
        else {
            System.out.println("Error adding new request");
        }
        //This is the command required to send our new string
        // statement was originally created in DBUI.java and handles
        //  sending SQL statements to the DataBase
    }
    public boolean isGood(Statement statement, int newtime, String newRoom, int newDay) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM request");
        
        while (resultSet.next()) {
            if (resultSet.getString("room").equals(newRoom) && newtime == resultSet.getInt("time") && newDay == resultSet.getInt("day")) {
                
                return false;
            }
        }
        return true;
    }
    
    public void removeRequest(Statement statement) throws SQLException {
        System.out.println(roomName + "   " + time + "    " + day);
        //statement.executeUpdate
        System.out.println("DELETE FROM request WHERE room= '" + roomName + "' AND time=" + time + " AND day=" + day + ";");
        statement.executeUpdate("DELETE FROM request WHERE room = '" + roomName + "' AND time = " + time + " AND day = " + day);
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public int getTime() {
        return time;
    }
    
    public int getDay() {
        return day;
    }
}

