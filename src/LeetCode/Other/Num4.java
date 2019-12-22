package LeetCode.Other;

public class Num4 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4};
        int[] num2 = {3, 4, 5, 6, 7, 8};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, count = 0, mid = (nums1.length + nums2.length) / 2;
        while (count <= mid && i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                i++;
                count++;
                continue;
            }
            if (nums2[j] <= nums1[i]) {
                j++;
                count++;
                continue;
            }
        }
        if (count < mid && i < nums1.length) {
            while (count <= mid && i < nums1.length) {
                i++;
                count++;
            }
            if ((nums1.length + nums2.length) % 2 == 0) {
                return (double) (nums1[i] + nums1[i - 1]) / 2;
            } else {
                return nums1[i];
            }

        }


        if (count < mid && j < nums2.length) {
            while (count < mid && j < nums2.length) {
                j++;
                count++;
            }
            if ((nums1.length + nums2.length) % 2 == 0) {
                return (double) (nums2[i] + nums2[i - 1]) / 2;
            } else {
                return nums2[i];
            }

        }

        return 0;
    }
}
