/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/count-largest-group/
Code by : Sagar Kulkarni
*/

class LargestGroup 
{
    public int countLargestGroup(int n) 
    {
        int[] sumArray=new int[100000];
        int tempSum;
        for(int i=1;i<=n;i++)
        {
            tempSum=0;
            int x=i;
            while(x!=0)
            {
                tempSum+=x%10;
                x/=10;
            }
            sumArray[tempSum]++;
        }
        
        int max=sumArray[0];
        for(int i=0;i<100000;i++)
        {
            if(sumArray[i]>max)
                max=sumArray[i];
        }
        int countMax=0;
        for(int i=0;i<100000;i++)
        {
            if(sumArray[i]==max)
                countMax++;
        }
        return countMax;
    }
}
