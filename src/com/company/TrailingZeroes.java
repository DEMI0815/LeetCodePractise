package com.company;

public class TrailingZeroes {
    /**
     * 找5
     * 每5有个5，每5*5有5...
     *
     * @param n 几的阶乘
     * @return 尾数中0的个数
     */
    public int trailingZeroes(int n) {
        return n < 5 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
