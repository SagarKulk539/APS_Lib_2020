/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-28/problems/final-prices-with-a-special-discount-in-a-shop/
Code by : Sagar Kulkarni
*/

class ShopDiscount
{
    public int[] finalPrices(int[] prices)
    {
        int[] arr=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            int discount=0;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    discount=prices[j];
                    break;
                }
            }
            arr[i]=prices[i]-discount;
        }
        return arr;
    }
}
