package LeetCode.Array3;

public class Num215 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(nums, 2));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int findKthLargest(int[] nums, int k) {
        int index = find(nums, k, 0, nums.length - 1);
        return nums[nums.length - 1 - index];

    }

    public static int find(int[] nums, int k, int start, int end) {
        if (start == end) return start;
        int temp = partition(nums, start, end);
        if (temp == k) return temp;
        if (temp > k) {
            return find(nums, k, temp + 1, end);
        } else {
            return find(nums, k, 0, temp - 1);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int result = -1;
        int key = arr[start];
        if (start >= end) result = -1;
        while (start < end) {
            while (arr[end] > key && start < end) end--;
            arr[start] = arr[end];
            while (arr[start] <= key && start < end) start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        result = start;
        return result;

    }
}
