/*
APS-2020
Problem Description : This program computes simple interest (given p,t,r)
Input : 3 float (p,t,r)
Output : float (SI)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    float p,t,r;

    printf("Enter Principal\n");
    scanf("%f",&p);

    printf("Enter Time (in years)\n");
    scanf("%f",&t);

    printf("Enter Rate of Interest (in percentage)\n");
    scanf("%f",&r);

    printf("Simple Interest : %f",(p*t*r)/100);
    return 0;
}
