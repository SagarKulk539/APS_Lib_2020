/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1360/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Athlete_644_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);

            int min=Math.abs(arr[0]-arr[1]),temp;
            for(int i=0;i<n-1;i++)
            {
                temp=Math.abs(arr[i]-arr[i+1]);
                if(temp<min)
                    min=temp;
            }
            System.out.println(min);
        }
        sc.close();
    }
}
