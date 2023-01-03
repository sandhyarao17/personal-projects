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
	App a = new App();
	a.main(null);
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
    Assert.assertEquals("hello", App.display());
	}

}
//Just to show git demo
