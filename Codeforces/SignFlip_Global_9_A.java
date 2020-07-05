/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1375/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class SignFlip_Global_9_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int iter1=0;iter1<t;iter1++)
        {
            int n=sc.nextInt();
            long[] arr=new long[n];

            for(int i=0;i<n;i++)
            {
                long temp=sc.nextLong();
                if(i%2==0)
                {
                    if(temp<0)
                        arr[i]=temp*-1;
                    else
                        arr[i]=temp;
                }
                else
                {
                    if(temp>0)
                        arr[i]=temp*-1;
                    else
                        arr[i]=temp;
                }
            }

            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
        sc.close();
    }
}
