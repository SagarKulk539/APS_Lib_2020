/*
APS-2020
Problem Description : Given no of rows and coloumns, this program depicts the type of matrix
Input : 2 integers
Output : string (type of matrix)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r=sc.nextInt();
        System.out.println("Enter no of coloumns");
        int c=sc.nextInt();

        if(r==0 && c==0)
            System.out.println("Dimension can't be 0*0");
        else if(r==c)
            System.out.println("Square Matrix");
        else if(r==1 && c==0)
            System.out.println("Row Matrix");
        else if(r==0 && c==1)
            System.out.println("Coloumn Matrix");
        else if(r<c)
            System.out.println("Horizontal Matrix");
        else if(r>c)
            System.out.println("Vertical Matrix");
        else
            System.out.println("Invalid Input!");
        sc.close();
    }
}
