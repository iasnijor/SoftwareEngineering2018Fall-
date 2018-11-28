/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class DayTest {
    
    public DayTest() {
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
     * Test of setstartTime method, of class Day.
     */
    @Test
    public void testSetstartTime() {
        System.out.println("setstartTime");
        int startTime = 0;
        Day instance = new Day();
        instance.setstartTime(startTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatenetTime method, of class Day.
     */
    @Test
    public void testCalculatenetTime() {
        System.out.println("calculatenetTime");
        Day instance = new Day();
        instance.calculatenetTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setendTime method, of class Day.
     */
    @Test
    public void testSetendTime() {
        System.out.println("setendTime");
        int endTime = 0;
        Day instance = new Day();
        instance.setendTime(endTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getstartTime method, of class Day.
     */
    @Test
    public void testGetstartTime() {
        System.out.println("getstartTime");
        Day instance = new Day();
        int expResult = 0;
        int result = instance.getstartTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getendTime method, of class Day.
     */
    @Test
    public void testGetendTime() {
        System.out.println("getendTime");
        Day instance = new Day();
        int expResult = 0;
        int result = instance.getendTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnetHours method, of class Day.
     */
    @Test
    public void testGetnetHours() {
        System.out.println("getnetHours");
        Day instance = new Day();
        int expResult = 0;
        int result = instance.getnetHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

