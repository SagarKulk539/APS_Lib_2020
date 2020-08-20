/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1130/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll n;
    cin>>n;

    ll temp;
    ll pos=0,neg=0;
    for(ll i=0;i<n;i++)
    {
        cin>>temp;
        if(temp>0)
            pos++;
        else if(temp<0)
            neg++;
    }

    if(n%2==0)
    {
        if(pos>=(n/2))
            cout<<"1\n";
        else if(neg>=(n/2))
            cout<<"-1\n";
        else
            cout<<"0\n";
    }
    else
    {
        if(pos>=(n/2)+1)
            cout<<"1\n";
        else if(neg>=(n/2)+1)
            cout<<"-1\n";
        else
            cout<<"0\n";
    }


    return 0;
}
