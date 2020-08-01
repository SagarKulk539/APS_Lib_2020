/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1006/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n;
    cin>>n;

    long long int temp;
    for(long long int i=0;i<n;i++)
    {
        cin>>temp;
        if(temp%2==0)
            cout<<temp-1<<" ";
        else
            cout<<temp<<" ";
    }
    cout<<"\n";

    return 0;
}
