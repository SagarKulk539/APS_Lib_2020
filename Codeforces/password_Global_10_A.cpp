/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1392/problem/A
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

    for(ll k=0;k<t;k++)
    {
        ll n;
        cin>>n;

        int flag=0;
        ll prev,curr;

        for(ll i=0;i<n;i++)
        {
            cin>>curr;
            if(i==0)
                prev=curr;
            else
            {
                if(prev!=curr)
                    flag=1;
                prev=curr;
            }
        }

        if(flag==0)
            cout<<n<<"\n";
        else
            cout<<"1\n";
    }
    return 0;
}
