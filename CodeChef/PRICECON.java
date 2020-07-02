/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JUNE20B/problems/PRICECON
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PRICECON
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>k)
                    sum+=arr[i]-k;
            }
            System.out.println(sum);
        }
        sc.close();
	}
}
