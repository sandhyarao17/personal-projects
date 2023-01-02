package com.calsoft;

import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
public void testmain() {
       
        App.main(null);
    //Assert.assertTrue(bos.toString().contains("Hello-World"));
        }
    @Test
public void testmain2() {
    App.main(new String[] {"1", "2"});
    //Assert.assertTrue(bos.toString().contains("Hello-World"));
        }
    @Test
public void testmain3() {
     App a = new App();
        Assert.assertEquals("hello", a.display());
    Assert.assertEquals("hello", App.display());
        }

}
