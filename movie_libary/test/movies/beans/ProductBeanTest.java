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
//    @Test
//    public void testGetMoviesFromDataBase() throws Exception {
//        System.out.println("getMoviesFromDataBase");
//        ProductBean instance = new ProductBean();
//        MyMovies expResult = instance.getMoviesFromDataBase();
//        MyMovies result = instance.getMoviesFromDataBase();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of postMovie method, of class ProductBean.
     */
    @Test
    public void testPostMovie() throws Exception {
        System.out.println("postMovie");
        String Title = "test";
        String Plot = "test";
        int Time = 1;
        int Rating = 1;
        ProductBean instance = new ProductBean();
        boolean expResult = true;
        boolean result = instance.postMovie(Title, Plot, Time, Rating);
        assertEquals(expResult, result);
    }

    /**
     * Test of postMovieScrape method, of class ProductBean.
     */
    @Test
    public void testPostMovieScrape() throws Exception {
        System.out.println("postMovieScrape");
        String link = "http://www.imdb.com/title/tt0114814";
        ProductBean instance = new ProductBean();
        boolean expResult = true;
        boolean result = instance.postMovieScrape(link);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeMovie method, of class ProductBean.
     */
    @Test
    public void testRemoveMovie() throws Exception {
        System.out.println("removeMovie");
        int id = 4;
        ProductBean instance = new ProductBean();
        boolean expResult = true;
        boolean result = instance.removeMovie(id);
        assertEquals(expResult, result);
    }
    
}
