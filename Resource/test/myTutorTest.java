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
public class myTutorTest {
    
    public myTutorTest() {
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
     * Test of save method, of class myTutor.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Statement statement = null;
        myTutor instance = null;
        instance.save(statement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class myTutor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClasses method, of class myTutor.
     */
    @Test
    public void testGetClasses() {
        System.out.println("getClasses");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getClasses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonday method, of class myTutor.
     */
    @Test
    public void testGetMonday() {
        System.out.println("getMonday");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getMonday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTuesday method, of class myTutor.
     */
    @Test
    public void testGetTuesday() {
        System.out.println("getTuesday");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getTuesday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWednesday method, of class myTutor.
     */
    @Test
    public void testGetWednesday() {
        System.out.println("getWednesday");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getWednesday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThursday method, of class myTutor.
     */
    @Test
    public void testGetThursday() {
        System.out.println("getThursday");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getThursday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFriday method, of class myTutor.
     */
    @Test
    public void testGetFriday() {
        System.out.println("getFriday");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getFriday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlgebra method, of class myTutor.
     */
    @Test
    public void testGetAlgebra() {
        System.out.println("getAlgebra");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getAlgebra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreCalc method, of class myTutor.
     */
    @Test
    public void testGetPreCalc() {
        System.out.println("getPreCalc");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getPreCalc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalc method, of class myTutor.
     */
    @Test
    public void testGetCalc() {
        System.out.println("getCalc");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getCalc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStats method, of class myTutor.
     */
    @Test
    public void testGetStats() {
        System.out.println("getStats");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getStats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchedule method, of class myTutor.
     */
    @Test
    public void testGetSchedule() {
        System.out.println("getSchedule");
        int day = 0;
        myTutor instance = null;
        String expResult = "";
        String result = instance.getSchedule(day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class myTutor.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        myTutor instance = null;
        String expResult = "";
        String result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toIndices method, of class myTutor.
     */
    @Test
    public void testToIndices() {
        System.out.println("toIndices");
        String day = "";
        myTutor instance = null;
        int[] expResult = null;
        int[] result = instance.toIndices(day);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

