package LeetCode.Tree7;

import java.util.ArrayList;

public class Num129 {
    public static int sumNumbers(TreeNode root) {
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();
        String path = "";
        find(root, list, path);
        for (String str : list) {
            sum = sum + Integer.valueOf(str);
        }
        ;
        return sum;
    }

    public static void find(TreeNode root, ArrayList<String> list, String path) {
        if (root == null) return;
        path = path + Integer.toString(root.val);
        if (root.right == null && root.left == null) list.add(path);
        find(root.left, list, path);
        find(root.right, list, path);
        path = path.substring(0, path.length() - 1);
    }
}
