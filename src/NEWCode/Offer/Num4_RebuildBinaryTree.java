package NEWCode.Offer;

import java.util.Scanner;

public class Num4_RebuildBinaryTree {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        TreeNode node = build(str1, str2);
        After(node);
    }

    public static TreeNode build(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return null;
        }
        TreeNode node = new TreeNode(str1.charAt(0));
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str1.charAt(0)) {
                node.left = build(str1.substring(1, i + 1), str2.substring(0, i));
                node.right = build(str1.substring(i + 1, str1.length()), str2.substring(i + 1, str2.length()));
            }
        }
        return node;
    }

    public static void After(TreeNode node) {
        if (node == null) {
            return;
        } else {
            After(node.left);
            After(node.right);
            System.out.print(node.val);
        }
    }
}

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;

    TreeNode(char x) {
        val = x;
    }
}

