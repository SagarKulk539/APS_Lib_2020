/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/898/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,a,b;
    cin>>n>>a>>b;

    if(n%a==0 || n%b==0)
    {
        if(n%a==0)
        {
            cout<<"YES\n";
            cout<<n/a<<" "<<0<<"\n";
        }
        else
        {
            cout<<"YES\n";
            cout<<0<<" "<<n/b<<"\n";
        }
    }
    else
    {
        long long int temp=(n/a)+1;
        long long int sumA=0;
        int flag=0;
        for(long long int i=0;i<=temp;i++)
        {
            sumA=i*a;
            if((n-sumA)%b==0 && (n-sumA)>0)
            {
                cout<<"YES\n";
                cout<<i<<" "<<(n-sumA)/b<<"\n";
                flag=1;
                break;
            }
        }
        if(!flag)
            cout<<"NO\n";
    }
    return 0;
}
