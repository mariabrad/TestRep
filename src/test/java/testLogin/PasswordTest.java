/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.testLogin;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import main.java.log.HashPassword;

/**
 *
 * @author mariabrad
 */
public class PasswordTest extends TestCase{
    
    String test;
    String testEncrypt;
    String test1;
   
    
    @Before
    public void setUp() {
        test= "test1";
        testEncrypt="5a105e8b9d40e1329780d62ea2265d8a";
        test1= "test2";

    }
    
    @After
    public void tearDown() {
        test=null;
        testEncrypt=null;
        test1=null;
    }
    
    @Test
    public void testEncryptTrue(){
         HashPassword pass= new HashPassword(test);
         assertTrue(testEncrypt.equals(pass.encrypt()));
         
    }
     @Test
    public void testEncryptFalse(){
         HashPassword pass= new HashPassword(test1);
         assertFalse(testEncrypt.equals(pass.encrypt()));
         
    }
}
