/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1343/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Candies_636_A
{
    public static int findSum(int k)
    {
        int sum=0;
        for(int i=0;i<=k;i++)
            sum+=Math.pow(2,i);
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int div,temp,res;
            for(int k=2;;k++)
            {
                div=findSum(k-1);
                temp=(int)Math.floor(n/div);
                if(temp*div==n)
                {
                    res=temp;
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
