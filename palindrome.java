/*
APS-2020
Problem Description : Given an integer ,this program checks if it is a palindrome
Input : integer
Output : boolean (palindrome or not)
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
        int x=n;
        int rev=0;
        boolean res=false;
        int rem;

        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

        if(x==rev)
            res=true;
        System.out.println("Palindrome : "+res);
        sc.close();
    }
}
