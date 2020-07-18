/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/915/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,pos,l,r;
    cin>>n>>pos>>l>>r;

    long long int totalSeconds=0;
    if(l==1 && r==n)
        totalSeconds=0;
    else
    {
        if(abs(pos-l)<abs(pos-r))
        {
            if(l==1)
            {
                totalSeconds+=abs(pos-r);
                totalSeconds+=1;
            }
            else if(r==n)
            {
                totalSeconds+=abs(pos-l);
                totalSeconds+=1;
            }
            else
            {
                totalSeconds+=abs(pos-l);
                totalSeconds+=abs(l-r);
                totalSeconds+=2;
            }
        }
        else
        {
            if(l==1)
            {
                totalSeconds+=abs(pos-r);
                totalSeconds+=1;
            }
            else if(r==n)
            {
                totalSeconds+=abs(pos-l);
                totalSeconds+=1;
            }
            else
            {
                totalSeconds+=abs(pos-r);
                totalSeconds+=abs(l-r);
                totalSeconds+=2;
            }
        }
    }
    cout<<totalSeconds<<"\n";
    return 0;
}
