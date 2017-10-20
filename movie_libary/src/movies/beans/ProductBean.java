/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies.beans;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import movie_libary.MyMovies;
import movies.utillites.ConnectionFactory;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/**
 *
 * @author jacobwahlstrom
 */
public class ProductBean {
    
    public MyMovies getMoviesFromDataBase() throws SQLException{
        MyMovies toReturn = new MyMovies();
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM movie_list";
            ResultSet data = stmt.executeQuery(sql);
            while(data.next()){
                toReturn.addMovie(data.getString("Title"),
                        data.getInt("Time"),
                        data.getString("Plot"),
                        data.getInt("Rating"),
                        data.getInt("ID"));
            }
              return toReturn; 
        }
             
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public boolean postMovie(String Title, String Plot, int Time, int Rating) throws SQLException{
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO movie_list VALUES('%s', '%s', %d, %d, id)"
                    ,Title, Plot, Time, Rating);
            stmt.executeUpdate(sql);
        
            connection.close();
            return true;
        }
  
             catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
       
        return false;
    }
    
    public boolean postMovieScrape(String link ) throws SQLException{
        //not done
        try {
            String url = String.format(link);
            Document imdbDoc = Jsoup.connect(url).get();
            
            String title  = imdbDoc.select("div.title_wrapper h1").html();
            
            if (title.contains("&nbsp")) {
                int index = title.indexOf("&nbsp");
                title = title.substring(0, index); 
            }
              
                int timeInH = 0;
                int timeInMin = 0;
               String timeInString  = imdbDoc.select("item[itemprop='duration']").html();
               if (timeInString.contains("h") ) {
                    timeInH = Integer.parseInt((timeInString.substring(0, timeInString.indexOf("h"))));
                    timeInMin = Integer.parseInt((timeInString.substring(3, timeInString.indexOf("m"))));
                
            }         
               String plot = imdbDoc.select("div .summary_text").html();
                               
               int rating = 5;

                double ratingD = Double.parseDouble(imdbDoc.select("div .ratingValue strong span").html());
                         
                rating = (int) ratingD;

                postMovie(title, plot, timeInMin, rating);
               
               
            return true;
        } catch (IOException e) {
            return false;
        }
        
        
    }
    
    public boolean removeMovie(int id) throws SQLException{
        try (Connection connection = ConnectionFactory.getConnection()) {
            Statement stmt = connection.createStatement();
            String sql = String.format( "DELETE FROM `movie_list` WHERE `movie_list`.`id` =" + id);
            stmt.execute(sql);
            
            connection.close();
            return true;
        }

             catch (SQLException ex){
            System.out.println(ex.getMessage());
        }        
        return false;
    }
}
