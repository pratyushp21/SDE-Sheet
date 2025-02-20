class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int []ans=new int[2];
        mp.put(nums[0],0);
        for(int i=0;i<nums.length;i++)
        {
            int check=target-nums[i];
            // System.out.println(mp);

            if(mp.get(check)!=null)
            {
                ans[0]=mp.get(check);
                ans[1]=i;
                if(mp.get(check)!=i)
                    break;
            }
            if(mp.get(nums[i])==null)
            {
                mp.put(nums[i],i);
                System.out.print("Fill ");
            }
        }

        return ans;

    }
}