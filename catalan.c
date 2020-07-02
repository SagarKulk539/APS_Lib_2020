/*
APS-2020
Problem Description/Goal : Print the catalan number sequence (0th-catalan to (n-1)th-catalan)
Input : integer 'n'
Ouptut : integer[] (representing all catalan numbers < n)
Code by : Sagar Kulkarni
*/

#include<stdio.h>

unsigned long int catalan(unsigned int n)
{
	if(n<=1)
        return 1;
	unsigned long int res=0;

    int i;
    for(i=0;i<n;i++)
		res+=catalan(i)*catalan(n-i-1);

	return res;
}

int main()
{
    int N,i;
    printf("Enter Number (to generate catalan < N)\n");
    scanf("%d",&N);
	for(i=0;i<N;i++)
		printf("%dth Catalan : %lu\n",i,catalan(i));
	return 0;
}
