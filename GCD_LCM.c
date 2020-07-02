/*
APS-2020
Problem Description : Program to find GCD and LCM of two Numbers using Euclid Algorithm
Input : 2 int (a,b)
Output : 2 int (GCD,LCM)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int a,b;
    int r=1;
    int lcm;
    int x,y;

    printf("Enter two Numbers\n");
    scanf("%d%d",&a,&b);

    if(a<0)
        a=-a;

    if(b<0)
        b=-b;

    x=a;
    y=b;

    while(r!=0)
    {
        r=b%a;
        b=a;
        a=r;
    }

    lcm=x*y/b;

    printf("GCD = %d\n",b);
    printf("LCM = %d\n",lcm);
    return 0;
}
