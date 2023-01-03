package com.calsoft;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
	if(args==null || args.length==0){
        System.out.println( "hello world" );
	String x=display(); 
        System.out.println("msg: "+x);
	}
	else
        System.out.println( "byeeee" );

    }
     public static String display(){
     
	     return "hello";
     }
}

