package LeetCode.Array3;

public class Num88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[p] = nums1[m - 1];
                m--;
                p--;
            } else {
                nums1[p] = nums2[n - 1];
                n--;
                p--;
            }
        }
        for (int l = 0; l < nums1.length; l++) {
            System.out.println(nums1[l]);

        }
    }
}
