/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1372/problem/B
Code by : Sagar Kulkarni
*/

#include<iostream>
#include<cmath>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin>>t;

    for(int i=0;i<t;i++)
    {
        long int n;
        cin>>n;

        if(n%2==0)
        {
            cout<<n/2<<" "<<n/2<<"\n";
            continue;
        }

        int flag=0;
        for(int j=2;j<=sqrt(n);j++)
        {
            if(n%j==0)
            {
                flag=1;
                cout<<n/j<<" "<<n-(n/j)<<"\n";
                break;
            }
        }

        if(flag==0)
            cout<<1<<" "<<n-1<<"\n";

    }
    return 0;
}
