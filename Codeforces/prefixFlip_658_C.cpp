/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1382/problem/C1
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
        long long int n;
        string a,b;
        vector<long long int> list;
        cin>>n;
        cin>>a>>b;

        for(long long int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
                list.push_back(i+1);
                list.push_back(1);
                list.push_back(i+1);
            }
        }

        cout<<list.size()<<" ";
        for(long long int i=0;i<list.size();i++)
            cout<<list[i]<<" ";
        cout<<"\n";
    }
    return 0;
}
