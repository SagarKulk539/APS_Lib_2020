/*
APS-2020
Problem Description : Given a square matrix, this program finds the secondary diagonal sum
Input : integer[][]
Output : integer (sum of secondary diagonal)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dimension of square matrix");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];

        System.out.println("Enter "+(n*n)+" matrix elements");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                {
                    if(i+j==n-1)
                        sum+=matrix[i][j];
                }
        }

        System.out.println("Secondary Diagonal Sum : "+sum);
        sc.close();
    }
}
