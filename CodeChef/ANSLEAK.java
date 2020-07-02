/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/APRIL20B/problems/ANSLEAK
Code by : Sagar Kulkarni
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class ANSLEAK
{
    public static void resetArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            arr[i]=0;
    }

    public static int findMaxArray(int[] arr)
    {
        int maxVal=arr[0];
        int maxIndex=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int N,M,K;
            N=sc.nextInt();
            M=sc.nextInt();
            K=sc.nextInt();

            int[][] mat=new int[N][K];
            int[] arr=new int[M];

            int[] resultArray=new int[N];
            for(int i=0;i<N;i++)
            {
                resetArray(arr);
                for(int j=0;j<K;j++)
                {
                    mat[i][j]=sc.nextInt();
                    arr[mat[i][j]-1]++;
                }
                int maxIndex=findMaxArray(arr);
                maxIndex++;
                resultArray[i]=maxIndex;
            }

            for(int i=0;i<N;i++)
                System.out.print(resultArray[i]+" ");
            System.out.println();
        }
        sc.close();
    }
}
