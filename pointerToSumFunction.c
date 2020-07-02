/*
APS-2020
Problem Description : This program demonstrates a pointer to a function (sum of 2 numbers)
Input : 2 integers (a,b)
Output : integer (sum)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int sum(int a,int b)
{
    return a+b;
}

int main()
{
    int a,b;
    int (*ptr)(int,int);
    printf("Enter 2 values\n");
    scanf("%d%d",&a,&b);
    ptr=sum;
    int res=ptr(a,b);
    printf("Sum : %d",res);
    return 0;
}
