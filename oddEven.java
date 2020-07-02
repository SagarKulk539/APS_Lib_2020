/*
APS-2020
Problem Description : Given a number,  this program outputs if the given number is odd/even using Brian Kernighan Method
Input : integer
Output : string (odd/even)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        if((n&1)==1)
            System.out.println("Odd");
        else
            System.out.println("Even");
        sc.close();
    }
}
