package MaximumSubarray;

public class Solution {
  public int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int potSum = 0;

    for (int i = 0; i < nums.length; i++) {
      potSum += nums[i];
      maxSum = Math.max(potSum, maxSum);
      potSum = Math.max(0, potSum);
    }

    
    return maxSum;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    // int res = sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    // int res = sol.maxSubArray(new int[]{5,4,-1,7,8});
    // int res = sol.maxSubArray(new int[]{1});
    int res = sol.maxSubArray(new int[]{-2,-1, -5, -1, -2});
    System.out.println(res);
  }
  
}
