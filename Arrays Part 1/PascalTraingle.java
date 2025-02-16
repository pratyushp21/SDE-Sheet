class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        curr.add(1);
        ans.add(curr);
        for(int i=1;i<numRows;i++)
        {
            List<Integer>row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<curr.size()-1;j++)
            {
              int sum=curr.get(j)+curr.get(j+1);
              row.add(sum);
            }
            row.add(1);
            ans.add(row);
            curr=row;
        }

      return ans;
    }
}