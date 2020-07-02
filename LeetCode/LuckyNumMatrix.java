/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/lucky-numbers-in-a-matrix/
Code by : Sagar Kulkarni
*/

import java.util.*; 

class LuckyNumMatrix
{
    public List<Integer> luckyNumbers (int[][] matrix)
    {
        int flag,min,index;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            min=matrix[i][0];
            index=0;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    index=j;
                }
            }

            flag=0;
            for(int k=0;k<matrix.length;k++)
            {
                if(matrix[k][index]>min)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
                list.add(min);
        }
        return list;
    }
}
