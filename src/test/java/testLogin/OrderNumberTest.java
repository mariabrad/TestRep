/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testLogin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import main.java.products.OrderNumber;

/**
 *
 * @author mariabrad
 */
public class OrderNumberTest {
    
    int n,m;
    OrderNumber ord;
    
    @Before
    public void setUp() {
      ord=new OrderNumber();
    }
    @After
    public void tearDown() {
    }
    
    @Test
    public void testRandomNotNull(){
        
        n= ord.getNewAccountNumber();
        assertNotNull(n);
    }
     @Test
    public void testRandomNotEqual(){
        n= ord.getNewAccountNumber();
        m= ord.getNewAccountNumber();
        assertNotEquals(n,m);
    }
            

}
