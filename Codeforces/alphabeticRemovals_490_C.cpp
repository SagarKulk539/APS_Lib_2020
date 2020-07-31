/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/999/problem/C
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,k;
    cin>>n>>k;

    string str;
    cin>>str;

    int flag=0;
    for(char var='a';var<='z';var++)
    {
        for(long long int i=0;i<str.length();i++)
        {
            if(str[i]==var)
            {
                str[i]=' ';
                k--;
                if(k==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
            break;
    }

    for(long long int i=0;i<str.length();i++)
    {
        if(str[i]!=' ')
            cout<<str[i];
    }
    return 0;
}
