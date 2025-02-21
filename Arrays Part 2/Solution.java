public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
      int n = A.length;
        int[] ans = new int[2];
        long currentSum = 0;
        long squareSumArray = 0;
        
        long totalSum = ((long) n * (n + 1)) / 2;
        long totalSquareSum = ((long) n * (n + 1) * (2L * n + 1)) / 6;
        
        for (int i = 0; i < n; i++) {
            currentSum += A[i];
            squareSumArray += (long) A[i] * (long) A[i];
        }
        
        long temp = totalSum - currentSum; 
        long sumSqDiff = totalSquareSum - squareSumArray;
        long repeatedValue = (sumSqDiff - temp * temp) / (2 * temp);
        long missingValue = temp + repeatedValue;
        
        ans[0] = (int) repeatedValue;
        ans[1] = (int) missingValue;
        
        return ans;
        
    }
}
