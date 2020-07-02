/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-28/problems/subrectangle-queries/
Code by : Sagar Kulkarni
*/

class SubrectangleQueries 
{
    public int[][] rectangle;
    public SubrectangleQueries(int[][] rectangle) 
    {
        this.rectangle=new int[rectangle.length][rectangle[0].length];  
        for(int i=0;i<rectangle.length;i++)
        {
            for(int j=0;j<rectangle[i].length;j++)
            {
                this.rectangle[i][j]=rectangle[i][j];
            }
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) 
    {
        for(int i=row1;i<=row2;i++)
        {
            for(int j=col1;j<=col2;j++)
            {
                rectangle[i][j]=newValue;
            }
        }
    }
    
    public int getValue(int row, int col) 
    {
        return rectangle[row][col];
    }
}
