package com.bill.arithmetic;

public class AplusB {
   /**  A + B 问题
       * 给出两个整数 aa 和 bb , 求他们的和。
       * 样例
       * 如果 a=1 并且 b=2，返回3。
       * 挑战
       * 显然你可以直接 return a + b，但是你是否可以挑战一下不这样做？（不使用++等算数运算符）
    */
   public static int aplusb(int a, int b) {
       /** 主要利用异或运算来完成
         * 异或运算有一个别名叫做：不进位加法
         * 那么a ^ b就是a和b相加之后，该进位的地方不进位的结果
         * 然后下面考虑哪些地方要进位，自然是a和b里都是1的地方
         * a & b就是a和b里都是1的那些位置，a & b << 1 就是进位
         * 之后的结果。所以：a + b = (a ^ b) + (a & b << 1)
         * 令a' = a ^ b, b' = (a & b) << 1
         * 可以知道，这个过程是在模拟加法的运算过程，进位不可能
         * 一直持续，所以b最终会变为0。因此重复做上述操作就可以
         * 求得a + b的值。
         */
       while (b != 0) {
           int _a = a ^ b;
           int _b = (a & b) << 1;
           a = _a;
           b = _b;
       }
       return a;
   }

    public static void main(String [] agr){
        System.out.println(AplusB.aplusb(11,10));
    }
}
