/*
APS-2020
Problem Description : Check if a given number is armstrong
Input : integer
Output : boolean (armstrong or not)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean res=false;
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int copyNum=n;
        int sum=0;
        int rem;

        while(n!=0)
        {
            rem=n%10;
            sum+=Math.pow(rem,3);
            n/=10;
        }

        if(sum==copyNum)
            res=true;
        System.out.println("IsArmstrong : "+res);
        sc.close();
    }
}
