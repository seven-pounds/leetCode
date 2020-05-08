package LeetCode.Array3;

public class Num283 {

    public static void main(String[] args) {
        int [] nums={0,0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==0){
                while(nums[j]==0&&j<nums.length) j++;
                swap(nums,i,j);
                i++;
            }else{
                i++;
            }
        }
        return;
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

//    public static void moveZeroes(int[] nums) {
//        int i = 0;
//        int j = 0;
//        while (i < nums.length && j < nums.length) {
//            if (nums[i] != 0) {
//                i++;
//                j++;
//            } else {
//                break;
//            }
//        }
//        j++;
//        while (j < nums.length) {
//            if (nums[j] == 0) {
//                j++;
//                continue;
//            }
//            nums[i] = nums[j];
//            i++;
//            j++;
//        }
//        while (i < nums.length) {
//            nums[i] = 0;
//            i++;
//        }
//    }

}
