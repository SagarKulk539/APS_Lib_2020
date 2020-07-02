/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/MARCH20B/problems/ENGXOR
Code by : Sagar Kulkarni
*/

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define P1(x) x,x^1,x^1,x
#define P2(x) P1(x),P1(x^1),P1(x^1),P1(x)
#define P3(x) P2(x),P2(x^1),P2(x^1),P2(x)
#define lookup P3(0),P3(1),P3(1),P3(0)

unsigned int lookupTable[256]={lookup};

int findParity(int number)
{
	int max1=16;

	while(1)
	{
		if(max1<8)
			break;
		number=number^(number>>max1);
		max1=max1/2;
	}

	return lookupTable[number&0xff];
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int T;
    cin>>T;
    for(int i=0;i<T;i++)
    {
        int N,Q;
        cin>>N>>Q;
        int arr[N];
        int countEven=0,countOdd=0;
        int res2;
        for(int j=0;j<N;j++)
        {
            cin>>arr[j];
            res2=findParity(arr[j]);
            if(res2==0)
                    countEven++;
                else
                    countOdd++;
        }

        for(int j=0;j<Q;j++)
        {
            int P;
            cin>>P;
            int res1;

            res1=findParity(P);
            if(res1==0)
                cout<<countEven<<" "<<countOdd<<"\n";
            else
                cout<<countOdd<<" "<<countEven<<"\n";
        }
    }
}
