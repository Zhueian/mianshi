package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by qiucy on 2021/5/26.
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

 示例:

 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 输出: [3,3,5,5,6,7]
 解释:

 滑动窗口的位置                最大值
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
  

 提示：

 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 */
public class 滑动窗口最大值 {

    public static void main(String[] args) {
        int[] arr = {1,3,1,2,0,5};
//        int[] arr = {1,3,-1,-3,5,3,6,7};
//        int[] arr = {1,-1};
        int[] ints = maxSlidingWindow(arr, 3);
//        int[] ints = baoli(arr, 3);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        // 入参数组大小为null 或者 长度小于2，入参直接返出去。
        if (null == nums || nums.length < 2) {
            return nums;
        }
        int length = nums.length;
        int[] res = new int[length-k+1];
        // 初始化构造单调下标队列
        Deque<Integer> window = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (i == 0){
                window.offer(i);
            }else {
                int now = nums[i];
                // 窗口队列不为空 && 队列最后一个下标对应的值小于now
                while (!window.isEmpty() && nums[window.getLast()]<now){
                    window.removeLast();
                }
                window.offer(i);
            }
        }
        res[0] = nums[window.getFirst()];
        // 后续滑动
        for(int i = k,j=1;i<length;i++){
            int now = nums[i];
            // window第一个元素超过
            Integer win_1 = window.getFirst();
            if (i-win_1 >= k){
                window.removeFirst();
            }
            while (!window.isEmpty() && nums[window.getLast()]<now){
                window.removeLast();
            }
            window.offer(i);
            res[j++] = nums[window.getFirst()];
        }
        return res;
    }

    private static int[] maxSlidingWindow2(int[] nums, int k) {
        if (null == nums || nums.length == 0 || nums.length<k){
            return new int[0];
        }
        // 单调递减数组下标队列
        Deque<Integer> window = new LinkedList<>();
        // 先得到初始队列
        int[] res = new int[nums.length-k+1];
        for (int i = 0 ; i < k ; i++){
            if (i>0){
                // 获取队列头元素

            }else {
                window.offer(i);
            }
        }
        res[0] = nums[window.getFirst()];
        // 后续遍历
        for (int i = k,j=1;i<nums.length;i++,j++){
            int now = nums[i];
            // 最老的可能越界的出队
            if (i-window.getFirst()>=k){
                window.pollFirst();
            }
            if (!window.isEmpty()){
                int w1 = nums[window.getFirst()];
                if (w1 >= nums[i]){
                    window.offer(i);
                }else{
                    // 清楚前朝废物老臣
                    window.clear();
                    window.offer(i);
                }
            }else {
                window.offer(i);
            }

            res[j] = nums[window.getFirst()];
        }
        return res;
    }

    /**
     * 无脑暴力法,leetcode超时
     * @param arr
     * @param k
     * @return
     */
    private static int[] baoli(int[] arr, int k) {
        if (null == arr || arr.length == 0 || arr.length<k){
            return new int[0];
        }
        int[] res = new int[arr.length-k+1];
        for (int left = 0,right = k-1; right <= arr.length-1; left++,right++) {
            int max = getMax(left,right,arr);
            res[left] = max;
        }
        return res;


    }

    private static int getMax(int left, int right, int[] arr) {
        int max = arr[left];
        for (;left <= right ; left++){
            if (max<arr[left]){
                max = arr[left];
            }
        }
        return max;
    }

    /**
     * 最佳
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow2_best(int[] nums, int k) {
        if(nums==null||nums.length<2){
            return nums;
        }
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数按从大到小排序
        LinkedList<Integer> list = new LinkedList();
        // 结果数组
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            // 保证从大到小 如果前面数小 弹出
            while(!list.isEmpty()&&nums[list.peekLast()]<=nums[i]){
                list.pollLast();
            }
            // 添加当前值对应的数组下标
            list.addLast(i);
            // 初始化窗口 等到窗口长度为k时 下次移动在删除过期数值
            if(list.peek()<=i-k){
                list.poll();
            }
            // 窗口长度为k时 再保存当前窗口中最大值
            if(i-k+1>=0){
                result[i-k+1] = nums[list.peek()];
            }
        }
        return result;
    }

}
