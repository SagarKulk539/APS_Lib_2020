/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/CHPTRS01/problems/FUNRUN
Code by : Sagar Kulkarni
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class FUNRUN
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int N=sc.nextInt();
            int[] A=new int[N];
            int[] B=new int[N];
            int maxA=Integer.MIN_VALUE,maxB=Integer.MIN_VALUE;

            for(int i=0;i<N;i++)
            {
                A[i]=sc.nextInt();
                if(A[i]>maxA)
                    maxA=A[i];
            }


            for(int i=0;i<N;i++)
            {
                B[i]=sc.nextInt();
                if(B[i]>maxB)
                    maxB=B[i];
            }

            if(maxA>maxB || maxB>maxA)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}
