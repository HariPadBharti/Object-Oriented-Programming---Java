
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



