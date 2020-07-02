/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/HS08TEST
Code by : Sagar Kulkarni
*/

import java.util.*;

class HS08TEST
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float y=sc.nextFloat();
        if(x%5!=0 || (float)x>=y)
            System.out.println(y);
        else
        {
            float amt=0.5f+(float)x;
            if(amt>y)
                System.out.println(y);
            else
                System.out.println(y-amt);
        }
        sc.close();
    }
}
