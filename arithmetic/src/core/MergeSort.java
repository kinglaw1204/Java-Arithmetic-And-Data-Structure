package core;

import java.util.Arrays;

/**
 * @author luozhou
 * @Description: 归并排序，时间复杂度O(N*logN),空间复杂度0(n)
 * @date 2018/11/4 11:06
 */
public class MergeSort {
    /**
     * 分治模块
     */
    private static void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (right + left) / 2;
            sort(arr, left, mid, temp);//左边归并排序，保证左序列有序
            sort(arr, mid + 1, right, temp);//右边归并排序，保证右序列有序
            merge(arr,left,mid,right,temp);//将两个有序子数组合并操作
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left; //左序列指针
        int j = mid + 1; //右序列指针
        int t = 0; //临时数组指针
        //左右序列进行比较，比较排序放入temp
        while (i <= mid && j <= right) {
            //从小到大排序
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        //可能存在右边的序列已经比较完毕，左边序列还剩元素
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        //可能存在左边的序列已经比较完毕，右边序列还剩元素
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            arr[left++] = temp[t++];
        }

    }
    public static void sort(int []arr){
        //初始化一个固定临时空间，可以节省空间
        int []temp = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }
    public static void main(String []args){
        int []arr = {8,7,6,5,9,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

