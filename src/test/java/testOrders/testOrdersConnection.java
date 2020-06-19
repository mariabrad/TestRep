/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import order.Orders;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariabrad
 */
public class testOrdersConnection {
    

    @Test
    public void testConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from Credentials.orders").executeQuery().next());
           
           
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
            assertTrue(con1.prepareStatement("select * from Credentials.orders").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
            thrown=true;
      
        } catch (SQLException ex) {
            Logger.getLogger(testOrdersConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(thrown);
    }
}
