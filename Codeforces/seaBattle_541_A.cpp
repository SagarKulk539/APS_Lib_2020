/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1131/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll w1,h1,w2,h2;
    cin>>w1>>h1>>w2>>h2;

    cout<<(h1*2+2)+(h2*2+2)+w1+w2+(w1-w2);
    return 0;
}
