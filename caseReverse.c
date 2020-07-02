/*
APS-2020
Problem Description : This program can be used to toggle between upper to lower case and vice versa
Input : char (A-Z and a-z)
Output : char (a-z or A-Z by toggling given input)
Code by : Sagar Kulkarni
*/

#include<stdio.h>

int main()
{
    char ch;

    //Upper to Lower Case
    printf("Enter a Character (A-Z)\n");
    scanf("%c",&ch);
    ch=ch|32;
    printf("Lower Cased : %c\n",ch);

    //Lower to Upper Case
    printf("Enter a Character (a-z)\n");
    getchar();
    scanf("%c",&ch);
    ch=ch&(~32);
    printf("Upper Cased : %c\n",ch);
    return 0;
}
