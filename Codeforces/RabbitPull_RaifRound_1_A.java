/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1428/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class RabbitPull_RaifRound_1_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long x1=sc.nextLong();
            long y1=sc.nextLong();
            long x2=sc.nextLong();
            long y2=sc.nextLong();

            if(x1==x2 || y1==y2)
                System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2));
            else
                System.out.println(Math.abs(x1-x2)+Math.abs(y1-y2)+2);
        }
        sc.close();
    }
}
