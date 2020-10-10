/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/OCT20B/problems/CHEFEZQ
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class CHEFEZQ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int j=0;j<t;j++)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();

            long[] arr=new long[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextLong();

            long cumSum=0;
            int index=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>k)
                    cumSum+=arr[i]-k;
                else
                    cumSum-=k-arr[i];

                if(cumSum<0)
                {
                    index=i;
                    break;
                }
            }

            if(index!=-1)
                System.out.println(index+1);
            else
            {
                if(cumSum==0)
                    System.out.println(n+1);
                else
                {
                    long temp=cumSum/k;
                    System.out.println(n+temp+1);
                }
            }
        }
        sc.close();
    }
}
