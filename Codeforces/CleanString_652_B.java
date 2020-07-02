/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1369/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class CleanString_652_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            String str1=sc.next();
            
            int count0=0,count1=0;
            
            for(int i=0;i<n;i++)
            {
                if(str1.charAt(i)=='1')
                    break;
                count0++;
            }
            for(int i=n-1;i>=0;i--)
            {
                if(str1.charAt(i)=='0')
                    break;
                count1++;
            }

            int flag=0;
            for(int i=0;i<n-1;i++)
            {
                if(str1.charAt(i)=='1' && str1.charAt(i+1)=='0')
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                count0++;
            for(int i=0;i<count0;i++)
                System.out.print("0");
            for(int i=0;i<count1;i++)
                System.out.print("1");
            System.out.println();
        }
        sc.close();
    }
}
