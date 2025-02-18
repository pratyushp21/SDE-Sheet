class Solution {
    public int[][] merge(int[][] intervals) {

        // [3,6],[8,10] , [4,7] , [1,4] , [5,6]
        // [1,4],[3,6],[4,7],[5,6],[8,10]
        // [1,4],[3,6],[5,6],[4,7],[8,10]
        // sort acc. to the second value in the data
        List<int[]>temp=new ArrayList<int[]>();
        Arrays.sort(intervals,(a,b)-> 
        { 
            //if(a[1]==b[1]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[0],b[0]);
        });
        int n=intervals.length;
        int first=intervals[0][0];
        int second=intervals[0][1];
        int fill=0;
        for(int i=1;i<n;i++)
        {
           if(intervals[i][0]<=second)
           {
              if(intervals[i][1]>second)
                   second=intervals[i][1];
              
           }
           else
           {
             temp.add(new int[]{first,second});
            //  ans[fill][0]=first;
            //  ans[fill][1]=second;
            //  fill++;
             first=intervals[i][0];
             second=intervals[i][1];
             
           }
        }
        temp.add(new int[]{first,second});
        int sz=temp.size();
        int [][]ans=new int[sz][2];
        for(int i=0;i<sz;i++)
        {
            ans[i][0]=temp.get(i)[0];
            ans[i][1]=temp.get(i)[1];

        }
        return ans;
        
    }
}