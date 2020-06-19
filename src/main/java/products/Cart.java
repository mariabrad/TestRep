/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import java.util.ArrayList;

 
public class Cart {
    public static Cart c=new Cart();
    public static ArrayList<Product> produse=new ArrayList<Product>();
    public Cart(){
        
    }
    public void add(Product p){
        produse.add(p);
    }
    public static Cart getCart() {
        return c;
    }
}
