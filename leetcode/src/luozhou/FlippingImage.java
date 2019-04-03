package luozhou;

/**
 * @author luozhou
 * @Description:给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。

水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。

反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * @date 2019/3/25 15:32
 */
public class FlippingImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0;i < A.length; i++){
            int startIndex = 0;
            int endIndex =A[i].length-1;
            int tmp;
            while( startIndex <= endIndex){
                if(startIndex == endIndex){
                    A[i][startIndex]= A[i][startIndex] != 0 ? 0 : 1;
                    break;
                }
                if (A[i][startIndex] != A[i][endIndex]) {
                    tmp = A[i][startIndex];
                    A[i][startIndex] = A[i][endIndex];
                    A[i][endIndex] = tmp;
                }
                A[i][startIndex] = A[i][startIndex] == 0 ? 1 : 0;
                A[i][endIndex] = A[i][endIndex] == 0 ? 1 : 0;
                startIndex++;
                endIndex--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] a ={{1,1,0},{1,0,1},{0,0,0}};
        int[][] aa={{1}};
        int[][] b =flipAndInvertImage(a);
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                System.out.println(b[i][j]);
            }

        }
    }
}
