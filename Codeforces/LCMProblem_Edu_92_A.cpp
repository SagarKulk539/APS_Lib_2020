/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1389/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int t;
    cin>>t;

    for(long long int i=0;i<t;i++)
    {
        long long int l,r;
        cin>>l>>r;

        long long temp=l*2;
        if(temp<=r)
            cout<<l<<" "<<temp<<"\n";
        else
            cout<<"-1 -1\n";
    }
    return 0;
}
