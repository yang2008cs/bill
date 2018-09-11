package com.bill.arithmetic;

public class TrailingZero {
    /**
     * 尾部的零
     * 设计一个算法，计算出n阶乘中尾部零的个数
     *
     * 样例
     * 11! = 39916800，因此应该返回 2
     */
    public static long trailingZeros(long n) {
        /**
         * 思考一个数尾部的零是怎么得来的，乘以10对吧，所以n的阶乘尾部有多少零就可以看成它有多少个10这个因子，而10又可分解为两个质因数相乘 2*5 。将 n! 分解为质因数相乘的形式，大概是这样：
         *     n!=1*2*3*(2*2)*5*(2*3)*7*(2*2*2)*(3*3)*(2*5)...
         *   显然，2的个数会比5的个数多，所以有多少个5就会有多少个10。故而问题就转化为寻找 n!的结果有多少个5这个因子。
         *   那么这个怎么找呢？我们看一下上边的等式，现在已经乘到10了，出现了2个5，想象一下继续乘下去的情况，到15时会再出现一个，到20时又会再出现一个，到25时则会出现2个，继续看下去，就会发现一个规律：
         *   (1) 每逢遇到5的倍数，就会出现一个；
         *   (2) 每逢遇到5的幂次方的倍数，就会出现5的幂次方的指数个，为了便于计算，我们把遇到5的幂次方的倍数时也算到5的倍数里，这时遇到5的幂次方的倍数就会出现(5的幂次方的指数-(5的幂次方的指数-1))个，也就是1个。
         *   这样用文字来说会有点绕，我们不妨用代数式说明一下：
         *
         */
        long sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
            System.out.println("n:"+n);
            System.out.println("sum:"+sum);
        }
        return sum;
    }
    //阶乘
    public static long factorial(long n){
        if(n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }


    public static void main(String [] agr){
        TrailingZero.trailingZeros(11);
    }
}
