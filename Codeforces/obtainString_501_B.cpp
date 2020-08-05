/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1015/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    string s,t;
    cin>>s>>t;

    int flag=0,wentIn=0;
    vector<int> list;
    for(int i=0;i<n;i++)
    {
        if(s[i]!=t[i])
        {
            wentIn=1;
            int index=-1;
            for(int j=i+1;j<n;j++)
            {
                if(s[j]==t[i])
                {
                    index=j;
                    break;
                }
            }
            if(index==-1)
            {
                flag=1;
                break;
            }
            for(int j=index-1;j>=i;j--)
            {
                swap(s[j],s[j+1]);
			    list.push_back(j+1);
		    }
        }
    }
    if(flag==1)
        cout<<"-1\n";
    else if(wentIn==0)
        cout<<"0\n";
    else
    {
        cout<<list.size()<<"\n";
        for(int i=0;i<list.size();i++)
            cout<<list[i]<<" ";
        cout<<"\n";
    }
    return 0;
}
