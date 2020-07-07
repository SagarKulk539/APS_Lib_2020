/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/746/problem/A
Code by : Sagar Kulkarni
*/

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int a,b,c;
    cin>>a>>b>>c;

    int flag=0;
    while(true)
    {
        long long int mulB=2*a;
        long long int mulC=4*a;

        if(mulB<=b && mulC<=c)
        {
            cout<<(a+mulB+mulC)<<"\n";
            flag=1;
            break;
        }
        else
        {
            a-=1;
            if(a==0)
                break;
        }
    }

    if(flag==0)
        cout<<0<<"\n";

    return 0;
}
