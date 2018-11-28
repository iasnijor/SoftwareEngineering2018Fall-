/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class TutorAddTest {
    
    public TutorAddTest() {
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
     * Test of main method, of class TutorAdd.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TutorAdd.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInformation method, of class TutorAdd.
     */
    @Test
    public void testGetInformation() {
        System.out.println("getInformation");
        TutorAdd instance = new TutorAdd();
        instance.getInformation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asArray method, of class TutorAdd.
     */
    @Test
    public void testAsArray() {
        System.out.println("asArray");
        ArrayList<Integer> day = null;
        TutorAdd instance = new TutorAdd();
        int[] expResult = null;
        int[] result = instance.asArray(day);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

