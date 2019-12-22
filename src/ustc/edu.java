package ustc;


import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/**
 * Create by jingzfan on 2019/4/1.
 */
public class edu {
    @Test
    public void test() {
        int[] array = {3, 5, 1, 4, 2};
        String res = PrintMinNumber(array);
        System.out.println(res);
    }

    public int MoreThanHalfNum_Solution(int[] array) {
        HashMap map = new HashMap();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int value = (int) map.get(array[i]);
                value += 1;
                map.put(array[i], value);
            } else {
                map.put(array[i], 1);
            }
        }
        System.out.println(map);
        for (Object k : map.keySet()) {
            if ((int) map.get(k) > result) result = (int) k;
        }
        return result;
    }

    public String PrintMinNumber(int[] numbers) {
        int len = numbers.length;
        StringBuilder result = new StringBuilder();
        String[] str = new String[len];
        for (int i = 0; i < len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        for (int i = 0; i < len - 1; i++) {
            int a = Integer.valueOf(str[i] + str[i + 1]);
            int b = Integer.valueOf(str[i + 1] + str[i]);
            if (a > b) swap(str, i, i + 1);

        }
        for (int i = 0; i < len; i++) {
            result.append(str[i]);
        }
        return result.toString();
    }

    public void swap(Object[] str, int i, int j) {
        Object temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    //冒泡排序
    @Test
    public void bublleSort() {
        int[] arr = {6, 3, 8, 2, 9, 1};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // 快排实现
    @Test
    public void testQuickSort() {
        int[] arr = {6, 3, 8, 2, 9, 1};
        QuickSort(arr, 0, 5);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //
    public void QuickSort(int[] arr, int start, int end) {
        if (arr.length == 0) return;
        if (start >= end) return;
        int p = partition(arr, start, end);
        if (p == -1) return;
        QuickSort(arr, 0, p - 1);
        QuickSort(arr, p + 1, end);
    }

    public int partition(int[] arr, int start, int end) {
        int result = 0;
        int key = arr[start];
        if (start >= end) return -1;
        while (start < end) {
            while (arr[end] >= key && start < end) end--;
            arr[start] = arr[end];
            while (arr[start] <= key && start < end) start++;
            arr[end] = arr[start];
        }
        arr[start] = key;
        result = start;
        return result;
    }

    @Test
    public void testROL() {
        String str = "abcdefgh";
        System.out.println(LeftRotateString(str, 12));

    }

    public String LeftRotateString(String str, int n) {
        String result = null;
        String s1 = null;
        String s2 = null;
        if (n <= 0) return str;
        int length = str.toCharArray().length;
        System.out.println(length);
        if (length == 0) return result;
        while (n > length) n = n - length;
        System.out.println(length);
        s1 = str.substring(0, n);
        s2 = str.substring(n, length);
        return s2 + s1;
    }

    @Test
    public void selectSort() {
        int[] nums = {6, 3, 8, 2, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            int k = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[k]) k = j;
            }
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void HeapAdjust(int[] array, int parent, int length) {
        int temp = array[parent];// temp保存当前父节点
        int child = 2 * parent + 1; // 先获得左孩子
        while (child < length) {
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= array[child])
                break;
            // 把孩子结点的值赋给父结点
            array[parent] = array[child];
            //选取孩子结点的左孩子结点,继续向下筛选
            parent = child;
            child = 2 * child + 1;
        }
        array[parent] = temp;
    }

    public void heapSort(int[] list) {
        // 循环建立初始堆
        for (int i = list.length / 2; i >= 0; i--) {
            HeapAdjust(list, i, list.length - 1);
        }
        for (int num : list) {
            System.out.print(num + " ");
        }

        // 进行n-1次循环，完成排序
        for (int i = list.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            int temp = list[i];
            list[i] = list[0];
            list[0] = temp;
            // 筛选 R[0] 结点，得到i-1个结点的堆-
            HeapAdjust(list, 0, i);
            System.out.format("第 %d 趟: \t", list.length - i);
        }
    }

    //滑动窗口的最大值
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0) return res;
        int begin;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            begin = i - size + 1;
            if (q.isEmpty())
                q.add(i);
            else if (begin > q.peekFirst())
                q.pollFirst();
            while ((!q.isEmpty()) && num[q.peekLast()] <= num[i])
                q.pollLast();
            q.add(i);
            if (begin >= 0)
                res.add(num[q.peekFirst()]);
        }
        return res;
    }

    public ArrayList<Integer> maxInWindows1(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList();
        if (num.length == 0 || size == 0) return result;
        for (int i = 0; i < num.length - size + 1; i++) {
            result.add(findMaxValue(num, i, i + size));
        }
        return result;
    }

    public Integer findMaxValue(int[] num, int start, int end) {
        Integer max = Integer.MIN_VALUE;
        for (int j = start; j < end; j++) {
            if (num[j] > max) max = num[j];
        }
        return max;
    }


    //小顶堆
    private PriorityQueue minHeap = new PriorityQueue();    //大顶堆
    private PriorityQueue maxHeap = new PriorityQueue(15, new Comparator() {
        @Override
        //PriorityQueue默认是小顶堆，实现大顶堆，需要反转默认排序器
        public int compare(Object o1, Object o2) {
            return (Integer) o2 - (Integer) o1;
        }
    });
    //记录偶数个还是奇数个
    int count = 0;

    //每次插入小顶堆的是当前大顶堆中最大的数
    //每次插入大顶堆的是当前小顶堆中最小的数
    //这样保证小顶堆中的数永远大于等于大顶堆中的数
    //中位数就可以方便地从两者的根结点中获取了
    public void Insert(Integer num) {
        //个数为偶数的话，则先插入到大顶堆，然后将大顶堆中最大的数插入小顶堆中
        if (count % 2 == 0) {  //5,2,3,4,1,6,7,0,8
            maxHeap.offer(num);
            int max = (int) maxHeap.poll();
            System.out.println("++++++++++++++max: " + max);
            minHeap.offer(max);
        } else {
            //个数为奇数的话，则先插入到小顶堆，然后将小顶堆中最小的数插入大顶堆中
            minHeap.offer(num);
            int min = (int) minHeap.poll();
            System.out.println("++++++++++++++min: " + min);
            maxHeap.offer(min);
        }
        count++;
    }

    public Double GetMedian() {
        //当前为偶数个，则取小顶堆和大顶堆的堆顶元素求平均
        if (count % 2 == 0) {
            return new Double((int) minHeap.peek() + (int) maxHeap.peek()) / 2;
        } else {
            //当前为奇数个，则直接从小顶堆中取元素即可
            return new Double((int) minHeap.peek());
        }
    }

    @Test
    public void testHeap() {
        int[] num = {5, 2, 3, 4, 1, 6, 7, 0, 8};
        for (int n : num) {
            Insert(n);
            System.out.println("--------------" + GetMedian());
        }
    }

    // 判断第二个数组是否是第一个数组的出栈序列
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        boolean result = false;
        Stack s = new Stack();
        int count = 0;
        for (int i = 0; i < pushA.length; i++) {
            s.push(pushA[i]);
            while (!s.isEmpty() && (int) s.peek() == popA[count]) {
                s.pop();
                count++;
            }
        }
        if (count == pushA.length) result = true;
        return result;
    }

    // 字符串全排列
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList();
        if (str.length() == 0) return result;
        run(str.toCharArray(), result, 0);
        Collections.sort(result);
        return result;
    }

    public void run(char[] ch, ArrayList<String> list, int i) {
        if (i == ch.length) {
            if (!list.contains(new String(ch))) {
                list.add(new String(ch));
                return;
            }
        } else {
            for (int j = i; j < ch.length; j++) {
                swap(ch, i, j);
                run(ch, list, i + 1);
                swap(ch, i, j);
            }
        }

    }

    public void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;

    }

    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                set.remove(array[i]);
            } else {
                set.add(array[i]);
            }
        }
        List list = new ArrayList(set);
        num1[0] = (int) list.get(0);
        num2[0] = (int) list.get(1);

    }

    public void FindNumsAppearOnce2(int[] array, int num1[], int num2[]) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num ^= array[i];//所有数异或，结果为不同的两个数字的异或
        }
        int count = 0;//标志位，记录num中的第一个1出现的位置
        for (; count < array.length; count++) {
            if ((num & (1 << count)) != 0) {
                break;
            }
        }
        num1[0] = 0;
        num2[0] = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & (1 << count)) == 0) {
                //标志位为0的为一组，异或后必得到一个数字（
                // 这里注意==的优先级高于&，需在前面加（））
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];//标志位为1的为一组
            }
        }
    }

    @Test
    public void testFindNumsAppearOnce2() {
        int[] arr = {2, 2, 3, 3, 4, 4, 5, 16};
        int[] n1 = new int[1];
        int[] n2 = new int[1];
        FindNumsAppearOnce2(arr, n1, n2);
        System.out.println(n1[0] + "  " + n2[0]);
    }

    @Test
    public void testCount() {
        int count = 0;
        for (; count < 100; count++) {
            System.out.println("+++" + count);
            System.out.println(1 << count);
            if ((16 & (1 << count)) != 0) {
                break;
            }
        }
        System.out.println("---" + count);
    }

    @Test
    public void NumberOf1Between1AndN_Solution() {
        int n = 130;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % 10 == 1) count++;
                temp = temp / 10;
            }
        }
        System.out.println(count);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        double res = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                temp[k] = nums1[i];
                k++;
                i++;
                System.out.println("----------");
            } else {
                temp[k] = nums2[j];
                k++;
                j++;
                System.out.println("++++++==");
            }
        }
        System.out.println("-----k:" + k);
        System.out.println("-----i:" + i);
        System.out.println("-----j:" + j);
        while (i < nums1.length) {
            temp[k] = nums1[i];
            k++;
            i++;
        }
        while (j < nums2.length) {
            temp[k] = nums2[j];
            k++;
            j++;
        }
        for (int a : temp) {
            System.out.println(a);
        }
        int len = temp.length;
        if (len % 2 == 0) {
            res = (temp[len / 2] + temp[len / 2 - 1]) / 2.0;
        } else {
            res = temp[len / 2];
        }
        System.out.println("8888" + res);
        return res;

    }

    @Test
    public void testFindMedianSortedArrays() {
        int[] num1 = {};
        int[] num2 = {2, 3, 4, 5, 6};
        findMedianSortedArrays(num1, num2);
    }

