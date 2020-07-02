/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
Code by : Sagar Kulkarni
*/

class OddValMatrix
{
    public int oddCells(int n, int m, int[][] indices)
    {
        int count=0;
        int[][] arr=new int[n][m];

        for(int i=0;i<indices.length;i++)
        {
            for(int j=0;j<indices[0].length;j++)
            {
                if(j==0)
                {
                    for(int k=0;k<arr[0].length;k++)
                        arr[indices[i][j]][k]++;
                }
                else if(j==1)
                {
                    for(int k=0;k<arr.length;k++)
                        arr[k][indices[i][j]]++;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
}
