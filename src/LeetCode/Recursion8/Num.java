package LeetCode.Recursion8;

public class Num {
    static final Integer i1 = 1;
    final Integer i2 = 2;
    Integer i3 = 3;

    public static void main(String[] args)
    {

        int[] a={1,2,3};
        int [] b=a;

        final Integer i4 = 4;
        Integer i5 = 5;

        class Inner
        {
            final Integer i6 = 6;
            Integer i7 = 7;

            Inner()
            {
                System.out.print(i6 + i7);
            }
        }
    }
}
