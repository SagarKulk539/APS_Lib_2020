/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/flipping-an-image/
Code by : Sagar Kulkarni
*/

class FlipImage 
{
    public int[][] flipAndInvertImage(int[][] A)
    {
        int[][] newMatrix=new int[A.length][A[0].length];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0,k=A[i].length-1;j<A[i].length;j++,k--)
            {
                if(A[i][k]==0)
                    newMatrix[i][j]=1;
                else
                    newMatrix[i][j]=0;
            }
        }
        return newMatrix;
    }
}
