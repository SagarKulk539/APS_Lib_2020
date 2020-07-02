/*
APS-2020
Problem Description : Given radius, this program outputs the area of a circle
Input : float (radius)
Output : float (area)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius=sc.nextFloat();
        float area=(float)Math.PI*radius*radius;
        System.out.println("Area of Circle : "+area);
        sc.close();
    }
}
