//Day 0


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


//Day 1

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

//Day 2

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


//Day 3 Intro to Conditional Statements 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
          if(n>=2&&n<=5)
              ans = "Not Weird";
          if(n>=6 && n<=20)
              ans = "Weird";
          
          else
          ans = "Not Weird";
      }
      System.out.println(ans);
   }
}


//Day 4  Class vs. Instance

import java.io.*;
import java.util.*;
public class Person {
    private int age;	
  
	public Person(int initialAge) {
        if(initialAge<0){
                    System.out.println("Age is not valid, setting age to 0.");
         this.age = 0;
        }
        else
            this.age = initialAge;
            
  		// Add some more code to run some checks on initialAgeSystem.out.println("You are old.");
        }

        //System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
        ++age;
  		// Increment this person's age.
	}

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

