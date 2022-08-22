package day30_practice_wrapper;

import my_utils.ArrayUtil;

public class UsingArrays_Util_class {
    public static void main(String[] args) {
        int num = ArrayUtil.minNumber(new int[]{4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5});
        System.out.println(num);
        System.out.println(ArrayUtil.minNumber(new int[]{5,3,4,5,2,5,8}));
        System.out.println(ArrayUtil.maxNumber(new int[]{5,3,4,5,2,5,8}));

        int[] a = {45, 2, 6, 23, 83, 12};
        System.out.println(ArrayUtil.maxNumber(a));

     int [] b = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.contains(b, 13));
        System.out.println(ArrayUtil.contains(b, 5));

        System.out.println("index of");

        int[]c = {4,2,5,1,6};
        System.out.println("index of 5: " + ArrayUtil.indexOf(c, 5));
        System.out.println("index of 7: " + ArrayUtil.indexOf(c,7));
    }
}
