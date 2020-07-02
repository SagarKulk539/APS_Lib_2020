/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/minimum-time-visiting-all-points/
Code by : Sagar Kulkarni
*/

class VisitAllPoints 
{
    public int minTimeToVisitAllPoints(int[][] points)
    {
        int seconds=0;
        for(int i=0;i<points.length-1;i++)
        {
            for(int j=0;j<points[i].length-1;j++)
                seconds+=Math.max(Math.abs(points[i][j]-points[i+1][j]),Math.abs(points[i][j+1]-points[i+1][j+1]));
        }
        return seconds;
    }
}
