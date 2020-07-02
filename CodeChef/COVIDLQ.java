/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/APRIL20B/problems/COVIDLQ
Code by : Sagar Kulkarni
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class COVIDLQ
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int N=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++)
                arr[i]=sc.nextInt();

            int flag=0;
            int breakFlag=0;
            int count=0;
            for(int i=0;i<N;i++)
            {
                if(arr[i]==0 && flag==1)
                    count++;
                if(arr[i]==1 && flag==0)
                {
                    flag=1;
                    count=0;
                    continue;
                }
                if(arr[i]==1 && flag==1)
                {
                    if(count<5)
                        breakFlag=1;
                    count=0;
                }
                if(breakFlag==1)
                    break;
            }

            if(breakFlag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
