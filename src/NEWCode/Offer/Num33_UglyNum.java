package NEWCode.Offer;

import java.util.ArrayList;

public class Num33_UglyNum {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(8));
    }

    public static int GetUglyNumber_Solution(int index) {
        int i = 1;
        int array[] = new int[index + 1];
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list5 = new ArrayList();
        array[0] = 1;
        while (i <= index) {
            list2.add(array[i - 1] * 2);
            list3.add(array[i - 1] * 3);
            list5.add(array[i - 1] * 5);
            int min = Math.min((Integer) list2.get(0),
                    Math.min((Integer) list3.get(0), (Integer) list5.get(0)));
            array[i] = min;
            if ((Integer) list2.get(0) == min) {
                list2.remove(0);
            }
            if ((Integer) list3.get(0) == min) {
                list3.remove(0);
            }
            if ((Integer) list5.get(0) == min) {
                list5.remove(0);
            }
            i++;
        }
        for (int j = 0; j < index; j++) {
            System.out.println(array[j]);
        }
        return array[index - 1];


    }


}
