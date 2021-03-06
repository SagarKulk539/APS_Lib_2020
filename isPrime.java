/*
APS-2020
Problem Description : Checks if a number is prime or not
Input : integer
Output : boolean (prime or not)
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

        boolean flag=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }

        System.out.println("IsPrime : "+flag);
        sc.close();
    }
}
