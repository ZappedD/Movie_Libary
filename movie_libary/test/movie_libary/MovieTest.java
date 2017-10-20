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
public class MovieTest {
    
    public MovieTest() {
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
     * Test of setRating method, of class Movie.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        int rating = 2;
        int expResult = 2;
        Movie instance = new Movie("title", 10, "This i a plot", 5);
        instance.setRating(rating);
        int result = instance.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Movie.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movie instance = new Movie("title", 10, "This i a plot", 5);
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeInMin method, of class Movie.
     */
    @Test
    public void testGetTimeInMin() {
        System.out.println("getTimeInMin");
        Movie instance = new Movie("title", 10, "This i a plot", 5);
        int expResult = 10;
        int result = instance.getTimeInMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlot method, of class Movie.
     */
    @Test
    public void testGetPlot() {
        System.out.println("getPlot");
        Movie instance = new Movie("title", 10, "This i a plot", 5);
        String expResult = "This i a plot";
        String result = instance.getPlot();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRating method, of class Movie.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Movie instance = new Movie("title", 10, "This i a plot", 5);
        instance.setRating(5);
        int expResult = 5;
        int result = instance.getRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Movie.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Movie instance = new Movie("title", 10, "This i a plot", 5, 10);
        int expResult = 10;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Movie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Movie instance = new Movie("title", 10, "This i a plot", 5, 10);
        String expResult = "title=title, timeInMin:10, plot=This i a plot, rating=5";
        //"title=" + title + ", timeInMin:" + timeInMin + ", plot=" + plot + ", rating=" + rating;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
