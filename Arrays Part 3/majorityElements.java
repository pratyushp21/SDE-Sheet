class Solution {
    public int majorityElement(int[] nums) {
      
      // I am now using moores voting algo

      int cnt=0;
      int start=nums[0];

      for(int i=0;i<nums.length;i++){
        
        if(cnt==0) start=nums[i];
        if(nums[i]==start)
        {
            cnt++;
        }
        else
        {
            cnt--;
        }

      }
      return start;
    }
}