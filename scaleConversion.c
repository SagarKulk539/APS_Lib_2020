/*
APS-2020
Problem Description : Program to convert (distance in kms) to meters, inches, feet and centimeters
Input : float (distance in km)
Output : 4 floats (mts,cms,inch,feet)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    float km,m,cm,I,F;
    printf("Enter Distance in Kilometers :\n");
    scanf("%f",&km);
    m=1000*km;
    cm=100*m;
    I=cm/2.54;
    F=12*I;
    printf("Meters : %f\nCentimeters : %f\nInches : %f\nFeet : %f",m,cm,I,F);
    return 0;
}
