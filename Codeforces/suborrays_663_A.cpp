/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1391/problem/A
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

    for(long long int k=0;k<t;k++)
    {
        long long int n;
        cin>>n;

        for(long long int i=n;i>0;i--)
            cout<<i<<" ";
        cout<<"\n";
    }
    return 0;
}
