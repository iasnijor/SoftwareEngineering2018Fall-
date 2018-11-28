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
public class myEventTest {
    
    public myEventTest() {
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
     * Test of save method, of class myEvent.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Statement statement = null;
        myEvent instance = null;
        instance.save(statement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGood method, of class myEvent.
     */
    @Test
    public void testIsGood() throws Exception {
        System.out.println("isGood");
        Statement statement = null;
        int newtime = 0;
        String newRoom = "";
        int newDay = 0;
        myEvent instance = null;
        boolean expResult = false;
        boolean result = instance.isGood(statement, newtime, newRoom, newDay);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

