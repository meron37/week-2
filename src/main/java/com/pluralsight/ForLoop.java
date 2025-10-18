package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        for( int i = 10; i>=1; i-- ){
            System.out.println(i); // print the current number
            Thread.sleep(1000); // pause for 1 second
        }
    }
}
