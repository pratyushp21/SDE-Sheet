// leetcode question - https://leetcode.com/problems/find-missing-and-repeated-values/

class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
         
         int n=grid.size();
         
         map<int,int>mp;
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<grid[i].size();j++)
            {
                mp[grid[i][j]]+=1;
            }
         }
         vector<int>ans={1,2};

         for(int i=1;i<=n*n;i++)
         {
            if(mp[i]==2) ans[0]=i;
            if(mp[i]==0) ans[1]=i;

         }
         return ans;
    }
};