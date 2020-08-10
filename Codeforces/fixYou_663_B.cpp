/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1391/problem/B
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
        long long int n,m;
        cin>>n>>m;

        long long int count=0;
        char temp;
        for(long long int i=0;i<n;i++)
        {
            for(long long int j=0;j<m;j++)
            {
                cin>>temp;
                if(temp=='R')
                {
                    if(j+1>m-1)
                        count++;
                }
                else if(temp=='D')
                {
                    if(i+1>n-1)
                        count++;
                }
            }
        }
        cout<<count<<"\n";
    }
    return 0;
}
