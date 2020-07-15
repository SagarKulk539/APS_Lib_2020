/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/903/problem/A
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

    for(long long int i=0;i<n;i++)
    {
        long long int x;
        cin>>x;

        long long int temp=x/3;
        int flag=0;
        for(long long int i=0;i<=temp;i++)
        {
            long long int sum1=i*3;
            long long int rem=x-sum1;
            if(rem%7==0)
            {
                cout<<"YES\n";
                flag=1;
                break;
            }
        }
        if(flag==0)
            cout<<"NO\n";
    }
    return 0;
}
