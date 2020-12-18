/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1461/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class StringGeneration_689_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            char arr[]={'a','b','c'};

            int counter=0;
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[counter]);
                counter=(counter+1)%3;
            }
            System.out.println();
        }
        sc.close();
    }
}
