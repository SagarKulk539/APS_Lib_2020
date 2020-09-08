/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1405/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class PermutationFingerprint_668_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            for(int i=n-1;i>=0;i--)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
        sc.close();
    }
}
