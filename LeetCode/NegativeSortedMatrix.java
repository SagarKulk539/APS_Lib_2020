/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
Code by : Sagar Kulkarni
*/

class NegativeSortedMatrix {
    public int countNegatives(int[][] grid)
    {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]<0)
                    count++;
            }
        }
        return count;
    }
}
