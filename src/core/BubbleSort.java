package core;


/**
 * @author luozhou
 * @Description:冒泡排序算法
 * @date 2018/10/29 13:41
 */
public class BubbleSort {
    /**
     * 基本冒泡排序算法*/
    public static  void sortByBubble(int[] needSort){
        int tmp;
        for (int i = 0; i <needSort.length-1 ; i++) {
            for (int j = 1; j <needSort.length ; j++) {
                if (needSort[j-1]>needSort[j]){
                    tmp=needSort[j-1];
                    needSort[j-1]=needSort[j];
                    needSort[j]=tmp;
                }
            }
        }
    }

    /**
     * 改进版冒泡排序算法
     * 改进思路：排序过程有可能已经有序了，后面可以避免无谓的循环了
     * **/
    public static  void sortByBubbleByFlag(int[] needSort){
        int tmp;
        for (int i = 0; i <needSort.length-1 ; i++) {
            boolean flag=false;
            for (int j = 1; j <needSort.length ; j++) {
                if (needSort[j-1]>needSort[j]){
                    tmp=needSort[j-1];
                    needSort[j-1]=needSort[j];
                    needSort[j]=tmp;
                    flag=true;
                }
            }
            if (!flag)break;
        }
    }
}
