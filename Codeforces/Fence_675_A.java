/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1422/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Fence_675_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long a,b,c;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();

            System.out.println(a+b+c-1);            
        }
        sc.close();
    }
}
