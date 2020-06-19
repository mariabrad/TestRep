/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

/**
 *
 * @author mariabrad
 */

public class Product{
      
    private String id;
    private String nume;
    private String desc;
    private String ingr;
    private String prescriptie;
    private String expirare;
    private String pret;
    
    public Product(String a,String b, String c, String d, String e, String f,String g){
      id=a;
      nume=b;
      desc=c;
      expirare=d;
      prescriptie=e;
      ingr=f;
      pret=g;
    }
    
    
    public String getPret(){
        return pret;
    }
}
