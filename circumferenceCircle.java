/*
APS-2020
Problem Description : Given radius, this program outputs the circumference of a circle
Input : float (radius)
Output : float (circumference)
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
        float circumference=2*(float)Math.PI*radius;
        System.out.println("Circumference of Circle : "+circumference);
        sc.close();
    }
}
