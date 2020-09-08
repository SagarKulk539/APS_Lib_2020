/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-34/problems/matrix-diagonal-sum/
Code by : Sagar Kulkarni
*/

class MatrixDiagonalSum 
{
    public int diagonalSum(int[][] mat) 
    {
        int row=mat.length;
        int col=mat[0].length;
        
        //principal diagonal sum
        int principalSum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    principalSum+=mat[i][j];
                    mat[i][j]=-1;
                }
            }
        }
        
        //secondary diagonal sum
        int secondarySum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j==col-i-1 && mat[i][j]!=-1)
                    secondarySum+=mat[i][j];
            }
        }
        
        return principalSum+secondarySum;
    }
}
