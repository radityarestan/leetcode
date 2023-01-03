package ContainsDuplicate;

import java.util.HashSet;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int x : nums) {
      if (set.contains(x)) {
        return true;
      }

      set.add(x);
    }
    
    return false;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    boolean res = sol.containsDuplicate(new int[]{1,2,3,1});
    System.out.println(res);
  }
  
}
