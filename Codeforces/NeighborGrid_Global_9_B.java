/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1375/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class NeighborGrid_Global_9_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int iter1=0;iter1<t;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();

            int[][] matrix=new int[n][m];
            int[][] newMatrix=new int[n][m];


            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    matrix[i][j]=sc.nextInt();
            }

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==0 || i==n-1)
                        newMatrix[i][j]=3;
                    else if(j==0 || j==m-1)
                        newMatrix[i][j]=3;
                    else if((i>0 && i<n-1) || (j>0 && j<m-1))
                        newMatrix[i][j]=4;
                }
            }

            newMatrix[0][0]=2;
            newMatrix[n-1][0]=2;
            newMatrix[0][m-1]=2;
            newMatrix[n-1][m-1]=2;

            int flag=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(matrix[i][j]>newMatrix[i][j])
                    {
                        flag=1;
                        break;
                    }
                }
            }

            if(flag==0)
            {
                System.out.println("YES");
                for (int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(newMatrix[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else
                System.out.println("NO");

        }
        sc.close();
    }
}
