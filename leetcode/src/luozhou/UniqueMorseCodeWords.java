package luozhou;

import java.util.HashSet;
import java.util.Set;

/**
 * @author luozhou
 * @Description: 804
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 *
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 *
 * 返回我们可以获得所有词不同单词翻译的数量。
 * @date 2019/4/2 15:26
 */
public class UniqueMorseCodeWords {

    public  int uniqueMorseRepresentations(String[] words) {
        String[] morses = {".-", "-...", "-.-.", "-..",
                ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer();
            char[]  wordchars = words[i].toCharArray();
            for (int j = 0; j < wordchars.length; j++) {
                sb.append(morses[wordchars[j]-'a']);
            }
            strings.add(sb.toString());
            System.out.println(sb.toString());
        }
        return strings.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
       int a= uniqueMorseCodeWords.uniqueMorseRepresentations(words);
        System.out.println(a);
    }
}
