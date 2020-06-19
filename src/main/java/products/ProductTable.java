/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mariabrad
 */
public class ProductTable {
    public ResultSet create(String p) throws ClassNotFoundException, SQLException{
        
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
             PreparedStatement ps = connection.prepareStatement("SELECT * FROM `produse` WHERE `nume` = ? OR  `ingredient` = ?");
             ps.setString(1,p);
             ps.setString(2,p);
             return ps.executeQuery();
             
    }
}
