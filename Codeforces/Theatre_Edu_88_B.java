/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1359/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Theatre_Edu_88_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            char[][] matrix=new char[n][m];
            String inp;
            for(int i=0;i<n;i++)
            {
                inp=sc.next();
                for(int j=0;j<m;j++)
                    matrix[i][j]=inp.charAt(j);
            }

            long totalSum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;)
                {
                    if(matrix[i][j]=='.')
                    {
                        if(j<=m-2)
                        {
                            if(matrix[i][j+1]=='.')
                            {
                                int temp1=2*x;
                                int temp2=y;
                                if(temp1<temp2)
                                    totalSum+=temp1;
                                else
                                    totalSum+=temp2;
                                j+=2;
                            }
                            else
                            {
                                totalSum+=x;
                                j++;
                            }
                        }
                        else
                        {
                            totalSum+=x;
                            j++;
                        }
                    }
                    else
                        j++;
                }
            }
            System.out.println(totalSum);
        }
        sc.close();
    }
}
