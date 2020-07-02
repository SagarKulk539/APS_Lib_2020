/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1341/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Nastya_637_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long n,a,b,c,d;
            n=sc.nextLong();
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            d=sc.nextLong();

            long gramStartTotal=n*(a-b);
            long gramEndTotal=n*(a+b);

            long packetStart=(c-d);
            long packetEnd=(c+d);

            if((gramStartTotal>=packetStart && gramEndTotal<=packetEnd) || (gramStartTotal<=packetEnd && gramEndTotal>=packetStart))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        sc.close();
    }
}
