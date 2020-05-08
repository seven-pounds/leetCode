package LeetCode.Array3;

public class Num75 {
    // 2,0,2,1,1,0
    // 1,0,2,1,1,0
    //    i
    //    1,1,1,1,1,2,2,3
    //      j
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        int zero =0;
        int two = nums.length-1;
        for(int i=0;i<=two;){
            if(nums[i]==0){
                swap(nums,zero,i);
                zero++;
                i++;
            }else if(nums[i]==2){
                swap(nums,two,i);
                two--;
            }else {
                i++;
            }

        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
