package ap_assignment01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class StackTest 
{
    static private Stack instance = new Stack(5);
    
    
    @Before 
    public void setUpClass() throws Exception {
    	
    	instance.push(4);
    	instance.push(6);
    	instance.push(3);
    	instance.push(1);
    	instance.displayStack();
    }
    
    @After
    public void cleanUpClass () throws Exception { 
    	
    	if (instance.size()!=0) {
	        //Popping all the elements of Stack
	        for (int i=0;i<5;++i) {
	        	instance.pop();
	        }
    	}
    }
    
    /**
     * Test of pop method, of class Stack.
     * @throws Exception 
     */
    @Test
    public void testPop() throws Exception 
    {
        System.out.println("pop");
        assertEquals( 1, instance.pop());
        
        try {
        	 for (int i=0;i<5;++i) {
             	instance.pop();
             }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
    }
    
    @Test
    public void testPush() throws Exception 
    {
        System.out.println("push");
        instance.push( -17 );
        assertEquals( instance.top(), -17 );
        
        try {
			instance.push(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		}
        
    }

    @Test
    public void testTop() throws Exception 
    {
        System.out.println("top");
        instance.push( 1 );
        assertEquals( 1, instance.top());
        
        //Popping all the elements of Stack
        for (int i=0;i<5;++i) {
        	instance.pop();
        }
        
        try {
        	instance.top();
        } catch (Exception e) {
        	System.out.print(e.getMessage());
        }
    }
    
}