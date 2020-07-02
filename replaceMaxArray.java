/*
APS-2020
Problem Description : Given an array this program replaces every element with max of it's right elements
Input : integer (array size),integer[] (array elements)
Output : integer[] (modified array except the last element)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void printModifiedArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int N=sc.nextInt();

        System.out.println("Enter Array Elements");
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        int max;
        for(int i=0;i<arr.length-1;i++)
        {
            max=arr[i+1];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>max)
                    max=arr[j];
            }
            arr[i]=max;
        }

        printModifiedArray(arr);
        sc.close();
    }
}
