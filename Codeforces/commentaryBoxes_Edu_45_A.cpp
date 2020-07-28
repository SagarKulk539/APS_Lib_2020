/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/990/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,m,a,b;
    cin>>n>>m>>a>>b;

    if(n%m==0)
        cout<<0<<"\n";
    else
    {
        if(n<m)
        {
            long long int ans1=n*b;
            long long int ans2=(m-(n%m))*a;
            if(ans1<ans2)
                cout<<ans1<<"\n";
            else
                cout<<ans2<<"\n";
        }
        else
        {
            long long int ans1=n-m;
            ans1*=b;

            long long int temp1=n%m;
            long long int ans2=(n-temp1)+m;
            ans2-=n;
            ans2*=a;

            long long int ans3=temp1;
            ans3*=b;

            if(ans1<ans2)
            {
                if(ans1<ans3)
                    cout<<ans1<<"\n";
                else
                    cout<<ans3<<"\n";
            }

            else
            {
                if(ans2<ans3)
                    cout<<ans2<<"\n";
                else
                    cout<<ans3<<"\n";
            }
        }
    }

    return 0;
}
