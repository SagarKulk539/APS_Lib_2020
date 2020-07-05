/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1375/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ElementExtermination_Global_9_C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int iter1=0;iter1<t;iter1++)
        {
            int n=sc.nextInt();

            long first=0,last=0,temp;
            for(int i=0;i<n;i++)
            {
                temp=sc.nextLong();
                if(i==0)
                    first=temp;
                if(i==n-1)
                    last=temp;
            }

            if(first>last)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
        sc.close();
    }
}
