

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

