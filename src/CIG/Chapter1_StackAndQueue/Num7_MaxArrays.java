package CIG.Chapter1_StackAndQueue;

import java.util.LinkedList;

public class Num7_MaxArrays {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 4, 3, 3, 6, 7};
        int[] res = getMaxWindow(arr, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] getMaxWindow(int[] arr, int w) {
        int len = arr.length;
        int[] res = new int[len - w + 1];
        int index = 0;
        LinkedList<Integer> qmax = new LinkedList();
        for (int i = 0; i < len; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (i - w == qmax.peekFirst()) qmax.pollFirst();
            if (i >= w - 1) {
                res[index] = arr[qmax.peekFirst()];
//                System.out.println(res[index]);
                index++;
            }

        }
        return res;
    }
}
