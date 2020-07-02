/*
APS-2020
Problem Description : Find the product of two matrices
Input : 2 int[][] with sizes n*m , m*o
Output : int[][] of size n*0
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
        System.out.println("*****MATRIX 1*****");
        int m1,n1;
        System.out.println("Enter no of rows :");
        m1=sc.nextInt();
        System.out.println("Enter no of coloumns :");
        n1=sc.nextInt();

        int[][] matrix1=new int[m1][n1];

        System.out.println("Enter "+(m1*n1)+" elements");
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
                matrix1[i][j]=sc.nextInt();
        }

        System.out.println("*****MATRIX 2*****");
        int m2,n2;
        System.out.println("Enter no of rows :");
        m2=sc.nextInt();
        if(n1!=m2)
        {
            System.out.println("Matrix dimensions unequal! Can't proceed further!");
            System.exit(0);
        }
        System.out.println("Enter no of coloumns :");
        n2=sc.nextInt();

        int[][] matrix2=new int[m2][n2];

        System.out.println("Enter "+(m2*n2)+" elements");
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
                matrix2[i][j]=sc.nextInt();
        }

        int[][] resultantMatrix=new int[m1][n2];

        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                resultantMatrix[i][j]=0;
                for(int k=0;k<m2;k++)
                    resultantMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
            }
        }
        System.out.println("*****RESULTANT MATRIX*****");
        printResultantArray(resultantMatrix);
        sc.close();
    }
}
