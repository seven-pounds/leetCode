package LeetCode.Array3;

public class Num27 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 2, 2, 3, 4};
//        System.out.println(removeElement(nums, 3));
        swap(nums,1,2);
    }

    public static int removeElement(int[] nums, int val) {
        int res=0;
        for(int i=0;i<nums.length;){
            if(nums[res]==val){
                if(nums[i]==val){
                    i++;
                }else{
                    swap(nums,res,i);
                    res++;
                    i++;
                }
            }else{
                res++;
                i++;
            }
        }
        return res+1;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
//    public static int removeElement(int[] nums, int val) {
//        int i = 0;
//        int j = nums.length - 1;
//        if (nums.length == 0) return 0;
//        while (i < j) {
//            if (nums[i] != val) {
//                i++;
//                continue;
//            }
//            if (nums[j] == val) {
//                j--;
//                continue;
//            }
//            nums[i] = nums[j];
//            i++;
//            j--;
//        }
//        if (nums[i] == val) {
//            return j;
//        } else {
//            return j + 1;
//        }
//    }
}

