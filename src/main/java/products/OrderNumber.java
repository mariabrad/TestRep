/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.products;

/**
 *
 * @author mariabrad
 */
public class OrderNumber {


    public int getNewAccountNumber() {
       int random = (int)(Math.random() * 50 + 1);
       return random;
    }
}