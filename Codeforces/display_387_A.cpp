/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/747/problem/A
Code by : Sagar Kulkarni
*/

#include<iostream>
#include<cmath>
#include <bits/stdc++.h>
#include<climits>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n;
    cin>>n;

    long long int diff=LLONG_MAX;
    long long int r=0,c=0;
    for(long long int i=1;i<=sqrt(n);i++)
    {
        if(n%i==0)
        {
            long long int temp=n/i;
            long long int tempDiff=abs(temp-i);
            if(tempDiff<diff)
            {
                diff=tempDiff;
                if(temp<i)
                {
                    r=temp;
                    c=i;
                }
                else
                {
                    r=i;
                    c=temp;
                }
            }
        }
    }
    cout<<r<<" "<<c<<"\n";
    return 0;
}
