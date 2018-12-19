package core;

/**
 * @author luozhou
 * @Description: 快排算法，时间复杂度O（NlogN）
 * @date 2018/10/30 9:47
 */
public class FastSort {


    public static  int[] quickSort(int[] arry, int head, int tail) {
        int left = head, right = tail;
        int index = arry[left];//确定头部为基准数
        //左指针小于右指针开始循环
        while (left < right) {
            //如果左指针小于右指针，并且右指针的值小于基准数,指针左移。
            while (left < right && arry[right] >= index) {
                right--;
            }
            //当右指针的数小于基准数，把右指针的数赋值到左指针上。
            arry[left] = arry[right];
            //如果左指针小于右指针，并且左指针小于基准值的话，指针右移。
            while (left < right && arry[left] <= index) {
                left++;
            }
            //当左指针的值大于基准值，把左指针的值，赋值给右指针。
            arry[right]=arry[left];
        }
        //当左右指针相等，说明第一次排序已经完成，把基准值放到结束指针位置。
        if (left == right) arry[left] = index;
        //当传入的头指针和内部声明的左指针不相等，说明排序还没完成，继续递归完成。
        if (left != head) {
            quickSort(arry, 0, left - 1);
        }
        //当传入的尾指针和内部声明的右指针不相等，说明排序还没完成，继续递归完成
        if (right != tail) {
            quickSort(arry, right + 1, arry.length - 1);
        }
        return arry;
    }
}
