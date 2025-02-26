class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // first try to solve the problem in O(mlogn)
        int n=matrix.length;
        int m=matrix[0].length;
        int row=n-1;
        for(int i=0;i<n;i++)
        {
          if(target<=matrix[i][m-1])
          {
            row=i;
            break;
          }
        }
        boolean found=bsearch(matrix[row],target);
         
        return found;

    }
    public boolean bsearch(int arr[],int target)
    {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end)
        {
          int mid=(start+end)/2;
          if(arr[mid]==target)
          {
            return true;
          }
          else if(arr[mid]<target)
          {
            start=mid+1;
          }
          else
          {
            end=mid-1;
          }

        }
   

        return false;
    }
}

// optemized

class Solution {
    public int miniBinarySearch(int [][]arr,int target)
    {
        int st=0,end=arr.length-1;
        int ans=end;
        int m=arr[0].length;
        while(st<=end)
        { 
          int mid=(st+end)/2; 
          if(target<=arr[mid][m-1])
          {
            ans=mid;
            end=mid-1;
          }
          else
          {
            st=mid+1;
          }

        }
        return ans;

    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // first try to solve the problem in O(log(nm))
        int row=miniBinarySearch(matrix,target);
        boolean found=bsearch(matrix[row],target);
         
        return found;

    }
    public boolean bsearch(int arr[],int target)
    {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end)
        {
          int mid=(start+end)/2;
          if(arr[mid]==target)
          {
            return true;
          }
          else if(arr[mid]<target)
          {
            start=mid+1;
          }
          else
          {
            end=mid-1;
          }

        }
   

        return false;
    }
}