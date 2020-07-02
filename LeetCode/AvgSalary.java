/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-29/problems/average-salary-excluding-the-minimum-and-maximum-salary/
Code by : Sagar Kulkarni
*/

class AvgSalary 
{
    public double average(int[] salary) 
    {
        Arrays.sort(salary);
        double total=0.0;
        for(int i=1;i<salary.length-1;i++)
            total+=salary[i];
        total/=(salary.length-2);
        return total;
    }
}
