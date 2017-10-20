/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies.beans;

import movie_libary.MyMovies;
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
public class ProductBeanTest {
    
    public ProductBeanTest() {
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
     * Test of getMoviesFromDataBase method, of class ProductBean.
     */
    @Test
    public void testGetMoviesFromDataBase() throws Exception {
        System.out.println("getMoviesFromDataBase");
        ProductBean instance = new ProductBean();
        MyMovies expResult = null;
        MyMovies result = instance.getMoviesFromDataBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postMovie method, of class ProductBean.
     */
    @Test
    public void testPostMovie() throws Exception {
        System.out.println("postMovie");
        String Title = "";
        String Plot = "";
        int Time = 0;
        int Rating = 0;
        ProductBean instance = new ProductBean();
        boolean expResult = false;
        boolean result = instance.postMovie(Title, Plot, Time, Rating);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postMovieScrape method, of class ProductBean.
     */
    @Test
    public void testPostMovieScrape() throws Exception {
        System.out.println("postMovieScrape");
        String link = "";
        ProductBean instance = new ProductBean();
        boolean expResult = false;
        boolean result = instance.postMovieScrape(link);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMovie method, of class ProductBean.
     */
    @Test
    public void testRemoveMovie() throws Exception {
        System.out.println("removeMovie");
        int id = 0;
        ProductBean instance = new ProductBean();
        boolean expResult = false;
        boolean result = instance.removeMovie(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
