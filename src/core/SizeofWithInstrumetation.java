package core;

/**
 * @author luozhou
 * @Description: 类似于c的sizeOf方法，主要依托于util中的sizeof.jar
 * @date 2018/12/19 16:04
 */
public class SizeofWithInstrumetation {

    public static void main(String[] args){
        System.out.println(cn.com.ObjectShallowSize.sizeOf(new int[33]));
    }
}
