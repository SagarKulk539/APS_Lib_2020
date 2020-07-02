/*
APS-2020
Problem Description : This program finds the sum of first 'n' natural numbers
Input : long
Output : long (sum)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        long n=sc.nextInt();
        System.out.println("Sum from 1-"+n+" is : "+(n*(n+1)/2));
        sc.close();
    }
}
