/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/732/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class BurlesShovels_377_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();

        for(int i=1;i<=9;i++)
        {
            long temp=k*i;
            if(temp%10==0 || temp%10==r)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
