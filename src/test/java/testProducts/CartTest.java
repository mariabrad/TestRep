/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testProducts;

import products.Cart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import products.Product;
import junit.framework.*;

/**
 *
 * @author mariabrad
 */
public class CartTest extends TestCase {
    
    Cart cart;
    Product p,q;
    @Before
    public void setUp() {
        cart=new Cart();
        p=new Product("a","b","c","d","e","f","g");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddCart(){
        cart.produse.add(p);
        for(Product i:cart.produse){
            q=i;
        }
        assertEquals(p,q);
    }
    
    @Test
    public void testGetCart(){
        assertNotNull(cart.getCart());
    }
    
}
