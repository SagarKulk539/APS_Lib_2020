/*
APS-2020
Problem Description : Find Factorial of a given number
Input : long
Output : BigInteger (factorial)
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");

        long num=sc.nextLong();
        BigInteger fact=BigInteger.ONE;

        for(long i=1;i<=num;i++)
            fact=fact.multiply(BigInteger.valueOf(i));
        System.out.printf("Factorial of "+num+" is "+fact);

        sc.close();
    }
}
