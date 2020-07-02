/*
APS-2020
Problem Description : Program to determine BMI (given weight and height)
Input : 2 float (w and h)
Output : float (BMI), string (interpretation)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    float w,h,BMI;
    printf("Enter weight(in kg) and height(in m) respectively\n");
    scanf("%f%f",&w,&h);

    BMI=w/(h*h);

    printf("BMI : %f\n",BMI);
    if(BMI<18.5)
        printf("Under Weight\n");

    else if(BMI<24.9)
        printf("Normal\n");

    else if(BMI<29.9)
        printf("Over Weight\n");

    else
        printf("Obese\n");
    return 0;
}
