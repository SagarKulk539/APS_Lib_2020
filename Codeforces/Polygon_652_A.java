/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1369/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Polygon_652_A
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if(n%4==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();    
    }
}
