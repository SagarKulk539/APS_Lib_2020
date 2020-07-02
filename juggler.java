/*
APS-2020
Problem Description/Goal : https://www.geeksforgeeks.org/juggler-sequence/
Input : integer (Juggler Sequence beginning integer)
Output : integer[] (array of integers denoting the Juggler Sequence)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        while(true)
        {
            System.out.print(n+" ");
            if(n==1)
                break;
            if(n%2==0)
                n=(int)Math.sqrt(n);
            else
                n=(int)(Math.pow(Math.sqrt(n),3));
        }
        sc.close();
    }
}
