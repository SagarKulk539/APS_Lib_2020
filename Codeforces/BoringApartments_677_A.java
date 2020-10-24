/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1433/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class BoringApartments_677_A
{
    public static int countDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int x=sc.nextInt();
            int count=countDigit(x);
            int num=x%10;

            long total=(num-1)*10;
            total+=(((count)*(count+1))/2);

            System.out.println(total);

        }
        sc.close();
    }
}
