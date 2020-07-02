/*
APS-2020
Problem Description : Given length and breadth, this program outputs the area of a rectangle
Input : 2 integers (length,breadth)
Output : int (area)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int length=sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("Area of Rectangle : "+area);
        sc.close();
    }
}
