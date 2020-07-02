/*
APS-2020
Problem Description : This program calculates Gross Salary (given basic pay,DA,HRA)
Input : float (basic pay)
Output : float (Gross Salary)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    float bs,G;
    printf("Enter the Basic Pay:\n");
    scanf("%f",&bs);

    /*
    Here we can separately calculate DA, HRA , and then calculate Gross salary by using the equation
    G=bs+DA+HRA;
    where DA=(0.4)*bs;
          HRA=(0.2)*bs;

    But instead we follow the below  mentioned method,
    G=bs+0.4(bs)+0.2*(bs);
    G=bs*(0.4+0.2+1);
    G=bs*1.6;
    */

    G=bs*1.6;
    printf("Gross Salary : %f\n",G);
    return 0;
}
