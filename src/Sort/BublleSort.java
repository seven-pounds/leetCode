package Sort;

public class BublleSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 9, 1};
        bublleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bublleSort(int[] arr) {
        boolean falg = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    falg = true;
                }
            }
            if (falg == false) break;
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
            falg = false;
        }

    }
}
