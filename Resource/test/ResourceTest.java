/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Statement;
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
public class ResourceTest {
    
    public ResourceTest() {
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
     * Test of main method, of class Resource.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Resource.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDay method, of class Resource.
     */
    @Test
    public void testGetDay() {
        myUser newuser = new myUser("Sean", "srkeyse", "password", "srkeyse", "admin");
        System.out.println("getDay");
        Resource instance = new Resource();
        int expResult = 0;
        int result = instance.getDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvents method, of class Resource.
     */
    @Test
    public void testGetEvents() throws Exception {
        System.out.println("getEvents");
        Statement statement = null;
        Resource instance = new Resource();
        instance.getEvents(statement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

