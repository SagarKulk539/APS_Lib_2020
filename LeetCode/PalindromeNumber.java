/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/palindrome-number/
Code by : Sagar Kulkarni
*/

class PalindromeNumber 
{
    public boolean isPalindrome(int x)
    {
        if(x<0)
            return false;
        int org=x;
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x/=10;
        }

        if(rev==org)
            return true;

        return false;
    }
}
