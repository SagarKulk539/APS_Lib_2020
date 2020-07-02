/*
APS-2020
Problem Description : Swaps two given integers using XOR
Input : 2 integers
Output : 2 swapped integers
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Number 1 :");
        a=sc.nextInt();
        System.out.println("Enter Number 2 :");
        b=sc.nextInt();
        System.out.println("Before Swap");
        System.out.print("1st Number : "+a+" 2nd Number : "+b+"\n\n");

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After Swap");
        System.out.print("1st Number : "+a+" 2nd Number : "+b);
        sc.close();
    }
}
