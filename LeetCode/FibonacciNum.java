/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/fibonacci-number/
Code by : Sagar Kulkarni
*/

class FibonacciNum 
{
    public int fib(int N)
    {
        int a=0;
        int b=1;
        if(N==0)
            return 0;
        if(N==1)
            return 1;
        int c=a+b;
        for(int i=0;i<N-2+1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
