package luozhou;

/**
 * @author luozhou
 * @Description: 977 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序
 * @date 2019/3/18 10:40
 */
public class SquaresOfSortArray {
    public static int[] sortedSquares(int[] A) {
//        for(int i = 0; i < A.length; i++){
//            A[i]=A[i]*A[i];
//        }
//       Arrays.sort(A);
//        return A;

        int rightIndex = 0;
        while (rightIndex < A.length && A[rightIndex] < 0) {
            rightIndex++;
        }
        int leftIndex = rightIndex - 1;
        int resultIndex = 0;
        int[] result = new int[A.length];
        while (leftIndex >= 0 && rightIndex < A.length) {
            if (A[leftIndex] * A[leftIndex] < A[rightIndex] * A[rightIndex]) {
                result[resultIndex++] = A[leftIndex] * A[leftIndex];
                leftIndex--;
            } else {
                result[resultIndex++] = A[rightIndex] * A[rightIndex];
                rightIndex++;
            }
        }
        //处理剩余左边的数据
        while (leftIndex >= 0) {
            result[resultIndex++] = A[leftIndex] * A[leftIndex];
            leftIndex--;
        }
        //处理剩余右边的数据
        while (rightIndex < A.length) {
            result[resultIndex++] = A[rightIndex] * A[rightIndex];
            rightIndex++;
        }
        return result;
    }

}
