/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-198/problems/water-bottles/
Code by : Sagar Kulkarni
*/

class WaterBottles 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int emptyBottles=numBottles;
        int drankWater=numBottles;
        while(emptyBottles>=numExchange)
        {
            drankWater+=emptyBottles/numExchange;
            emptyBottles=(emptyBottles/numExchange)+(emptyBottles%numExchange);
        }
        return drankWater;
    }
}
