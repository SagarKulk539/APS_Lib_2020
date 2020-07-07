/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/733/problem/B
Code by : Sagar Kulkarni
*/

#include<iostream>
#include<cstdlib>
#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    long long int leftSum=0;
    long long int rightSum=0;

    long long int left[n];
    long long int right[n];

    for(int i=0;i<n;i++)
    {
        int l,r;
        cin>>l>>r;

        left[i]=l;
        right[i]=r;

        leftSum+=l;
        rightSum+=r;
    }

    int index=-1;
    long long int beauty=abs(leftSum-rightSum);

    for(int i=0;i<n;i++)
    {
        long long int L=leftSum-left[i]+right[i];
        long long int R=rightSum-right[i]+left[i];

        if(abs(L-R)>beauty)
        {
            index=i;
            beauty=abs(L-R);
        }
    }

    cout<<index+1<<"\n";
    return 0;
}
