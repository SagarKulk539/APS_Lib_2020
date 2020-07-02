/*
APS-2020
Problem Description : Program to count the no of bit swaps to convert a number A to number B
Input : 2 int (a,b)
Output : int (bits swaps)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int a,b,c;
    int count=0;
    printf("Enter two Numbers\n");
    scanf("%d%d",&a,&b);

    c=a^b;
    while(c!=0)
    {
        c=c&(c-1);
        count++;
    }
    printf("Number of bit swaps to convert %d to %d = %d\n",a,b,count);
    return 0;
}
