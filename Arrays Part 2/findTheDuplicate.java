class Solution {
    public int findDuplicate(int[] nums) {
      
      int flag=0;
      Arrays.sort(nums);

      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==nums[i+1])
        {
            flag=nums[i];
            break;
        }
      }
     return flag;
         
    }
}