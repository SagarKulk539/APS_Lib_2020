/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1405/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ArrayCancellation_668_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            long[] arr=new long[n];

            long positiveSum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
                if(arr[i]>0)
                    positiveSum+=arr[i];
                else if(arr[i]<0)
                {
                    long temp=Math.min(positiveSum,-arr[i]);
                    arr[i]+=temp;
                    positiveSum-=temp;
                }
            }

            long negativeSum=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<0)
                    negativeSum+=Math.abs(arr[i]);
            }

            System.out.println(negativeSum);
        }
        sc.close();
    }
}
