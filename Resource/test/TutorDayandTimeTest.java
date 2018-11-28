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
public class TutorDayandTimeTest {
    
    public TutorDayandTimeTest() {
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
     * Test of main method, of class TutorDayandTime.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TutorDayandTime.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchedule method, of class TutorDayandTime.
     */
    @Test
    public void testGetSchedule() {
        System.out.println("getSchedule");
        Statement statement = null;
        TutorDayandTime instance = new TutorDayandTime();
        instance.getSchedule(statement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

