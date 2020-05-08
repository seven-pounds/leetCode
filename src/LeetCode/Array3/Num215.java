package LeetCode.Array3;

public class Num215 {
    public static void main(String[] args) {
        int[] nums = {1};
//        partition1(nums,1,nums.length-1);
        System.out.println(findKthLargest(nums, 1));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }

    public static int findKthLargest(int[] nums, int k) {
        int res = find(nums, k, 0, nums.length - 1);
//        return nums[nums.length - 1 - index];
        return  res;
    }
    public static int find(int[] nums, int k,int left,int right){
        if (left == right) return nums[left];
        int par=partion(nums,left,right);
        if(par==k-1){
            return nums[par];
        }else if(par>k-1){
            return find(nums,k,left,par-1);
        }else{
           return find(nums,k,par+1,right);
        }

    }
//    public static int find(int[] nums, int k, int start, int end) {
//        if (start == end) return start;
//        int temp = partition1(nums, start, end);
//        if (temp == k) return temp;
//        if (temp > k) {
//            return find(nums, k, temp + 1, end);
//        } else {
//            return find(nums, k, 0, temp - 1);
//        }
//    }

//    public static int partition(int[] arr, int start, int end) {
//        int result = -1;
//        int key = arr[start];
//        if (start >= end) result = -1;
//        while (start < end) {
//            while (arr[end] > key && start < end) end--;
//            arr[start] = arr[end];
//            while (arr[start] <= key && start < end) start++;
//            arr[end] = arr[start];
//        }
//        arr[start] = key;
//        result = start;
//        return result;
//
//    }

    public static int partion(int[] nums, int left,int right) {
        int res=0;
        int temp=nums[left];
        while(left<right){
            while(nums[right]<=temp && left<right) right--;
            nums[left]=nums[right];
            while(nums[left]>temp && left<right) left++;
            nums[right]=nums[left];
        }
        nums[left]=temp;
        return left;
    }
}
