/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/779/problem/A
Code by : Sagar Kulkarni
*/

#include<iostream>
#include<cmath>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    int a[n];
    int b[n];

    int count[6]={0};

    for(int i=0;i<n;i++)
    {
        cin>>a[i];
        count[a[i]]++;
    }


    for(int i=0;i<n;i++)
    {
        cin>>b[i];
        count[b[i]]--;
    }


    int absSum=0;
    int flag=0;
    for(int i=1;i<6;i++)
    {
        if(count[i]%2!=0)
        {
            flag=1;
            break;
        }
        else
            absSum+=abs(count[i]);
    }

    if(flag==1)
        cout<<"-1\n";
    else
        cout<<absSum/4<<"\n";
    return 0;

}
