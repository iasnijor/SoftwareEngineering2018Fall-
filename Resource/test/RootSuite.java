/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Rojen
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ResourceTest.class, DayTest.class, BookroomTest.class, myTutorTest.class, SignInTest.class, Welcome1Test.class, UserTest.class, RegistrationTest.class, RoomTest.class, AdminRoomTest.class, ViewTutorTest.class, StudentTest.class, MouseListenerTest.class, AdminWelcomeTest.class, Images.ImagesSuite.class, TutorDayandTimeTest.class, resource.ResourceSuite.class, myEventTest.class, TutorWelcomeTest.class, ScheduleTest.class, TutorTest.class, TutorAddTest.class})
public class RootSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

