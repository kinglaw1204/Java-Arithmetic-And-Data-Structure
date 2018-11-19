package luozhou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luozhou
 * @Description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * @date 2018/11/19 14:26
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //构造一个HashMap,用来存储每个字符串对应的长度。
        Map<Object,Integer> strMap=new HashMap<>();
        int a=0;
        for(int i=0,j=0;i<s.length();i++){
            //判断当前字符串是否已经存在map中了，如果存在就判断长度，取最大值
            if(strMap.containsKey(s.charAt(i))){
                j=Math.max(strMap.get(s.charAt(i)),j);
            }
            //取多个子串中历史最大值。
            a=Math.max(a,i-j+1);
            //把字符串和对应的长度放进map
            strMap.put(s.charAt(i),i+1);
        }
        return a;
    }
}
