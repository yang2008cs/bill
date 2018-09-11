package com.bill.arithmetic;

public class DigitCount {
    /**
     * 统计数字
     * 计算数字k在0到n中的出现的次数，k可能是0~9的一个值
     *
     * 样例
     * 例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
     */
    public static int digitCounts(int k, int n) {
        int cnt = 0;
        for (int i = k; i <= n; i++) {
            cnt += singleCount(i, k);
        }
        return cnt;
    }
    /**
     * 分解个位，十位，百位等各个位.
     * 通过不断的取模运算，将其拆分。
     * 然后累加所有的count之和就可得到结果。
     */
    public static int singleCount(int i, int k) {
        if (i == 0 && k == 0)
            return 1;
        int cnt = 0;
        while (i > 0) {
            if (i % 10 == k) {
                cnt++;
            }
            i = i / 10;
        }
        return cnt;
    }
    public static void main(String [] agr){
        System.out.println(DigitCount.digitCounts(1,9981));
    }

}
