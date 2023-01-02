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
    Assert.assertTrue(bos.toString().contains("Hello-World"));
    System.setOut(originalOut);
        }

}
