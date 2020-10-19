/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1421/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class XORWice_676_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();

            System.out.println(a^b);
        }
        sc.close();
    }
}
