package com.bill.arithmetic;

public class LowercaseToUppercase {
    /**
     * 大小写转换
     * 将一个字符由小写字母转换为大写字母
     *
     * 样例
     * a -> A
     * b -> B
     */
    public char lowercaseToUppercase(char character) {
        /**
         * 利用ascii码，小写a对应的ascii码为97 大写A 对应的ascii码为65
         * 97-32=65 强制转换为char
         */
        character -= 32;
        return character;
    }
}
