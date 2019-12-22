package LeetCode.Tree7;

import org.junit.Test;

public class TreeTest {
    @Test
    public void test111() {
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        System.out.println(Num111.minDepth(node));
    }

    @Test
    public void test112() {
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        System.out.println(Num112.hasPathSum(node, 22));
    }

    @Test
    public void test113() {
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        TreeUtil.show(node);
        System.out.println(Num113.pathSum(node, 22));
    }

    @Test
    public void test129() {
        Integer[] arr = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        TreeUtil.show(node);
    }

    @Test
    public void test437() {
        Integer[] arr = {1, -2, -3, 1, 3, -2, null, -1};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        TreeUtil.show(node);
        System.out.println(Num437.pathSum(node, 1));
    }

    @Test
    public void test235() {
        Integer[] arr = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode node = TreeUtil.arrayToTree(arr, 0);
        TreeUtil.show(node);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        System.out.println(Num235.lowestCommonAncestor(node, p, q).val);
    }

}
