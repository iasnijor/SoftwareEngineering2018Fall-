
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean-
 */
public class mySession {
    myTutor tutor;
    String student;
    String subject;
    String day;
    String time;
    String contact;
        
    public mySession(myTutor tutor, String student, String subject, String day, String time, String contact) {
        this.tutor = tutor;
        this.student = student;
        this.subject = subject;
        this.day = day;
        this.time = time;
        this.contact = contact;
    }
    
    public mySession(mySession session) {
        tutor = session.getTutor();
        student = session.getStudent();
        subject = session.getSubject();
        day = session.getDay();
        time = session.getTime();
        contact = session.getContact();
    }
    
    public void save(Statement statement) throws SQLException {
        if(tutor.getName().equals("") || student.equals("") || subject.equals("")) {
            throw new RuntimeException("Invalid (ID, First Name, Last Name)");
        }
        
        System.out.println(this.time + " " + this.day + " " + tutor.getName());
        //if (isGood(statement)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("INSERT INTO session (tutor, student, subject, day, time, contact) VALUES (")
                    .append("'").append(tutor.getName()).append("','")
                    .append(student).append("','")
                    .append(subject).append("','")
                    .append(day).append("','")
                    .append(time).append("','")
                    .append(contact).append("');");
        
                statement.executeUpdate(stringBuilder.toString());
                
       // }
        
       // else {
         //   System.out.println("Error adding new event");
        //}
        //This is the command required to send our new string
        // statement was originally created in DBUI.java and handles
        //  sending SQL statements to the DataBase
    }
    public boolean isGood(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM session");
        while (resultSet.next()) {
            if (resultSet.getString("tutor").equals(tutor.getName()) && resultSet.getString("day").equals(this.day) && resultSet.getString("time").equals(this.time)) {
                
                return false;
            }
        }
        statement.close();
        resultSet.close();
        return true;
    }

    public myTutor getTutor() {
        return tutor;
    }

    public String getStudent() {
        return student;
    }

    public String getSubject() {
        return subject;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getContact() {
        return contact;
    }
    
}

