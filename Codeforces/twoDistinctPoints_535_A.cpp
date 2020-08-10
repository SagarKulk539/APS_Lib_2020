/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1108/problem/A
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
        long long int l1,r1,l2,r2;
        cin>>l1>>r1>>l2>>r2;
        if(l1!=r2)
            cout<<l1<<" "<<r2<<"\n";
        else
            cout<<(l1+r1)/2<<" "<<(l2+r2)/2<<"\n";
    }
    return 0;
}
