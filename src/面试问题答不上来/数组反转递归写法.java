package 面试问题答不上来;

import java.util.Arrays;

/**
 * Created by qiucy on 2021/5/25.
 */
public class 数组反转递归写法 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rev(arr,arr.length);
        Arrays.asList(arr).stream().forEach(System.out::print);

    }

    private static void  rev(int [] arr,int index){
        if (index == arr.length/2) {
            return;
        }
        int temp = 0;
        temp = arr[index-1];
        arr[index-1] = arr[arr.length-index];
        arr[arr.length-index] = temp;
        rev(arr,--index);
    }

}
