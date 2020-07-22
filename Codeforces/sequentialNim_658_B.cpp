/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1382/problem/B
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
        cin>>n;

        long long int arr[n];
        for(long long int i=0;i<n;i++)
            cin>>arr[i];

        bool turn1=true,turn2=false;
        for(long long int i=0;i<n;i++)
        {
            if(arr[i]>1)
            {
                turn1=!turn1;
                turn2=!turn2;
                break;
            }
            else
            {
                turn1=!turn1;
                turn2=!turn2;
            }
        }

        if(turn1)
            cout<<"Second\n";
        else if(turn2)
            cout<<"First\n";
    }
    return 0;
}

