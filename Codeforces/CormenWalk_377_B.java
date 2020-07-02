/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/732/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class CormenWalk_377_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]+a[i+1]<k)
            {
                int temp=k-a[i];
                count+=temp-a[i+1];
                a[i+1]=temp;
            }
        }
        System.out.println(count);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        sc.close();
    }
}
