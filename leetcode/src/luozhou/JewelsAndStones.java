package luozhou;

/**
 * @author luozhou
 * @Description: 771 You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * @date 2019/3/14 11:39
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        //边界条件判断
        if(null==J || null == S || J.length() == 0 || S.length() == 0) return 0;
        int res=0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j <J.length() ; j++) {
                if ( S.charAt(i)==(J.charAt(j))){
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s="aA";
        String j="aAAbbbb";
        System.out.println(numJewelsInStones(s,j));
    }
}
