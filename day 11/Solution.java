import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int arr1[][] = new int[6][6];
        int temp = 0;
        int sum[] = new int[16];
        int count = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(arr[i][j]< -9 && arr[i][j]>9)
                    System.out.print("Invalid");
                else
                    arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                    
                    sum[count] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                        count++;
            }
        }
        temp = sum[sum.length-1];
        //if(arr[i][j]< -9 && arr[i][j]>9)
        for(int i=0; i<sum.length-1; i++)
           {
            if(sum[i]>temp)
            {    temp = sum[i];
             }
        }
                                //for(int i=0; i<sum.length-1; i++)
                      System.out.println(temp);

    }
}
