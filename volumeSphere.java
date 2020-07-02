/*
APS-2020
Problem Description : This program finds the volume of a Sphere
Input : float (radius)
Output : float (volume)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float radius;
        System.out.println("Enter Radius");
        radius=sc.nextFloat();

        float volume=(4*(float)Math.PI*(float)Math.pow(radius,3));
        volume/=3;
        System.out.println("Volume of Sphere : "+volume);
        sc.close();
    }
}
