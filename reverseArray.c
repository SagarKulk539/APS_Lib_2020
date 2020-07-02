/*
APS-2020
Problem Description : This program reverses a given array
Input : inetger[]
Output : integer[] (reversed)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int n,i;
    printf("Enter array size\n");
    scanf("%d",&n);

    int *p1,*p2,temp;
    int arr[n];
    printf("Enter %d array elements\n",n);
    for(i=0;i<n;i++)
        scanf("%d",arr+i);

    for(p1=arr,p2=arr+(n-1);p1<p2;p1++,p2--)
    {
        temp=*p1;
        *p1=*p2;
        *p2=temp;
    }

    printf("After Modification\n");
    for(i=0;i<n;i++)
        printf("%d ",*(arr+i));
    return 0;
}
