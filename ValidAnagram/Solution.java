package ValidAnagram;

import java.util.HashMap;

public class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    
    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c)+1);
      } else {
        map.put(c, 1);
      }
    }

    for (char c : t.toCharArray()) {
      if (!map.containsKey(c) || map.get(c) == 0) {
        return false;
      }
      map.put(c, map.get(c)-1);
    }

    return true;

  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    // boolean res = sol.isAnagram("anagram", "nagaram");
    // boolean res = sol.isAnagram("rat", "car");
    boolean res = sol.isAnagram("ab", "a");
    System.out.println(res);
  }
  
}
