import java.util.Arrays;
import java.util.HashMap;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();

      map.put(nums[0], 0);

      for (int i=1; i<nums.length; i++) {
        int pairValue = target - nums[i];

        if (map.get(pairValue) != null) {
          return new int[]{map.get(pairValue), i};
        }

        map.put(nums[i], i);
      }

      return new int[]{};
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    // int[] res = sol.twoSum(new int[]{2,7,11,15}, 9);
    // int[] res = sol.twoSum(new int[]{3,2,4}, 6);
    int[] res = sol.twoSum(new int[]{3,3}, 6);
    System.out.println(Arrays.toString(res));
  }
}