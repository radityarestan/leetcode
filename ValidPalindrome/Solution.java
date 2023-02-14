package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length()-1;

        while (p1 < p2) {
            char c1 = s.charAt(p1);
            if (!Character.isLetterOrDigit(c1)) {
                p1++;
                continue;
            }

            char c2 = s.charAt(p2);
            if (!Character.isLetterOrDigit(c2)) {
                p2--;
                continue;
            }

            if (c1 != c2) {
                return false;
            }

            p1++;
            p2--;
        }

        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
//        boolean result = sol.isPalindrome("A man, a plan, a canal: Panama");
//        boolean result = sol.isPalindrome("race a car");
        boolean result = sol.isPalindrome(" ");
        System.out.println(result);
    }
}
