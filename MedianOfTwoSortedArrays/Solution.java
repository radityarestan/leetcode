package MedianOfTwoSortedArrays;

public class Solution {
  public double binarySearch(int[] sa, int[] la, int lPSA, int rPSA) {
    int midPSA = (lPSA + rPSA)/2;
    int midPLA = (sa.length + la.length + 1)/2 - midPSA;

    int rightMostOfLeftSA = midPSA == 0 ? Integer.MIN_VALUE : sa[midPSA-1];
    int rightMostOfLeftLA = midPLA == 0 ? Integer.MIN_VALUE : la[midPLA-1];
    int leftMostOfRightSA = midPSA == sa.length ? Integer.MAX_VALUE : sa[midPSA];
    int leftMostOfRightLA = midPLA == la.length ? Integer.MAX_VALUE : la[midPLA];    

    if (rightMostOfLeftSA > leftMostOfRightLA) {
      return binarySearch(sa, la, lPSA, midPSA);
    } else if (rightMostOfLeftLA > leftMostOfRightSA) {
      return binarySearch(sa, la, midPSA+1, rPSA);
    }

    int lengthOfMergedArr = sa.length + la.length;
    if (lengthOfMergedArr % 2 == 0) {
      return (Math.max(rightMostOfLeftSA, rightMostOfLeftLA) + Math.min(leftMostOfRightSA, leftMostOfRightLA)) / 2.0;
    }

    return Math.max(rightMostOfLeftSA, rightMostOfLeftLA);
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] smallerArray = nums1;
    int[] largerArray = nums2;

    if (nums1.length > nums2.length) {
      smallerArray = nums2;
      largerArray = nums1;
    }

    return binarySearch(smallerArray, largerArray, 0, smallerArray.length);
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    double res = sol.findMedianSortedArrays(new int[]{1, 3, 8, 9, 15}, new int[]{7, 11, 18, 19, 21, 25});
    // double res = sol.findMedianSortedArrays(new int[]{23, 26, 31, 35}, new int[]{3, 5, 7, 9, 11, 16});
    // double res = sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
    // double res = sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    System.out.println(res);
  }
}
