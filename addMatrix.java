/*
APS-2020
Problem Description : Find the sum of two matrices
Input : 2 int[][] of size m*n
Output : int[][] of size m*n
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void printResultantArray(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter no of rows :");
        m=sc.nextInt();
        System.out.println("Enter no of coloumns :");
        n=sc.nextInt();

        int[][] matrix1=new int[m][n];
        int[][] matrix2=new int[m][n];
        int[][] resultantMatrix=new int[m][n];

        System.out.println("*****MATRIX 1*****");
        System.out.println("Enter "+(m*n)+" elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                matrix1[i][j]=sc.nextInt();
        }

        System.out.println("*****MATRIX 2*****");
        System.out.println("Enter "+(m*n)+" elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                matrix2[i][j]=sc.nextInt();
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                resultantMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
        }

        System.out.println("*****RESULTANT MATRIX*****");
        printResultantArray(resultantMatrix);
        sc.close();
    }
}
