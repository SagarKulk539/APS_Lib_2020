/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/622/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Time_Edu_7_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        int addition=sc.nextInt();
        String[] strArray=str1.split("[:]");

        int hour=0,min=0;
        for(int i=0;i<strArray.length;i++)
        {
            if(i==0)
            {
                Integer hh=new Integer(strArray[i]);
                hour=hh;
            }
            else
            {
                Integer mm=new Integer(strArray[i]);
                min=mm;
            }
        }

        min+=addition;
        hour=(hour+(min/60))%24;
        min%=60;
        
        if(min<10 || hour<10)
        {
            if(min<10 && hour<10)
                System.out.println("0"+hour+":"+"0"+min);
            else if(min<10)
                System.out.println(hour+":"+"0"+min);
            else if(hour<10)
                System.out.println("0"+hour+":"+min);
        }
        else
            System.out.println(hour+":"+min);
        sc.close();
    }
}
