/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1374/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Brackets_653_C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            String str1=sc.next();

            int open=0,totalCount=0;
            for(int i=0;i<n;i++)
            {
                if(str1.charAt(i)=='(')
                    open++;
                else
                {
                    if(open>0)
                        open--;
                    else
                        totalCount++;
                }
            }
            System.out.println(totalCount);
        }
        sc.close();
    }
}
