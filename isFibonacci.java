/*
APS-2020
Problem Description : This program checks if a given number lies in fibonacci series or not
Input : integer
Output : boolean (fibonacci or not)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static boolean isPerfectSquare(int n)
    {
        int x=(int)Math.sqrt(n);
        if(x*x==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int tempVar=5*n*n;
        boolean res;
        if(isPerfectSquare(tempVar+4) || isPerfectSquare(tempVar-4))
            res=true;
        else
            res=false;

        System.out.println("IsFibonacci : "+res);
        sc.close();
    }
}
