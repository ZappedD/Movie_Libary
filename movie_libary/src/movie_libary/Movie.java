/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_libary;

/**
 *
 * @author jacobwahlstrom
 */
public class Movie {

    private String title;
    private int timeInMin;
    private String plot;
    private int rating;
    private int id;

    public Movie() {

    }

    public Movie(String title, int timeInMin, String plot, int rating, int id) {
        this.title = title;
        this.timeInMin = timeInMin;
        this.plot = plot;
        this.rating = rating;
        this.id = id;
    }

    public Movie(String title, int timeInMin, String plot, int id) {
        this.title = title;
        this.timeInMin = timeInMin;
        this.plot = plot;
        this.id = id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getTimeInMin() {
        return timeInMin;
    }

    public String getPlot() {
        return this.plot;
    }

    public int getRating() {
        return this.rating;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "title=" + title + ", timeInMin:" + timeInMin + ", plot=" + plot + ", rating=" + rating;
    }

}
