/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_libary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacobwahlstrom
 */
public class MyMovies {
    private List<Movie> myMovieList = new ArrayList();
    private String nameOfList;

    public MyMovies(){
        this.nameOfList = "My Movie list";
    }
    
    public MyMovies(String nameOfList) {
        this.nameOfList = nameOfList;
//        load list from data base 
    }
    
    public boolean addMovie(String title, int timeInMin, String plot, int rating,int id){
    boolean added = false;
        if (this.myMovieList.add(new Movie(title, timeInMin, plot, rating, id))) {
            added = true;
            
        }
    return added;
    }
    
    public boolean addMovie(String title, int timeInMin, String plot, int id){
    boolean added = false;
        if (this.myMovieList.add(new Movie(title, timeInMin, plot, id))) {
            added = true;
            
        }
    return added;
    }

    public void setNameOfList(String nameOfList) {
        this.nameOfList = nameOfList;
    }

    public String getNameOfList() {
        return nameOfList;
    }
    
    public List getMyMovies(){
        return this.myMovieList;
    }
    
    public int getMovieRatingOf(String title){
        int index = this.findIndexOfMovie(title);
        if (index != -1) {
           return this.myMovieList.get(this.findIndexOfMovie(title)).getRating();
        }
        return -1;
    }
    
    public String getMovieTitleAt(int x){
        Movie toReturn = this.myMovieList.get(x);
        String movieTitle = "Not Found";
        if (toReturn != null) {
            movieTitle = toReturn.getTitle();
        }
        return movieTitle;
    }
    
    public String getMoviePlot(String title){
        int index = -1;
        index = this.findIndexOfMovie(title);
        if (index != -1) {
           return this.myMovieList.get(this.findIndexOfMovie(title)).getPlot();
        }
        return "Not found";
    }
    
    public int getMovieTime(String title){
        int index = -1;
        int timeInMin = -1;
        index = this.findIndexOfMovie(title);
        Movie movie = this.myMovieList.get(index);
        if (index != -1) {
            timeInMin = movie.getTimeInMin();   
        }
        return timeInMin;
    }
    
    public int getMovieRatingAt(int x){
        Movie toReturn = this.myMovieList.get(x);
        int rating = -1;
        if (toReturn != null) {
            rating = toReturn.getRating();
        }
        return rating;
    }

    public String toStringMovieAt(int x){
        Movie toReturn = this.myMovieList.get(x);
        String toString = "Not found movie att " + x;
        if (toReturn != null) {
            toString = toReturn.toString();
        }
        return toString;
    }
    
    public int getNrOfMovies() {

        return this.myMovieList.size();
    }

    public int getTiemToWatchAll() {
        int timeToWatch = 0; 
        for (int i = 0; i < this.myMovieList.size(); i++) {
            timeToWatch += this.myMovieList.get(i).getTimeInMin();
        }
        return timeToWatch;
    }
    
    public int getMovieID(String title){
        int id = -1;
        if (this.myMovieList.get(findIndexOfMovie(title)).getID() != -1) {
            id = this.myMovieList.get(findIndexOfMovie(title)).getID();
        }
        return id;
    }
    
    public boolean setMovieRatingAt(int x,int y){
        Movie toChange = this.myMovieList.get(x);
        boolean result = false;
        if (toChange != null) {
            toChange.setRating(y);
            this.myMovieList.set(x, toChange);
            result = true;
        }
        return result;
    }
    
    public int findIndexOfMovie(String titleToFind){
        int index = -1;
        for (int i = 0; i < this.myMovieList.size(); i++) {
            if (titleToFind.equals(this.myMovieList.get(i).getTitle())) {
                index = i;
            }
        }
        return index;
    }
    
    public boolean removeMovie(String title){
        boolean removed = false;
        int index = this.findIndexOfMovie(title);
        if (index != -1) {
         this.myMovieList.remove(index);
         removed = true;
        }
        return removed;
    }
    
    public Movie findMovie(String title){
        Movie exist = null;
        int index = this.findIndexOfMovie(title);
        if (index != -1) {
            exist = this.myMovieList.get(index);
        }
        return exist;
    }
    
    
}
