package ContainerWithMostWater;

public class Solution {
  public int maxArea(int[] height) {
    int lp = 0;
    int rp = height.length-1;
    int result = 0;

    while (lp < rp) {
      int hl = height[lp];
      int hr = height[rp];

      int h = hl <= hr ? hl:hr;
      result = Math.max(result, (rp-lp)*h);
      
      if (hl <= hr) {
        lp++;
      } else {
        rp--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
      Solution sol = new Solution();
      // int res = sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
      int res = sol.maxArea(new int[]{1,1});
      System.out.println(res);
  }
}
