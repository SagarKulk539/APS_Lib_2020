/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/903/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int h1,a1,c1,h2,a2;
    cin>>h1>>a1>>c1>>h2>>a2;

    vector<string> list;
    while(true)
    {
        if(h1-a2<=0)
        {
            if(h2-a1<=0)
            {
                h2-=a1;
                h1-=a2;
                list.push_back("STRIKE");
            }
            else
            {
                h1-=a2;
                h1+=c1;
                list.push_back("HEAL");
            }
        }
        else
        {
            h2-=a1;
            h1-=a2;
            list.push_back("STRIKE");
        }

        if(h2<=0)
            break;
    }

    cout<<list.size()<<"\n";
    for(long long int i=0;i<list.size();i++)
        cout<<list[i]<<"\n";

    return 0;
}
