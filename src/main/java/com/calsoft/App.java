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
        System.out.println( "hii" );
        String x=display();
        System.out.println("msg: "+x);
        }
        else
        System.out.println( "bye" );

    }
     public static String display(){

             return "hello";
     }
}

