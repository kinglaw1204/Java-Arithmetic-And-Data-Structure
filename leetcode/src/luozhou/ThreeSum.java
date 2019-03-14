package luozhou;

import java.util.*;

/**
 * @author luozhou
 * @Description: Given an array nums of n integers, are there elements a, b, c in nums
 * such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * @date 2019/3/1 11:10
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return null;
        Arrays.sort(nums);//排序
        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {//这里遍历到倒数第二个就停止了，后续肯定不满足结果，直接结束即可
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案，当前处理数不能和前一个数相等

                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < sum) {
                        while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
                        l++;
                    } else {
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        r--;
                    }
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int [] arry={-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result=  threeSum(arry);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toArray().toString());
        }
    }


}
