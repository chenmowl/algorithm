package com.eme.algorithm;

/**
 * 猫扑素数算法
 * <p>
 * 什么是猫扑素数？查了一下才知道形，如以 2 开头, 之后跟任意多个 3 的十进制整数而且是个素数, 则它是猫扑素数. 如 2, 23, 233, 2333, 23333 都是猫扑素数, 而 233333 则不是, 它可以分解为 353 x 661.
 * <p>
 * Created by dijiaoliang on 17/6/16.
 */
public class MopPrime {

    /**
     * 判断是不是猫扑数
     * @param a
     * @return
     */
    public static boolean isMopNumber(int a) {
        if (a < 10) {
            return a == 2;
        } else {
            return (a % 10 == 3) && (isMopNumber(a / 10));
        }
    }

    public static boolean isPrime(int b){
        for(int i = 2; i <= Math.sqrt(b); i++) {//程序默认2是素数，当j=2时，循环不执行
            if(b % i == 0) {
                return false;
            }
        }
        return true;
    }
}
