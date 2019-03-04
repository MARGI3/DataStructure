package leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
class LeetCode01TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            //用目标值 - 当前遍历的item值 = 期望得到的正确值
            //检查map中是否已经存在 "期望值"
            int temp = target - nums[index];

            //HashMap内部的table是以数组的形式存储的
            //所以 containsKey 能够以 O(1) 的时间复杂度判断
            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = index;
                return result;
            }
            /** 这里将nums中值,当做map的key来存储是加快速度的关键*/
            //将数组的value作为map的key, 数组的index作为map的value
            map.put(nums[index], index);
        }
        return result;
    }
}
