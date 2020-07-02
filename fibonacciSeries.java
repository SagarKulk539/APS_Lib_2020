/*
APS-2020
Problem Description : Print first 'n' fibonacci numbers
Input : integer 'n'
Output : integer[] (denoting first 'n' fibonaccu numbers)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int i=0;

        System.out.print(a+"\n"+b+"\n");
        int c;
        while(i<n-2)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }

        sc.close();
    }
}
