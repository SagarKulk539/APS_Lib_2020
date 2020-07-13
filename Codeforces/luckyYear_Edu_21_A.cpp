/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/808/problem/A
Code by : Sagar Kulkarni
*/

#include<iostream>
#include<cmath>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n;
    cin>>n;

    long long int x=n;
    long long int count=0;
    while(n!=0)
    {
        count+=1;
        n/=10;
    }

    long long int firstPlace=x/pow(10,count-1);
    firstPlace*=pow(10,count-1);
    firstPlace+=pow(10,count-1);

    cout<<firstPlace-x<<"\n";
    return 0;
}
