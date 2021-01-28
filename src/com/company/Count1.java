package com.company;

public class Count1 {
    /**
     * 位1的个数
     *
     * 示例 1：
     * 输入：00000000000000000000000000001011
     * 输出：3
     * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
     *
     * @param n 无符号整数（以二进制串的形式）
     * @return 无符号整数（以二进制串的形式）
     */
    public int hammingWeight(int n) {
        int sum = 0;
        while(n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;
    }

    public int hammingWeight1(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
