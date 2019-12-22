package LeetCode.Array3;

public class Num167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        twoSum(numbers, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i;
                res[1] = j;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(res[0] + "  " + res[1]);
        return res;

    }
}
