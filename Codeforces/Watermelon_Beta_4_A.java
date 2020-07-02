/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/4/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Watermelon_Beta_4_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        if(w==1 || w==2)
            System.out.println("NO");
        else
        {
            if(((w-2)&1)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
