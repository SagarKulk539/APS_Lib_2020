/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1077/problem/A
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

    for(long long int j=0;j<t;j++)
    {
        long long int a,b,k;
        cin>>a>>b>>k;

        long long int jumpCount=k/2;
        long long int res;
        if(k%2==0)
            res=(jumpCount)*a-(jumpCount)*b;
        else
            res=(jumpCount+1)*a-(jumpCount)*b;
        cout<<res<<"\n";
    }
    return 0;
}
