/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1366/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ShovelSword_Edu_89_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0 || b==0)
            {
                System.out.println(0);
                continue;
            }
            int diff=Math.abs(a-b);
            if(diff>a || diff>b)
                System.out.println(Math.min(a,b));
            else
                System.out.println((a+b)/3);
        }
        sc.close();
    }
}
