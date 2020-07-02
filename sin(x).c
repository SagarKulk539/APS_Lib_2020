/*
APS-2020
Problem Description : Program to find sum of following series/sin x
sinx=(x/1!)-((x^3)/3!)+((x^5)/5!)-..............
Input : float (degree)
Output : float (sum of series/sin(degree))
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
    long int f=1,i=1;
    int sign=1;
    float prev_sum=0;
    float sum=0;
    printf("Enter x in Degree\n");
    scanf("%f",&x);

    x=x*(3.142/180);
    y=x;

    for( ; ; )
    {
        sum=sum+y/f*sign;
        if(abs(sum-prev_sum)<=EPSILON)
            break;
        f=f*(i+1)*(i+2);
        i=i+2;
        sign=-sign;
        y=y*x*x;
        prev_sum=sum;
    }

    printf("Sum=%f\n",sum);

    return 0;
}
