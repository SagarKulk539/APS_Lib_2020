/*
APS-2020
Problem Description : Program to determine if a point lies inside the circle,on the circle or outside circle
Input : 5 float (radius, center(x,y), point(x,y))
Output : string (depicting where the given point(x,y) lies wrt circle)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    float r,xp,yp,xc,yc,d;
    printf("Enter Radius\n");
    scanf("%f",&r);

    printf("Enter Co-ordinates of Center of circle (x,y)\n");
    scanf("%f%f",&xc,&yc);

    printf("Enter Co-ordinates of the point (x,y)\n");
    scanf("%f%f",&xp,&yp);

    d=sqrt((xp-xc)*(xp-xc)+(yp-yc)*(yp-yc));

    if(d==r)
        printf("On Circumference\n");

    else if(d<r)
        printf("Point lies inside Circle\n");

    else
        printf("Point lies outside Circle\n");
    return 0;
}
