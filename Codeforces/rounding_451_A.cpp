/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/898/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#include<climits>
#include<cmath>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n;
    cin>>n;

    long long int temp=n%10;
    if(temp==0)
        cout<<n<<"\n";
    else
    {
        if(temp<5)
            cout<<n-temp<<"\n";
        else if(temp==5)
            cout<<n-temp<<"\n";
        else
        {
            temp=10-temp;
            cout<<n+temp<<"\n";
        }
    }

    return 0;
}
