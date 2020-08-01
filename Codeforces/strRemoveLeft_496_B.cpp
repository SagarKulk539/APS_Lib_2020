/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1005/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    string str1,str2;
    cin>>str1>>str2;

    long long int i=str1.length()-1;
    long long int j=str2.length()-1;

    while(i>=0 && j>=0)
    {
        if(str1[i]==str2[j])
        {
            i--;
            j--;
        }
        else
            break;
    }

    cout<<(i+1)+(j+1)<<"\n";
    return 0;
}
