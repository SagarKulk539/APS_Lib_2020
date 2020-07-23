/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/931/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int a,b;
    cin>>a>>b;

    long long int temp=a+b;
    temp/=2;

    long long int n1=abs(temp-a);
    long long int n2=abs(temp-b);

    long long int ans1=n1*(n1+1);
    ans1/=2;

    long long int ans2=n2*(n2+1);
    ans2/=2;

    cout<<ans1+ans2<<"\n";

    return 0;
}
