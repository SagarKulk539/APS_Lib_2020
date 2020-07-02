/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1337/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Joysticks_345_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();

        int minutes=0;
        while(a1>0 && a2>0)
        {
            minutes++;
            if(a1==1 && a2==1)
            {
                minutes--;
                break;
            }
            if(a1>a2)
            {
                a2++;
                a1-=2;
            }
            else if(a2>a1)
            {
                a1++;
                a2-=2;
            }
            else
            {
                a1++;
                a2-=2;
            }
        }
        System.out.println(minutes);
        sc.close();
    }
}
