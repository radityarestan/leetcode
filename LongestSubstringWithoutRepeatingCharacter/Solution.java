package LongestSubstringWithoutRepeatingCharacter;

import java.util.HashMap;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int pointer1 = 0;
    int pointer2 = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    while (pointer1 != s.length()) {
      char chr = s.charAt(pointer1);

      if (!map.containsKey(chr)) {
        map.put(chr, pointer1);
        pointer1++;
        result = Math.max(result, pointer1-pointer2);
      } else {
        int idx = map.get(chr);
        while (pointer2 <= idx) {
          map.remove(s.charAt(pointer2));
          pointer2++;
        }
      }
    }
    return result;      
  }

  public static void main(String[] args)  {
    Solution sol = new Solution();
    // int res = sol.lengthOfLongestSubstring("null");
    // int res = sol.lengthOfLongestSubstring("abcabcbb");
    // int res = sol.lengthOfLongestSubstring("bbbbbb");
    // int res = sol.lengthOfLongestSubstring("pwwkew");
    // int res = sol.lengthOfLongestSubstring("dvdf");
    // int res = sol.lengthOfLongestSubstring("roadiaozkm");
    int res = sol.lengthOfLongestSubstring("roadiao");
    System.out.println(res);
  }
  
}
