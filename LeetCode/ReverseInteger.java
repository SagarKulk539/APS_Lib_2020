/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/reverse-integer/
Code by : Sagar Kulkarni
*/

class ReverseInteger 
{
    public int reverse(int x)
    {
        int sign=1;
        if(x<0)
        {
            sign=-1;
            x*=sign;
        }


        int rev=0;
        while(x>0)
        {
            if (rev > 214748364)
                return 0;
            rev=rev*10+x%10;
            x/=10;
        }

        return sign*rev;
    }
}
