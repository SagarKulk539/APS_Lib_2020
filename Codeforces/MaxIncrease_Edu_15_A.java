/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/702/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class MaxIncrease_Edu_15_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int max=1,len=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                len++;
            else
            {
                if(max<len)
                    max=len;
                len=1;
            }
            if(max<len)
                max=len;
        }
        System.out.println(max);
        sc.close();
    }
}
