/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies.utillites;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jacobwahlstrom
 */
public class ConnectionFactory {
       public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost/datamovies";
        String user = "root";
        String password = "";
        Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, password);
        return connection;
    }
}
