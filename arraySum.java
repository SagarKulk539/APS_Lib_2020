/*
APS-2020
Problem Description : Given an array this program finds the array sum
Input : integer (array size),integer[] (array elements)
Output : integer (denoting sum)
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

        System.out.println("Enter Array Elements");
        int[] arr=new int[N];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("Array Sum : "+sum);

        sc.close();
    }
}
