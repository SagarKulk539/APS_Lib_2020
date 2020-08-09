/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1102/problem/A
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

    long long int temp=n*(n+1);
    temp/=2;

    if(temp%2==0)
        cout<<"0\n";
    else
        cout<<"1\n";
    return 0;
}
