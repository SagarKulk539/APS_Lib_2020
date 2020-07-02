/*
APS-2020
Problem Description : Given a square matrix, this program indicates if it is an identity matrix or not
Input : integer[][]
Output : boolean (identity matrix or not)
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
        boolean identity=true;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
                {
                    if(i==j && matrix[i][j]!=1)
                    {
                        identity=false;
                        break;
                    }
                    else
                    {
                        if(matrix[i][j]!=0)
                        {
                            identity=false;
                            break;
                        }
                    }
                }
                if(!identity)
                    break;
        }

        System.out.println("IsIdentity : "+identity);
        sc.close();
    }
}
