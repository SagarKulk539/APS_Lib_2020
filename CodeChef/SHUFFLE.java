/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME83B/problems/SHUFFLE
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Birthday
{
    public static void trySort(int[] arr,int k)
    {
        int n=arr.length;
        int flag;
        for (int i=0;i<n-k;i++)
        {
            flag=0;
            for (int j=0;j<n-i-k;j++)
            {
                if (arr[j]>arr[j+k])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+k];
                    arr[j+k]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }

    public static boolean isSorted(int[] arr)
    {
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                sorted=false;
                break;
            }
        }
        return sorted;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            trySort(arr,k);
            if(isSorted(arr))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
