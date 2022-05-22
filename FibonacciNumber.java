package com.java.algos;
import java.util.*;
public class FibonacciNumber
{
	/**
	 * This method will return the fibonacci sequence number for the parameter n passed in.
	 * @author Romania Brown
	 * @param n
	 * @return int
	 */
    public static int fibonacci(int n) {
	    //if n is 1 or less then return n
	    if (n <= 1)
	       return n;
	    //recursively call the function fibonacci()
	    return fibonacci(n-1) + fibonacci(n-2);
    }
    
    
    /**
     * This is the main method that will call the fibonacci method and prompt user to enter the variable 1 
     * using scanner class. 
     * @author Romania Brown
     * @param args
     * @return void
     */
    public static void main (String args[]) {
    	
	    //delare one variable n
	    int n;
	    //create Scanner class Object
	    Scanner scnr=new Scanner(System.in);
	    //get value of n from user
	    System.out.println("Enther value of n: ");
	    n=scnr.nextInt();
	    //print n-th number in sequence
	    System.out.println("The "+n+"th term of the Fibonacci sequence is "+fibonacci(n));
    }
}