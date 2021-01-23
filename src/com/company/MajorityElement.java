package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Map.Entry<Integer, Integer> majorityElement = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorityElement == null || entry.getValue() > majorityElement.getValue()) {
                majorityElement = entry;
            }
        }
        return majorityElement.getKey();
    }

    /**
     * 摩尔投票法
     *
     * 初始值：候选为无，计数为0
     * 当数字和候选相等时，计数+1，不等-1
     * 计数为0时，更换候选人
     *
     * @param nums 数组
     * @return 众数
     */
    public int majorityElement_Boyer_Moore(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += candidate == num ? 1 : - 1;
        }
        return candidate;
    }
}
