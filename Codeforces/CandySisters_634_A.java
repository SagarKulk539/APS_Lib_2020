/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1335/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class CandySisters_634_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int iter1=0;iter1<t;iter1++)
        {
            int n=sc.nextInt();
            if(n<3)
                System.out.println(0);
            else
            {
                int res=(n-1)/2;
                System.out.println(res);
            }
        }
        sc.close();
    }
}
