package ReverseInteger;

public class Solution {
  public int reverse(int x) {
    if (x == 0 || x == Integer.MIN_VALUE) {
      return 0;
    }

    boolean isNeg = x < 0;
    if (isNeg) {
      x = x * -1;
    }

    int power = -1;
    int y =  x;
    while (y != 0) {
      y /= 10;
      power++;
    }

    long reverseValue = 0;
    while (x != 0) {
      reverseValue += (x % 10) * Math.pow(10, power);
      x/=10;
      power--;
    }

    if (reverseValue > Integer.MAX_VALUE) {
      return 0;
    }

    if (isNeg) {
      return -1 * (int) reverseValue;
    }

    return (int) reverseValue;     
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    // int res = sol.reverse(123);
    // int res = sol.reverse(-123);
    // int res = sol.reverse(120);
    int res = sol.reverse(-2147483648);
    System.out.println(res);
  }
}
