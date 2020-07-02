/*
APS-2020
Problem Description : Program to determine whether entered character is digit,upper case,lower case or a special character
Input : char (ch)
Output : string (representing type of character)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    char ch;
    printf("Enter a Character\n");
    scanf("%c",&ch);

    if(ch>='0'&&ch<='9')
        printf("Digit\n");
    else if(ch>='a'&&ch<='z')
        printf("Lower Case\n");
    else if(ch>='A'&&ch<='Z')
        printf("Upper Case\n");
    else
        printf("Special Character\n");
    return 0;
}
