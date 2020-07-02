/*
APS-2020
Problem Description : Program to find sum of following series/ln x
ln x=((x-1)/x)+(0.5*(((x-1)/x)^2))+(0.5*(((x-1)/x)^3))+............
Input : float (x)
Output : float (sum of series/ln x)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

#define EPSILON 0.001
int main()
{
    float x,y;
    float prev_sum;
    float sum=0;
    printf("Enter Number\n");
    scanf("%f",&x);

    y=(x-1)/x;
    sum=y;

    for(;;)
    {
        y=y*(x-1)/x;
        prev_sum=sum;
        sum=sum+0.5*y;
        if(abs(sum-prev_sum)<=EPSILON)
            break;
    }
    printf("Sum = %f\n",sum);
    return 0;
}
