/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_libary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob
 */
public class MyMoviesUITest {
    
    public MyMoviesUITest() {
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
     * Test of main method, of class MyMoviesUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyMoviesUI.main(args);
    }

    /**
     * Test of updateMyMovies method, of class MyMoviesUI.
     */
    @Test
    public void testUpdateMyMovies() {
        System.out.println("updateMyMovies");
        MyMoviesUI instance = new MyMoviesUI();
        instance.updateMyMovies();
    }
    
}
