/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/620/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class RobotMoves_Edu_6_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long x1=sc.nextLong();
        long y1=sc.nextLong();

        long x2=sc.nextLong();
        long y2=sc.nextLong();

        long xDiff=Math.abs(x2-x1);
        long yDiff=Math.abs(y2-y1);

        System.out.println(Math.max(xDiff,yDiff));
        sc.close();
    }
}
