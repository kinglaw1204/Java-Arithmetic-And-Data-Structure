package luozhou;

/**
 * @description: 287.给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，
 * 找出这个重复的数。
 *
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 * @author: luozhou
 * @create: 2019-04-20 21:48
 **/
public class DuplicateNumber {

    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        while(true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast) {
                fast = 0;
                while (nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {2,5,9,6,9,3,8,9,7,1};
        DuplicateNumber number = new DuplicateNumber();
        int res=number.findDuplicate(a);
        System.out.println(res);
    }

}
