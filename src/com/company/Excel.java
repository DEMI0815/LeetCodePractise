package com.company;

public class Excel {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            n--;
            stringBuilder.append((char) ('A' + n % 26));
            n /= 26;
        }
        return stringBuilder.reverse().toString();
    }

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int a = 0;
        int mul = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            a = a + (chars[i] - 'A' + 1) * mul;
            mul *= 26;
        }
        return a;
    }

    public int titleToNumber1(String s) {
        char[] chars = s.toCharArray();
        int a = 0;
        for (char c: chars) {
            a = a * 26 * (c - 'A' + 1);
        }
        return a;
    }
}
