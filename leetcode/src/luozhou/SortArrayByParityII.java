package luozhou;

/**
 * @author luozhou
 * @Description: 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。

对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。

你可以返回任何满足上述条件的数组作为答案。
 * @date 2019/3/25 9:57
 */
public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        //奇数索引
        int oddIndex = 1;
        //偶数索引
        int evenIndex = 0;
        int tmp;
        while (oddIndex <= A.length && evenIndex < A.length) {
            //奇数索引上是偶数，偶数索引上是奇数。
            if ((A[evenIndex] & 1) == 1 && (A[oddIndex] & 1) == 0) {
                tmp = A[evenIndex];
                A[evenIndex] = A[oddIndex];
                A[oddIndex] = tmp;
                oddIndex = oddIndex + 2;
                evenIndex = evenIndex + 2;
                //偶数索引上是奇数，奇数索引是上奇数，奇数索引+2
            } else if ((A[evenIndex] & 1) == 1) oddIndex = oddIndex + 2;
                //奇数索引上是偶数，偶数索引上是偶数，偶数索引+2
            else if ((A[oddIndex] & 1) == 0) evenIndex = evenIndex + 2;
            else {

                oddIndex = oddIndex + 2;
                evenIndex = evenIndex + 2;
            }
        }
        return A;
    }
}
