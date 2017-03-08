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



// Day 5 Loops
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=10; i++)
            System.out.println("2 x " +i + " = " +(2*i));
    }
}


//Day 6

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = scan.nextLine();
        //String str1 = scan.nextLine();
        if(a>=1 && a<=10)
            {
            while(a!=0)
                {
                    String str1 = scan.nextLine();
                     char[] A1=str1.toCharArray();
                     //char[] A2=str2.toCharArray();
        
                     String f1 = "",f2 = "";
                      int a1 = str1.length();
                      //int a2 = str2.length();
                  
                    
                    if(a1>=2 && a1<=10000)
                        {
                        for(int i=0;i<a1; i++)
                            {
                            //if(i==0)
                            //f1+=A1[i];
                            if(i%2==0)
                               f1+=A1[i];
                            if(i%2==1)
                              f2+=A1[i];
            
            
                             }
                        f1=f1.toString();
                        f2=f2.toString();
                        System.out.print(f1 +" " +f2); 
                        
                     
                     a--;
                        System.out.println();
                     }
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}


//Day 7  Arrays
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        //arr.reverse();
        for(int j=arr.length-1; j>=0; j--)
            System.out.print(arr[j] + " ");
        in.close();
    }
}


// Day 8 Dictionaries and Maps

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> mymap = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mymap.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
          
            if(mymap.get(s)!= null)
            System.out.println(s+ "=" +mymap.get(s));
            // Write code here
            else
                System.out.println("Not found");
        }
        
        in.close();
    }
}



//Day 9 Recursion
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inn = new Scanner(System.in);
        int N = inn.nextInt();
        if(N==0 || N==1)
        System.out.println(1);
         if(N>12)
                     System.out.println(0);
           
        Solution s = new Solution();
        if(N>=2&&N<=12)
            {
            int N1 = s.factorial(N);
            System.out.println(N1);}
        
    }
    public int factorial(int n)
            {
           if(n==0) return 1;
    else return n * factorial(n-1);    
    }
       
           
}

//Day 10 Binomial numbers 

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String S="";
        int count=1;
        int count1=0;
        int len=S.length();

        int aaaa=1;
        //int a=0;
        if(num>=1 && num<=Math.pow(10,6))
            {
            while(num!=0)
                {
               
                    
                if(num%2==0)
                    S+="0";
                else
                    S+="1";
                  
                num/=2;
            }
        }
        //if(S.contains("11") || S.contains("00"))
          //  count++;
        char arr[] = new char[len]; // len is the length of the array
        arr = S.toCharArray();
        int temp=1;
        for(int i=0; i<arr.length-1;i++)
           {
           count=1;
                       // 

           if(arr[i]=='1'){
               count1=1;
           }
           
           if(arr[i]=='1'&& arr[i+1]=='1')
               {
               int j=i;
               while(arr[j]=='1' && j+1<=arr.length-1){
               if(arr[j]=='1' && arr[j+1]=='1')
                  { count++;
                  }
                                 // System.out.println("yo"+arr[i]);
                   j++;
                   //if(arr[j]=='0')
                   //break;
               }
               
               if(aaaa<count)
               aaaa = count;
           }
           
        }
       //System.out.println(S); 
        //int f=0;
        //for(int j=0; j<sub.length-1;j++)
          //  {
            //if(sub[j]>sub[j+1])
              //  f=sub[j];
        //}
        if(!S.contains("1"))
        System.out.println('0'); 
        else
                {
        if(aaaa>count1)
        System.out.println(aaaa);
        else
        System.out.println(count1);
                }
    }
}
