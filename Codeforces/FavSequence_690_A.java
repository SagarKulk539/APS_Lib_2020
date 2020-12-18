/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1462/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class FavSequence_690_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            long[] arr=new long[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextLong();

            int i,j;
            for(i=0,j=n-1;i<j;i++,j--)
                System.out.print(arr[i]+" "+arr[j]+" ");

            if(i==j)
                System.out.println(arr[i]);
            else
                System.out.println();

        }
        sc.close();
    }
}
