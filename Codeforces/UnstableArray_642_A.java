/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1353/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class UnstableArray_642_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n==1)
            {
                System.out.println(0);
                continue;
            }
            if(n==2)
            {
                System.out.println(m);
                continue;
            }
            System.out.println(2*m);
        }
        sc.close();
    }
}
