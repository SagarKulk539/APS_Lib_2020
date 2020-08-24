/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1141/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ContinuousRest_547_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long[] arr=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();

        long maxCount=0;
        if(n>1)
        {
            long tempCount=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                    break;
                else
                    tempCount++;
            }
            for(int i=n-1;i>=0;i--)
            {
                if(arr[i]==0)
                    break;
                else
                    tempCount++;
            }
            maxCount=tempCount;
        }

        long count1=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                maxCount=Long.max(maxCount,count1);
                count1=0;
            }
            else
                count1++;
        }
        maxCount=Long.max(maxCount,count1);
        System.out.println(maxCount);
        sc.close();
    }
}
