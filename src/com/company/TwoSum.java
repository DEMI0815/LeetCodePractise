package com.company;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (target < numbers[i] + numbers[j]) {
                j--;
            } else if (target > numbers[i] + numbers[j]) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }
}
