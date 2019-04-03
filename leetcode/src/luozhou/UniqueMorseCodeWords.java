package luozhou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author luozhou
 * @Description:
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
