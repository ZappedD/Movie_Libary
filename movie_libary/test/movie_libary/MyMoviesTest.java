/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_libary;

import java.util.List;
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
public class MyMoviesTest {
    
    public MyMoviesTest() {
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
     * Test of addMovie method, of class MyMovies.
     */
    @Test
    public void testAddMovie_5args() {
        System.out.println("addMovie");
        String title = "";
        int timeInMin = 0;
        String plot = "";
        int rating = 0;
        int id = 0;
        MyMovies instance = new MyMovies();
        boolean expResult = false;
        boolean result = instance.addMovie(title, timeInMin, plot, rating, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMovie method, of class MyMovies.
     */
    @Test
    public void testAddMovie_4args() {
        System.out.println("addMovie");
        String title = "";
        int timeInMin = 0;
        String plot = "";
        int id = 0;
        MyMovies instance = new MyMovies();
        boolean expResult = false;
        boolean result = instance.addMovie(title, timeInMin, plot, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameOfList method, of class MyMovies.
     */
    @Test
    public void testSetNameOfList() {
        System.out.println("setNameOfList");
        String nameOfList = "";
        MyMovies instance = new MyMovies();
        instance.setNameOfList(nameOfList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameOfList method, of class MyMovies.
     */
    @Test
    public void testGetNameOfList() {
        System.out.println("getNameOfList");
        MyMovies instance = new MyMovies();
        String expResult = "";
        String result = instance.getNameOfList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyMovies method, of class MyMovies.
     */
    @Test
    public void testGetMyMovies() {
        System.out.println("getMyMovies");
        MyMovies instance = new MyMovies();
        List expResult = null;
        List result = instance.getMyMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieRatingOf method, of class MyMovies.
     */
    @Test
    public void testGetMovieRatingOf() {
        System.out.println("getMovieRatingOf");
        String title = "";
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getMovieRatingOf(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieTitleAt method, of class MyMovies.
     */
    @Test
    public void testGetMovieTitleAt() {
        System.out.println("getMovieTitleAt");
        int x = 0;
        MyMovies instance = new MyMovies();
        String expResult = "";
        String result = instance.getMovieTitleAt(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoviePlot method, of class MyMovies.
     */
    @Test
    public void testGetMoviePlot() {
        System.out.println("getMoviePlot");
        String title = "";
        MyMovies instance = new MyMovies();
        String expResult = "";
        String result = instance.getMoviePlot(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieTime method, of class MyMovies.
     */
    @Test
    public void testGetMovieTime() {
        System.out.println("getMovieTime");
        String title = "";
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getMovieTime(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieRatingAt method, of class MyMovies.
     */
    @Test
    public void testGetMovieRatingAt() {
        System.out.println("getMovieRatingAt");
        int x = 0;
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getMovieRatingAt(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringMovieAt method, of class MyMovies.
     */
    @Test
    public void testToStringMovieAt() {
        System.out.println("toStringMovieAt");
        int x = 0;
        MyMovies instance = new MyMovies();
        String expResult = "";
        String result = instance.toStringMovieAt(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrOfMovies method, of class MyMovies.
     */
    @Test
    public void testGetNrOfMovies() {
        System.out.println("getNrOfMovies");
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getNrOfMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiemToWatchAll method, of class MyMovies.
     */
    @Test
    public void testGetTiemToWatchAll() {
        System.out.println("getTiemToWatchAll");
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getTiemToWatchAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieID method, of class MyMovies.
     */
    @Test
    public void testGetMovieID() {
        System.out.println("getMovieID");
        String title = "";
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.getMovieID(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovieRatingAt method, of class MyMovies.
     */
    @Test
    public void testSetMovieRatingAt() {
        System.out.println("setMovieRatingAt");
        int x = 0;
        int y = 0;
        MyMovies instance = new MyMovies();
        boolean expResult = false;
        boolean result = instance.setMovieRatingAt(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findIndexOfMovie method, of class MyMovies.
     */
    @Test
    public void testFindIndexOfMovie() {
        System.out.println("findIndexOfMovie");
        String titleToFind = "";
        MyMovies instance = new MyMovies();
        int expResult = 0;
        int result = instance.findIndexOfMovie(titleToFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMovie method, of class MyMovies.
     */
    @Test
    public void testRemoveMovie() {
        System.out.println("removeMovie");
        String title = "";
        MyMovies instance = new MyMovies();
        boolean expResult = false;
        boolean result = instance.removeMovie(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMovie method, of class MyMovies.
     */
    @Test
    public void testFindMovie() {
        System.out.println("findMovie");
        String title = "";
        MyMovies instance = new MyMovies();
        Movie expResult = null;
        Movie result = instance.findMovie(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
