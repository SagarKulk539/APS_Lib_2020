/*
APS-2020
Problem Description : This program sorts a given array
Input : inetger[]
Output : integer[] (sorted)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

void bubbleSort(int* arr,int n)
{
    int i,j,temp,flag;

    for(i=0;i<n;i++)
    {
        flag=0;
        for(j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                flag=1;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        if(flag==0)
            break;
    }
}

int main()
{
    int n,i;
    printf("Enter array size\n");
    scanf("%d",&n);
    int arr[n];

    printf("Enter %d elements\n",n);
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);

    bubbleSort(arr,n);

    printf("Sorted Array : \n");
    for(i=0;i<n;i++)
        printf("%d ",arr[i]);
    return 0;
}
