package org.example.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两个数之和：
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * @author <a href="mailto:912547587@qq.com">lihaiming</a>
 * @version 1.0.0
 * @since 2021/10/7 21:44
 **/
public class SumTwoNumber {

    /**
     * 使用暴力破解，算法复杂度O(n2)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 哈希表查询效率是O(1),使用hashmap存对应的val和index,这样效率时间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        int length = nums.length;
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,1,5,8,0};
        int[] result = twoSum1(nums, 13);
        if (result == null) {
            System.out.println("无满足");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }

    }
}
