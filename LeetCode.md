### 归并排序
- 原理  
归并排序是一种概念上最简单的排序算法，与快速排序一样，归并排序也是基于分治法的。归并排序将待排序的元素序列分成两个长度相等的子序列，为每一个子序列排序，然后再将他们合并成一个子序列。合并两个子序列的过程也就是两路归并。  
- 复杂度  
归并排序是一种稳定的排序算法，归并排序的主要问题在于它需要一个与待排序数组一样大的**辅助数组空间**。由于归并排序每次划分时两个子序列的长度基本一样，所以归并排序最好、最差和平均时间复杂度都是nlog2n。  
![排序动图](./resource/mergesort.gif)
- 代码
```java
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] sortArr = { 49, 38, 65, 97, 76, 13, 27, 50};
        mergeSort(sortArr, 0, sortArr.length - 1);

        System.out.println(Arrays.toString(sortArr));
    }

    public static void mergeSort(int[] a, int left, int right) {
        int mid = left + (right - left) / 2;
        if (left < right) {
            // 左右归并
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            // 合并数列
            // 当子序列只有一个元素是结束递归
            // 执行合并操作，即left==right
            merge(a, left, mid, right);
            System.out.println("数组排序" + Arrays.toString(a));
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        //定义辅助数组
        int[] tmp = new int[right - left + 1];
        int i = left, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        //补充左右数组
        while (i <= mid) {
            tmp[k++] = a[i++];
        }
        while (j <= right) {
            tmp[k++] = a[j++];
        }
        // 复制回原来数组
        for (int l = 0; l < tmp.length; l++) {
            a[left + l] = tmp[l];
        }
    }
}
```
### 21.合并两个有序链表
- 描述:  
*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。*  
- 示例  
输入：1->2->4, 1->3->4  
输出：1->1->2->3->4->4  
- 分析  
- 代码