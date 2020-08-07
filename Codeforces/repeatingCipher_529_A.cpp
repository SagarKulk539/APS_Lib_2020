/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1095/problem/A
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

    string str;
    cin>>str;

    int count=1;
    for(long long int i=0;i<str.size();i+=count)
    {
        cout<<str[i]<<"";
        count++;
    }
    cout<<"\n";
    return 0;
}
