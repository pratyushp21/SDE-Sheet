class Solution {
    public void sortColors(int[] nums) {
       
       // for the first solution we are going to use bucket sort

       int []freq={0,0,0}; 

       for(int i:nums)
       {
         freq[i]++;
       }
       System.out.println(Arrays.toString(freq));
      // first fill zero
      fill(nums,0,freq[0],0);
      // 1
      fill(nums,1,freq[1],freq[0]);
      //2
      fill(nums,2,freq[2],freq[0]+freq[1]);
        
    }
    public void fill(int []arr,int val,int times,int st)
    {
        while(times>0)
        {
            arr[st++]=val;
            // System.out.println(times);
            times--;
        }
    }
}