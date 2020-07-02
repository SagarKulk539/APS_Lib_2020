/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1348/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Balance_638_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int sum1=0,sum2=0;
            for(int i=1;i<=(n/2)-1;i++)
                sum1+=(int)Math.pow(2,i);
            sum1+=(int)Math.pow(2,n);

            for(int i=n/2;i<n;i++)
                sum2+=(int)Math.pow(2,i);
            System.out.println(sum1-sum2);
        }
        sc.close();
    }
}
