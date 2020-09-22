/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1419/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Stairs_671_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long x=sc.nextLong();

            long totalCount=0;
            long currStairs=1;
            long powerOf2=0;

            long sum=0;
            while(true)
            {
                sum+=(currStairs*(currStairs+1))/2;
                if(sum>x)
                    break;
                totalCount++;
                powerOf2++;
                currStairs+=Math.pow(2,powerOf2);
            }
            System.out.println(totalCount);
        }
        sc.close();
    }
}
