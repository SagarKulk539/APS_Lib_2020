/*
APS-2020
Problem Description : This program gives the transpose of the given matrix
Input : integer[r][c]
Output : integer[c][r] (transpose)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter no of rows");
        r=sc.nextInt();
        System.out.println("Enter no of coloumns");
        c=sc.nextInt();

        System.out.println("Enter "+(r*c)+" matrix elements");
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                matrix[i][j]=sc.nextInt();
        }

        int[][] transposeMatrix=new int[c][r];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                transposeMatrix[j][i]=matrix[i][j];
        }

        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
                System.out.print(transposeMatrix[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
