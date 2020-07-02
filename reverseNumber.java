/*
APS-2020
Problem Description : Given an integer ,it is reversed
Input : integer
Output : integer (reversed number)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int rev=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

        System.out.println("Reversed Number : "+rev);
        sc.close();
    }
}
