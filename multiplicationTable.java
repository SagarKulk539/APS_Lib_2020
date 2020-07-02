/*
APS-2020
Problem Description : Display Multiplication Table of a given number (upto 10)
Input : integer
Output : integer[] (displaying multiplication table)
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

        for(int i=1;i<=10;i++)
            System.out.print(n+" * "+i+" = "+(n*i)+"\n");
        sc.close();
    }
}
