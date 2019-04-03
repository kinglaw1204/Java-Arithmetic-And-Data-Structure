package luozhou;

/**
 * @author luozhou
 * @Description:
 * @date 2019/4/3 15:12
 */
public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int[] res = new int[S.length() + 1];
        char[] strs = S.toCharArray();
        int incr = 0;
        int dec = S.length();
        for (int i = 0; i <strs.length; i++) {
           res[i] = strs[i] == 'D'?dec--:incr++;
        }
        res[strs.length] = incr;
        return res;
    }

    public static void main(String[] args) {
        DIStringMatch diStringMatch = new DIStringMatch();
        int[] arrary = diStringMatch.diStringMatch("IDID");
        System.out.println(arrary);
    }
}
