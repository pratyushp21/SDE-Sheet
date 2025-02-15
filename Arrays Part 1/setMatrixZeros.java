class Solution {
    public void setZeroes(int[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;

        // taking extra for the cornor one 
        int extraRow=-1;
        int extraCol=-1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                        //System.out.println("OK "+i+" "+j);
                        if(j==0)
                        {
                           extraCol=0;
                        }
                        else matrix[0][j]=0;
                        if(i==0)
                        {
                            extraRow=0;
                        }
                        else matrix[i][0]=0;
                }
            }
        }
        // System.out.print(extra);
        // print(matrix);
        for(int i=1;i<m;i++)
        {
            if(matrix[0][i]==0)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    // print(matrix);
        for(int i=1;i<n;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        // if(extraCol==0 && extraRow==0){
        //   matrix[0][0]=0;
        //   for(int i=1;i<m;i++)
        //   {
        //     matrix[0][i]=0;
        //   }
        //   for(int i=1;i<n;i++)
        //   {
        //     matrix[i][0]=0;
        //   }

        // }
        if(extraCol==0)
        {
          for(int i=0;i<n;i++)
          {
            matrix[i][0]=0;
          }
        }
        if(extraRow==0)
        {
            for(int i=0;i<m;i++)
            {
                matrix[0][i]=0;
            }
        }
        
    }

    public void print(int arr[][])
    {
        for(int []val : arr)
        {
            System.out.println(Arrays.toString(val));
        }
    }
   
}