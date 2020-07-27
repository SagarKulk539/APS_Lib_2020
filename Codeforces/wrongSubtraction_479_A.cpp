/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/977/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

bool containsZero(long long int n)
{
    long long int rem=n%10;
    if(rem==0)
        return true;
    else
        return false;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,k;
    cin>>n>>k;

    for(long long int i=0;i<k;i++)
    {
        if(containsZero(n))
            n/=10;
        else
            n--;
    }
    cout<<n<<"\n";
    return 0;
}
