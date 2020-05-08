package LeetCode.Array3;

public class Num11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        System.out.println(maxArea(height));
        System.out.println(around("babad",0,0));

    }

    public static int around(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i != j) {
            if (height[i] < height[j]) {
                max = Math.max(max, (j - i) * height[i]);
                i++;
            } else if (height[i] > height[j]) {
                max = Math.max(max, (j - i) * height[j]);
                j--;
            } else {
                max = Math.max(max, (j - i) * height[j]);
                if (height[i + 1] >= height[j - 1]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return max;
    }
}
