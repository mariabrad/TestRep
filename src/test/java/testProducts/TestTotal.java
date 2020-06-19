/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.testProducts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import main.java.products.Total;

public class TestTotal extends TestCase{

    float b;
    Total obj;

    @Before
    public void setUp(){
        b=30;
    }
     @After
    public void tearDown(){
        b=0;
    }
    
    @Test
    public void testTotalValueTrue(){
        obj = new Total(15);
        assertTrue(obj.tot()==b);
    }
    
   @Test
    public void testTotalValueFalse(){
        obj = new Total(20);
        assertFalse(obj.tot()==b);
    }
    

}

