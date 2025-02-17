class Solution {
    public void sortColors(int[] nums) {
       
       // now going to use some partitaion logic to solve this question

       int right= nums.length-1;
       int left=0;
       int i=0;
       while(left<right && i<=right )
       {
         if(nums[i]==0)
         {
            int temp=nums[left];
            nums[left]=nums[i];
            nums[i]=temp;
            left++;
            i++;
         }
         else if(nums[i]==2)
         {
            // no need to increment i here 
           int temp=nums[right];
           nums[right]=nums[i];
           nums[i]=temp;
           right--;
         }
         else i++;
    
       }
       
    }
}