/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Code by : Sagar Kulkarni
*/

class ReduceToZero
{
    public int numberOfSteps (int num)
    {
        int count=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }

            else
            {
                count++;
                num--;
            }

        }
        return count;
    }
}
