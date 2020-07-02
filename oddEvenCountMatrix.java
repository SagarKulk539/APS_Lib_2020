/*
APS-2020
Problem Description : Given a matrix, this program finds the no of odd and even elements in the matrix
Input : integer[][]
Output : integer (odd count), integer (even count)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of rows");
        int m=sc.nextInt();

        System.out.println("Enter No of coloumns");
        int n=sc.nextInt();

        int[][] matrix=new int[m][n];

        System.out.println("Enter "+(m*n)+" matrix elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }

        int oddCount=0,evenCount=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                {
                    if((matrix[i][j]&1)==1)
                        oddCount++;
                    else
                        evenCount++;
                }
        }

        System.out.println("Odd Elements Count : "+oddCount);
        System.out.println("Even Elements Count : "+evenCount);
        sc.close();
    }
}
