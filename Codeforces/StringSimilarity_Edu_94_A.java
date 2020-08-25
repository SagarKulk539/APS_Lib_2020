/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1400/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class StringSimilarity_Edu_94_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            String str=sc.next();

            char[] arr=new char[n];
            for(int j=0;j<n;j++)
            {
                String tempStr=str.substring(j,j+n);
                arr[j]=tempStr.charAt(j);
            }

            for(int j=0;j<n;j++)
                System.out.print(arr[j]);
            System.out.println();
        }
        sc.close();
    }
}
