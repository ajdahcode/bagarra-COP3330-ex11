/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "How many euros are you exchanging? " );
        double c_from = scnN.nextDouble();
        System.out.print( "What is the exchange rate? " );
        double rate = scnN.nextDouble();
        double c_to = rate*c_from;
        double temp = Math.round(c_to*100);
        c_to = temp/100;
        System.out.print( c_from +" euros at an exchange rate of "+ rate + " is\n"+
                c_to +" U.S. dollars");
    }
}
