/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1422/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class NiceMatrix_675_B
{
    public static long sortCompute(long a,long b,long c)
    {
        long[] arr={a,b,c};
        Arrays.sort(arr);

        return arr[1];
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long total=0;
            int n=sc.nextInt();
            int m=sc.nextInt();

            long[][] mat=new long[n][m];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    mat[i][j]=sc.nextLong();
            }

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    long temp=sortCompute(mat[i][j],mat[i][m-j-1],mat[n-i-1][j]);
                    total+=Math.abs(mat[i][j]-temp)+Math.abs(mat[n-i-1][j]-temp)+Math.abs(mat[i][m-j-1]-temp);
                    mat[i][j]=mat[i][m-j-1]=mat[n-i-1][j]=temp;
                }

            }
            
            System.out.println(total);
        }
        sc.close();
    }
}
