/*
APS-2020
Problem Description : Given a year, this program checks if the given year is leap or not
Input : integer (year)
Output : boolean (leap or not)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year :");

        int year=sc.nextInt();
        boolean isLeap=false;

        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0)
                    isLeap=true;
                else
                    isLeap=false;
            }
            else
                isLeap=true;
        }
        else
            isLeap=false;

        if(isLeap)
            System.out.println(year+" is a leap year!");
        else
            System.out.println(year+" is not a leap year!");

        sc.close();
    }
}
