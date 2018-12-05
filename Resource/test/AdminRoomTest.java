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
public class AdminRoomTest {
    
        myUser newuser = new myUser("Sean", "srkeyse", "password", "srkeyse", "admin");
        //myRequest req = new myRequest("Test", 12, "Tester", "Test@test.com", "Testing", 12);
    public AdminRoomTest() {
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
     * Test of main method, of class AdminRoom.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AdminRoom.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
        System.out.println("Main :)");
    }

    /**
     * Test of getRequests method, of class AdminRoom.
     */
    @Test
    public void testGetRequests() throws Exception {
        
        myRequest req = new myRequest("Test", 12, "Tester", "Test@test.com", "Testing", 12);
        System.out.println("getRequests");
        AdminRoom instance = new AdminRoom(newuser);
        instance.getRequests();
        if (instance.requests.isEmpty()) {
            fail("fail");
        }
    }

    /**
     * Test of createEvent method, of class AdminRoom.
     */
    @Test
    public void testCreateEvent() throws Exception {
        myRequest req = new myRequest("Test", 12, "Tester", "Test@test.com", "Testing", 12);
        System.out.println("createEvent");
        int index = 0;
        AdminRoom instance = new AdminRoom(newuser);
        
    //public myRequest(String roomName, int time, String contactName, String contact, String eventName, int day) {
        req.save(AdminRoom.statement);
        instance.requests.add(0, req);
        if(instance.requests.isEmpty()) {
            fail("Requests empty");
        }
        
        instance.createEvent(0);
        AdminRoom.statement.executeUpdate("DELETE FROM event WHERE name = 'Tester';");
    }
    
}

