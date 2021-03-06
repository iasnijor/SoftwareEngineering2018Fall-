
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sean-
 */
public class myUser {
    private String name;
    private String username;
    private String password;
    private String email;
    private String uuid;
    
    private String level;
    
    public myUser(String name, String username, String password, String email, String level) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.level = level.toLowerCase();        
    }
    
    public void save(Statement statement) throws SQLException {
        if(name == "" || username == "" || password == "" || email == "") {
            throw new RuntimeException("Invalid (ID, First Name, Last Name)");
        }
        
        if (isGood(statement, name, email)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("INSERT INTO user (name, password, email, level) VALUES (")
                    .append("'").append(name).append("','")
                    .append(password).append("','")
                    .append(email).append("','")
                    .append(level).append("');");
        
                statement.executeUpdate(stringBuilder.toString());
        }
        
        else {
           System.out.println("Error adding new user");
        }
        //This is the command required to send our new string
        // statement was originally created in DBUI.java and handles
        //  sending SQL statements to the DataBase
    }
        
    private boolean isGood(Statement statement, String name, String email) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT email, name FROM user");
        
        while (resultSet.next()) {
            if (resultSet.getString("email").equals(email)) {
                if(resultSet.getString("name").equals(name)) {                    
                    //same name
                    System.out.println("Already registered with this name");
                    return false;
                }
                //same email
                System.out.println("Already registered with this email");
                return false;                
            }
        }
        return true;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLevel() {
        return level.toLowerCase();
    }
    
    public String getUser() {
        return username;
    }
    
}
