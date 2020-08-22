/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1401/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll t;
    cin>>t;

    for(ll i=0;i<t;i++)
    {
        ll x1,y1,z1;
        ll x2,y2,z2;

        cin>>x1>>y1>>z1>>x2>>y2>>z2;

        ll totalSum=0;

        ll minVal21=min(z1,y2);
        totalSum+=minVal21*2;
        z1-=minVal21;
        y2-=minVal21;

        ll minVal22=min(z1,z2);
        z2-=minVal22;
        z1-=minVal22;

        ll minVal02=min(x1,z2);
        x1-=minVal02;
        z2-=minVal02;

        ll finalMin=min(y1,z2);
        totalSum-=finalMin*2;
        y1-=finalMin;
        z2-=finalMin;

        cout<<totalSum<<"\n";
    }
    return 0;
}
