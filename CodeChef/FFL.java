/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME83B/problems/FFL
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class FFL
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int basePrice=sc.nextInt();

            int[][] matrix=new int[n][2];
            for(int i=0;i<n;i++)
                matrix[i][0]=sc.nextInt();

            for(int i=0;i<n;i++)
                matrix[i][1]=sc.nextInt();

            Arrays.sort(matrix,(col1,col2)->Integer.compare(col1[0],col2[0]));

            int flag0=0,flag1=0;
            int players=13;
            for(int i=0;i<n;i++)
            {
                if(flag0==1 && flag1==1)
                    break;
                if(matrix[i][1]==0 && flag0==0)
                {
                    basePrice+=matrix[i][0];
                    flag0=1;
                    players++;
                }
                if(matrix[i][1]==1 && flag1==0)
                {
                    basePrice+=matrix[i][0];
                    flag1=1;
                    players++;
                }
            }
            if(basePrice<=100 && players==15)
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
