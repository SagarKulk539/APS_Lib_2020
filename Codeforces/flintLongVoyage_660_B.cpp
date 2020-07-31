/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1388/problem/B
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

    for(long long int var=0;var<t;var++)
    {
        long long int n;
        cin>>n;

        string str(n,'x');
        long long int k=n/4;
        if(n%4!=0)
            k+=1;

        long long int temp=n-k;
        long long int i=0;
        for(;i<temp;i++)
            str[i]='9';

        for(long long int j=i;j<n;j++)
            str[j]='8';
        cout<<str<<"\n";
    }
    return 0;
}
