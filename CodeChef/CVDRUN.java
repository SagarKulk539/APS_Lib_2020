/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/OCT20B/problems/CVDRUN
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class CVDRUN
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            int backup=x;
            x=(x+k)%n;
            if(x==y)
                System.out.println("YES");
            else
            {
                int flag=0;
                while(x!=backup)
                {
                    x=(x+k)%n;
                    if(x==y)
                    {
                        flag=1;
                        System.out.println("YES");
                        break;
                    }
                }
                if(flag==0)
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
