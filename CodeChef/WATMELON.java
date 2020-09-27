/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME88B/problems/WATMELON
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class WATMELON
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            int sum=0;
            arr[0]=sc.nextInt();

            for(int i=1;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }

            sum*=-1;

            if(n==1)
            {
                if(arr[0]<0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else
            {
                if(arr[0]>=sum)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
