/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testLogin;

import log.PasswordCompare;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariabrad
 */
public class RoleTest {
    
    String role1;
    String role2;
    String v1;
    
    @Before
    public void setUp() {
        role1="Business Manager";
        role2="Customer";
    }
    
    @After
    public void tearDown() {
        role1= null;
        role2= null;
        v1=null;
    }

    @Test
    public void roleManagerTestTrue(){
        v1="Business Manager";
        PasswordCompare r= new PasswordCompare(v1,role1);
        assertTrue(r.compare());
    }
    @Test
    public void roleManagerTestFalse(){
        v1="Business Manager";
        PasswordCompare r= new PasswordCompare(v1,role2);
        assertFalse(r.compare());
    }
    @Test
    public void roleCustomerTestTrue(){
        v1="Customer";
        PasswordCompare r= new PasswordCompare(v1,role2);
        assertTrue(r.compare());
    }
    @Test
    public void roleCustomerTestFalse(){
        v1="Customer";
        PasswordCompare r= new PasswordCompare(v1,role1);
        assertFalse(r.compare());
    }
}
