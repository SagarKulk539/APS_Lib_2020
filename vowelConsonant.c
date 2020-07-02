/*
APS-2020
Problem Description : Program determines if a character is a vowel or a consonant
Input : char (ch)
Output : string (vowel/consonant)
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

    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    {
        switch(ch)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'u':
            case 'U':printf("Vowel\n");
                     break;
            default:printf("Consonant\n");
        }
    }
    else
        printf("Invalid Character!\n");
    return 0;
}
