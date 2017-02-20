//Day 1


public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.print(inputString);
	}
}


//Day 2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
/* Declare second integer, double, and String variables. */
        int i1;
        double d1;
        String s1,s2;
        /* Read and save an integer, double, and String to your variables.*/
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        s1 = scan.nextLine();
        s2 = scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i1 + i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d1+d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        s=s+s2;
        System.out.println(s);
        scan.close();
    }
}

//Day 3

import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
      mealCost += (((mealCost * tipPercent)/100) + ((mealCost * taxPercent)/100));
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);
      
        // Print your result
        System.out.print("The total meal cost is " + totalCost +" dollars.");
    }
}



