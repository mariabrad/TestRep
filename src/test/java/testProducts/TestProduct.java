/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testProducts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import products.Product;
/**
 *
 * @author mariabrad
 */
public class TestProduct {
    
    Product p;
    String id;
    String nume;
    String desc;
    String ingr;
    String prescriptie;
    String expirare;
    String pret;
    
    
    @Before
    public void setUp() {
      id="a";
      nume="b";
      desc="c";
      expirare="d";
      prescriptie="e";
      pret="g";
      ingr="f";
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetTrue(){
        p=new Product("a","b","c","d","e","f","g");
        assertTrue("g".equals(p.getPret()));
    }
    @Test
    public void testGetFalse(){
        p=new Product("a","b","c","d","e","f","f");
        assertFalse("g".equals(p.getPret()));
    }
     @Test
    public void testGetNull(){
        p=new Product("a","b","c","d","e","f",null);
        assertNull(p.getPret());
    }
}
