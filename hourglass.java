/*
APS-2020
Problem Description : https://www.hackerrank.com/challenges/2d-array/problem
Input : integer[6][6] (Each of the 6 lines of inputs arr[i] contains 6 space-separated integers  arr[i][j])
Output : integer (Print the largest (maximum) hourglass sum found in arr)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    static int hourglassSum(int[][] arr)
    {
        int maxHourglassSum=Integer.MIN_VALUE;
        int temp;
        for (int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                temp=arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if(temp>maxHourglassSum)
                    maxHourglassSum=temp;
            }
        }
        return maxHourglassSum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[6][6];
		System.out.println("Enter 36 matrix elements");
        for (int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int result=hourglassSum(arr);
        System.out.println("Hourglass Sum : "+result);
        // System.out.println(result);
        sc.close();
    }
}
