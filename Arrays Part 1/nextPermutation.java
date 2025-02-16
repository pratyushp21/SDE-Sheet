class Solution {

    public void reverse(int []arr, int st,int end)
    {
       while(st<end)
       {
         int temp=arr[st];
         arr[st]=arr[end];
         arr[end]=temp;
          
         st++;
         end--;
       }

    }

    public void nextPermutation(int[] nums) {
        // Step1 -> Idea is to find the first value from the end where nums[i+1]>nums[i]
        //Step2 ->  Findirst value from end where nums[i] > (nums[i] value found in the first step)
        //Srep3 -> swap the value at both index
        //Step4->  reverse the all the value found from 1st step till end
       
       int breakIndex=-1;
       int breakVal=-1;

       for(int i=nums.length-1;i>0;i--)
       {
         if(nums[i]>nums[i-1])
         {
            breakIndex=i-1;
            breakVal=nums[i-1];
            break;
         }
       }
 
    int secIndex=-1;
       for(int i=nums.length-1;i>=0;i--)
       {
         if(nums[i]>breakVal)
         {
            secIndex=i;
            break;
         }
       }
     // swap the value
    //  System.out.println(breakIndex+" "+secIndex);
     if(breakIndex!=-1)
     {
       int temp=nums[breakIndex];
       nums[breakIndex]=nums[secIndex];
       nums[secIndex]=temp;

       reverse(nums,breakIndex+1,nums.length-1);
     }

     else
     {
       reverse(nums,0,nums.length-1);
     }
        
    }
}