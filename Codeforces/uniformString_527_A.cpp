/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1092/problem/A
Code by : Sagar Kulkarni
*/

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
        int n,k;
        cin>>n>>k;

        for(int j=0;j<n;j++)
            cout<<char('a'+j%k);
        cout<<"\n";
    }
    return 0;
}
