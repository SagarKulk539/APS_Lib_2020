/*
APS-2020
Problem Description : This program removes duplicates from an array
Input : integer[]
Output : integer[] (without duplicates)
Code by : Sagar Kulkarni
*/

import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static int removeDuplicates(int[] arr)
    {
        if(arr.length==0||arr.length==1)
            return arr.length;
        int j=0;
        int[] temp=new int[arr.length];

        int flag=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j]=arr[i];
                j++;
            }
            else
                flag=1;
        }

        temp[j]=arr[arr.length-1];
        j++;

        for(int i=0;i<j;i++)
            arr[i]=temp[i];
        if(flag==1)
            return j;
        else
            return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+" array elements");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);
        int j=removeDuplicates(arr);

        if(j==-1)
        {
            System.out.println("No duplicates in given array!");
            System.exit(0);
        }
        System.out.println("After removing duplicates (Sorted) : ");
        for(int i=0;i<j;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
