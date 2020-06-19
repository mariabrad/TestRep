/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.testLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import testOrders.testOrdersConnection;

/**
 *
 * @author mariabrad
 */
public class testLogin {
    
  @Test
    public void testConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from Credentials.tabel").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void testConnectionExc(){
        boolean thrown=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driverrr");
            Connection con1 =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from Credentials.tabel").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
            thrown=true;
      
        } catch (SQLException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(thrown);
    }
}
