/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
Code by : Sagar Kulkarni
*/

class DigitInteger
{
    public int subtractProductAndSum(int n)
    {
        int product=1,sum=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            product*=rem;
            sum+=rem;
            n/=10;
        }

        return product-sum;
    }
}
