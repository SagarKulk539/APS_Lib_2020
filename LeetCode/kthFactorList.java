/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-29/problems/the-kth-factor-of-n/
Code by : Sagar Kulkarni
*/

class kthFactorList
{
    public int kthFactor(int n, int k) 
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                list.add(i);
        }
        if(k>list.size())
            return -1;
        return list.get(k-1);
    }
}
