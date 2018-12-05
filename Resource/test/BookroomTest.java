/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rojen
 */
public class BookroomTest {
    
    public BookroomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Bookroom.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bookroom.main(args);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Bookroom Main :)");
    }
    
    @Test
    public void testSubmit() throws ClassNotFoundException, SQLException {
        //String Name = NameTextField.getText();
        //String Contact= ContactTextField.getText();
        //String myEvent= EventTextField.getText();
        //Object Room= RoomSpinner.getValue();
        //Room=Room.toString();
        myUser newuser = new myUser("Sean", "srkeyse", "password", "srkeyse", "admin");
        Bookroom instance = new Bookroom("4", "Conference Small", 66, newuser);
        instance.submit();
        
        if(Bookroom.statement.executeUpdate("DELETE FROM event WHERE name = 'Sean' AND day = '66';") == -1)
            fail("Event Doesn't Exist");
    }
}

