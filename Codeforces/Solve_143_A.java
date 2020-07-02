/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/231/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Solve_143_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][3];

        int solved=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int howManyKnow;
        for(int i=0;i<n;i++)
        {
            howManyKnow=0;
            for(int j=0;j<3;j++)
            {
                if(mat[i][j]==1)
                    howManyKnow++;
            }
            if(howManyKnow>=2)
                solved++;
        }
        System.out.println(solved);
        sc.close();
    }
}
