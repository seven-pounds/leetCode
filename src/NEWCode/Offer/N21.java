package NEWCode.Offer;

public class N21 {
    public static void main(String[] args) {
        int[] arr ={2,16,3,5,13,1,16,1,12,18};
        exchange(arr);
    }
    public static int[] exchange(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        if((len & 1) ==1){
            while(left<right){
                left++;
                swap(nums,left,right);
                left+=2;
                right-=2;
            }
        }else{
            while(left<right){
                right--;
                left++;
                swap(nums,left,right);
                left+=2;
                right-=2;
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int left,int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
