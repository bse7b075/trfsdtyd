/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmtictests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-075
 */
public class CalculatorTest {
    
    public CalculatorTest() 
    {
       
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown() 
    {
    }

    @Test
    public void testSomeMethod() 
    {
       
    }
    @Test
    public void add()
    {
        Calculator obj= new Calculator();
        assertEquals( 100, obj.add(87,13)  );
       
    }
      @Test
    public void sub()
    {
        Calculator obj= new Calculator();
        assertNotEquals( 4, obj.sub(87,13)  );
       
    }
      @Test
    public void mul()
    {
        Calculator obj= new Calculator();
         assertEquals( 50, obj.mul(10,5)  );
       
    }
      @Test
    public void div()
    {
        Calculator obj= new Calculator();
        assertEquals( 2, obj.div(10,5)  );
       
    }
     public void rem()
    {
        Calculator obj= new Calculator();
        assertEquals( 0, obj.rem(10,5)  );
       
    }
}
