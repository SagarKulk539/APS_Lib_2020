/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1350/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class OracFactors_641_A
{
    public static int findSmallestDivisor(int n)
    {
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int iter1=0;iter1<q;iter1++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            if((n&1)==1)
            {
                n+=findSmallestDivisor(n);
                n=n+(2*(k-1));
            }
            else
                n=n+(2*k);
            System.out.println(n);
        }
        sc.close();
    }
}
