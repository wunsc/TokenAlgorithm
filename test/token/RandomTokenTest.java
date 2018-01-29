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
public class RandomTokenTest {
    
    public RandomTokenTest() {
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
     * Test of getToken method, of class RandomToken.
     */
    @Test
    public void testGetToken() {
        System.out.println("getToken");
        RandomToken instance = new RandomToken();
        String expResult = instance.getToken();
        String result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of addToken method, of class RandomToken.
     */
    @Test
    public void testAddToken() {
        System.out.println("addToken");
        List tk = null;
        String token = "";
        RandomToken instance = new RandomToken();
        instance.addToken(tk, token);
    }

    /**
     * Test of viewToken method, of class RandomToken.
     */
    @Test
    public void testViewToken() {
        System.out.println("viewToken");
        List tk = null;
        RandomToken instance = new RandomToken();
        instance.viewToken(tk);
    }
    
}
