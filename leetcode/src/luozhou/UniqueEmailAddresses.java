package luozhou;

import java.util.HashSet;
import java.util.Set;

/**
 * @author luozhou
 * @Description:
 * @date 2019/4/3 14:19
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> setString = new HashSet<>();
        for(int i = 0; i < emails.length; i++){
            StringBuffer sb = new StringBuffer();
            String[] strings = emails[i].split("@");
            String  addString = strings[0].split("\\+")[0];
            String[]  pointString = addString.split("\\.");
            for (int j = 0; j < pointString.length; j++){
                sb.append(pointString[j]);
            }
            sb.append(strings[1]);
            setString.add(sb.toString());

        }
        return setString.size();
    }

    public static void main(String[] args) {
        String[] aa = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        int a=uniqueEmailAddresses.numUniqueEmails(aa);
        System.out.println(a);
    }
}
