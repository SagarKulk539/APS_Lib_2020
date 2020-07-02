/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/158/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Score_VKCup_2012_Q1_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];

        int totalCount=0;
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=arr[k-1] && arr[i]!=0)
                totalCount++;
            else
                break;
        }
        System.out.println(totalCount);
        sc.close();
    }
}
