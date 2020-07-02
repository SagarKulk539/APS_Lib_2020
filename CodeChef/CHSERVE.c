/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/CHSERVE
Code by : Sagar Kulkarni
*/

#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	scanf("%d",&t);

	while(t>0)
	{
	    int p1,p2,k;
	    scanf("%d%d%d",&p1,&p2,&k);
	    if((p1+p2)%(2*k)<k)
	        printf("CHEF\n");
	    else
	        printf("COOK\n");
	    t--;

	}
	return 0;
}
