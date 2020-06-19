/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

/**
 *
 * @author mariabrad
 */
public class PasswordCompare {
    private String a, b;
    public PasswordCompare(String c, String d){
        a=c;
        b=d;
    }
    public boolean compare(){
        if(this.a.equals(this.b))
            return true;
        else return false;
    }
    
}
