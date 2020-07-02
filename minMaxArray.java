/*
APS-2020
Problem Description : Given an array this program finds the min and max element
Input : integer (array size),integer[] (array elements)
Output : integer (denoting min),integer (denoting max)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int N=sc.nextInt();
        int[] arr=new int[N];

        System.out.println("Enter Array Elements :");
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }

        System.out.println("Array Minimum Element : "+min);
        System.out.println("Array Maximum Element : "+max);
        sc.close();
    }
}
