class Solution {

    public void doReverse(int []arr)
    {
      int n=arr.length;
      for(int i=0;i<n/2;i++)
      {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
      }


    }
    public void rotate(int[][] matrix) {
        
    //  1 4 7
    //  2 5 8
    //  3 6 9

    // first need to transpose the matrix
    int n=matrix.length;
    int m=matrix[0].length;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i;j++)
      {
        int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
      }

    }
    for(int i=0;i<n;i++)
    {
        // System.out.println(Arrays.toString(matrix[i]));
        doReverse(matrix[i]);
    }


    }
}