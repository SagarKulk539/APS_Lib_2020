/*
APS-2020
Problem Description : Given n and r, this program gives the permutation nPr
Input : 2 integers (n,r)
Output : integer (nPr)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter r");
        int r=sc.nextInt();
        if(r>n)
        {
            System.out.println("Invalid Input (Valid->(n>=r))");
            System.exit(0);
        }

        int res=factorial(n)/factorial(n-r);
        System.out.println(n+"P"+r+" is : "+res);
        sc.close();
    }
}
