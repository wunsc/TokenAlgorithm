/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package token;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MuhammadTaufik
 */
public class MainTest {
    
    public MainTest() {
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
     * Test of getToken method, of class Main.
     */
    @Test
    public void testGetToken() {
        System.out.println("getToken");
        Main instance = new Main();
    //    String expResult = "";
      //  String result = instance.getToken();
        assertEquals("",instance.getToken(), "");
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addToken method, of class Main.
     */
    @Test
    public void testAddToken() {
        System.out.println("addToken");
        List tk = null;
        String token = "";
        Main instance = new Main();
        instance.addToken(tk, token);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of viewToken method, of class Main.
     */
    @Test
    public void testViewToken() {
        System.out.println("viewToken");
        List tk = null;
        Main instance = new Main();
        instance.viewToken(tk);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
