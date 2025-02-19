class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int num1Pointer=0,num2Pointer=0;

        while(num1Pointer < m && num2Pointer < n)
        {
          if(nums2[num2Pointer] < nums1[num1Pointer])
          {
            int temp=nums1[num1Pointer];
            nums1[num1Pointer]=nums2[num2Pointer];
            nums2[num2Pointer]=temp;
            num1Pointer++;
            num2Pointer++;
          }
          else num1Pointer++;


        }
        num2Pointer=0;
        // System.out.println(Arrays.toString(nums1) + " " + num2Pointer);
        while(num2Pointer<n)
        {
          nums1[num1Pointer++]=nums2[num2Pointer++];
        }



    }
}