//    @Test
//    public void isReverse(){
//        String string="aab";
//        boolean res=true;
//        char[] ch=string.toCharArray();
//        int i=0;
//        int j=ch.length-1;
//        if(j%2==0) {
//            while (i != j) {
//                if (ch[i] != ch[j]) {
//                    res = false;
//                    break;
//                }
//                i++;
//                j--;
//            }
//        }else{
//            for(;i<ch.length/2;i++){
//                if (ch[i] != ch[j]) {
//                    res = false;
//                    break;
//                }
//                j--;
//            }
//
//        }
//        System.out.println(res);
//
//    }


    @Test
    public void testlongestPalindrome() {

        String s = "abac";
        s = longS(s, s, 0);
        System.out.println(s);
    }

    public String longestPalindrome(String s) {
        System.out.println("*****isReverse:" + isReverse(s));
        if (isReverse(s)) {
            return s;
        } else {
            int len = s.length();
            longestPalindrome(removeChar(s, 0, len - 1));
            longestPalindrome(removeChar(s, 1, len));
        }
        return null;

    }

    public String longS(String s, String res, int tempLen) {

        if (isReverse(s)) {
            if (s.length() > tempLen) {
                res = s;
                tempLen = s.length();
            }
        } else {
            int len = s.length();
            longS(removeChar(s, 0, len - 1), res, tempLen);
            longS(removeChar(s, 1, len), res, tempLen);
        }
        return res;
    }

    public String removeChar(String s, int start, int end) {
        if (s.length() < 1) return null;
        String string = s.substring(start, end);
        System.out.println("*****string:" + string);
        return string;
    }

    public boolean isReverse(String s) {
        boolean res = true;
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        if (j % 2 == 0) {
            while (i != j) {
                if (ch[i] != ch[j]) {
                    res = false;
                    break;
                }
                i++;
                j--;
            }
        } else {
            for (; i < ch.length / 2; i++) {
                if (ch[i] != ch[j]) {
                    res = false;
                    break;
                }
                j--;
            }

        }
        return res;
    }

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"aaa", "aa", "aaa"};
        int flag = -1;
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            char[] temp = result.toCharArray();
            char[] a = strs[i].toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (a[j] == temp[j]) {
                    flag = j;
                    continue;
                } else {
                    flag = j;
                    break;
                }
            }
            if (flag == 0) return;
            result = result.substring(0, flag);
        }


    }


}
