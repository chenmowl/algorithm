package com.eme.algorithm;

/**
 * 1到n，求1的个数
 * <p>
 * Created by dijiaoliang on 17/6/19.
 */
public class OneNumber {

    private final static String TAG="MainActivity";

    /**
     * start必须小于end,获取一个取值空间中1的个数
     *
     * @param start
     * @param end
     * @return
     */
    public static int getOneNumberFromRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i < 0) {
                count += getOneNumber(-i);
            } else {
                count += getOneNumber(i);
            }
        }
        return count;
    }

    /**
     * r为非负数,获取单个整数中的1的个数
     *
     * @param r
     * @return
     */
    private static int getOneNumber(int r) {
        int count = 0;
        if (r < 10) {
            if (r == 1)
                count++;
//            Log.e(TAG,r+"");
        } else {
            if (r % 10 == 1) {
                count++;
//                Log.e(TAG,r+"");
            }
            count += getOneNumber(r / 10);
        }
        return count;
    }

}
