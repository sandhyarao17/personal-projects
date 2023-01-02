package com.calsoft;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
public void testmain() {
    PrintStream originalOut = System.out; 
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bos));
    App.main(null);
    System.out.println("#"+bos.toString()+"#");
    //Assert.assertTrue("Hello-World".equals(bos.toString()));
    System.setOut(originalOut);
	}

}
//Just to show git demo
