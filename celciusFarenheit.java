/*
APS-2020
Problem Description : Convert celcius to farenheit and vice versa
Input : float (°C or °F)
Output : float (°C or °F)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ch;

        while(true)
        {
            System.out.println("Choose One!\n");
            System.out.println("1.Celcius to Farenheit (C-F)");
            System.out.println("2.Farenheit to Celcius (F-C)");
            ch=sc.nextInt();
            if(ch==1 || ch==2)
                break;
        }

        if(ch==1)
        {
            System.out.println("Enter temperature in C");
            float celcius=sc.nextFloat();
            float farenheit=(celcius*1.8f)+32;
            System.out.println("Temperature in F : "+farenheit);
        }

        else
        {
            System.out.println("Enter temperature in F");
            float farenheit=sc.nextFloat();
            float celcius=(farenheit-32)/1.8f;
            System.out.println("Temperature in C : "+celcius);
        }
        sc.close();
    }
}
