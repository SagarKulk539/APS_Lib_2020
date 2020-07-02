/*
APS-2020
Problem Description : Program to swap 1st and last digit of a given number
Input : int (n)
Output : int (modified due to swap first_digit<->last_digit)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    long int n,f,L,count=0;
    int s;
    printf("Enter a Number\n");
    scanf("%ld",&n);
    s=n;

    while(n!=0)
    {
        n=n/10;
        count++;
    }

    L=s%10;
    f=s/(pow(10,count-1));
    s=s-L+f;
    s=s-(f*pow(10,(count-1)));
    s=s+(L*pow(10,(count-1)));

    printf("Modified Number = %d\n",s);
    return 0;
}
