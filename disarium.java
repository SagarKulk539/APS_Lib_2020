/*
APS-2020
Problem Description : This program determines if a given number is Disarium number or not
Input : int (n)
Output : string (disarium or not)
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
        int x=n;
        int rem,i,count=0,sum=0;

        while(n!=0)
        {
            count++;
            n/=10;
        }
        n=x;
        i=count;
        while(n!=0)
        {
            rem=n%10;
            sum+=(int)Math.pow(rem,i);
            i--;
            n/=10;
        }

        if(sum==x)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
        sc.close();
    }
}
