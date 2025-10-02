class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
         
         int n=grid.size();
         long long nn=n*n;
         int sumOfNnumber=nn*(nn+1)/2;
         long long sumofsquaresofN= nn*(nn+1)*(2*nn+1)/6;
         cout<<sumOfNnumber<<" "<<sumofsquaresofN<<endl;
         int sum=0;
         long long sumSquare=0;
         // missing is x and repeating is y
         for(int i=0;i<n;i++)
         {
            
            for(int j=0;j<grid[i].size();j++)
            {
                sum+=grid[i][j];
                sumSquare+=(grid[i][j]*grid[i][j]);

            }
         }

         long long diffSum=sumOfNnumber-sum;
         long long diffSquareSum=sumofsquaresofN-sumSquare;
         // value of x-y = diffSum
         // value of x+y = diffSquareSum /diffSum

         int xplusy=diffSquareSum /diffSum;
         int x = (diffSum + xplusy)/2;
         int y= xplusy-x;

         vector<int>ans={y,x};

         
         return ans;
    }
};