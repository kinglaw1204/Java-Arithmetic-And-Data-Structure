package luozhou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luozhou
 * @Description:两数之和 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为gai目标值的 两个 整数。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例：
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]

 * @date 2018/11/19 10:03
 */
public class TwoSum {
    /**
     * 核心的算法就是利用一个map保存值和索引，同时利用target-遍历的数组值，看看结果是否在map中*/
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int re= target-nums[i];
            if(map.containsKey(re)&&map.get(re)!=i)
                return new int[]{i,map.get(re)};
            map.put(nums[i],i);
        }
        return null;
    }
}
