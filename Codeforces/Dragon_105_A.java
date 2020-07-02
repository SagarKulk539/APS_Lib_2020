/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/148/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Dragon_105_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();

        int[] arr=new int[d+1];

        for(int i=1;i<=d;i++)
            arr[i]=0;

        for(int i=k;i<=d;i+=k)
            arr[i]=1;

        for(int i=l;i<=d;i+=l)
            arr[i]=1;

        for(int i=m;i<=d;i+=m)
            arr[i]=1;

        for(int i=n;i<=d;i+=n)
            arr[i]=1;

        int affected=0;
        for(int i=1;i<=d;i++)
        {
            if(arr[i]==1)
                affected++;
        }
        System.out.println(affected);
        sc.close();
    }
}
