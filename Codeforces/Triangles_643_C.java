/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1355/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Triangles_643_C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A,B,C,D;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        D=sc.nextInt();

        long[] prefixArray=new long[1500008];

        for(int i=A;i<=B;i++)
        {
            prefixArray[i+B]++;
            prefixArray[i+C+1]--;
        }

        for(int i=1;i<=1500006;i++)
            prefixArray[i]+=prefixArray[i-1];

        for(int i=1500006;i>=1;i--)
            prefixArray[i-1]+=prefixArray[i];

        long totalCount=0;

        for(int i=C;i<=D;i++)
            totalCount+=prefixArray[i+1];

        System.out.println(totalCount);
        sc.close();
    }
}
