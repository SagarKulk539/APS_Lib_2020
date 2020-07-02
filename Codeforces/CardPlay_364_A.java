/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/701/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class CardPlay_364_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }

        int reqSum=min+max;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==reqSum && arr[i]!=-1 && arr[j]!=-1)
                {
                    System.out.println((i+1)+" "+(j+1));
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        sc.close();
    }
}
