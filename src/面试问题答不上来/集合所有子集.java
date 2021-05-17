package 面试问题答不上来;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiucy on 2021/5/11.
 */
public class 集合所有子集 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.forEach(System.out::println);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0;i < nums.length;i++){
            for (int j = 0; j < result.size(); j++) {
                List<Integer> subs = result.get(j);
                subs.add(i);
                result.add(subs);
            }
        }
        return result;
    }
    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}
