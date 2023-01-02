package com.calsoft;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
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
    Assert.assertEquals("hello world", bos.toString());
    System.setOut(originalOut);
    dghbejbgekgekj
	}

}
//Just to show git demo
