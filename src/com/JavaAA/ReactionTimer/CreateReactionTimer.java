package com.JavaAA.ReactionTimer;

import java.util.Scanner;

public class CreateReactionTimer {

    //the throws declaration throws an exception, which means something inside the curly braces will be delayed or work a bit different
    public static void main(String[] args) throws InterruptedException {

        //Step 1:Print text to screen for timer
        System.out.println("3");
        //below "thread" this creates time in between the countdown, so it doesn't happen instantly
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!!!");
        Thread.sleep(1000);

        //long variable type used. We also can get current time in milliseconds and store it into start with below line
        long startTime = System.currentTimeMillis();

        //now we use a scanner to allow users to interact with console
        Scanner s = new Scanner(System.in);
        //this recognizes when a user inputs something and hits enter so the rest of the program can run
        s.next();

        //after user types something we get stop the time and log current time in milliseconds
        long stopTime = System.currentTimeMillis();

        //now we subtract the time the program stopped at (after user clicked enter) by the startTime to get the reaction time
        long reactionTime = stopTime - startTime;

        //print reaction time
        System.out.println(reactionTime + "ms");

    }
}

