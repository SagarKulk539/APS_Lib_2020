/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1371/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class MagicalSticks_654_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long n=sc.nextLong();
            //if odd
            if((n&1)==1)
                System.out.println((n+1)/2);
            //else even
            else
                System.out.println(n/2);
        }
        sc.close();
    }
}
