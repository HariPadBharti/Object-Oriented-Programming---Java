

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
