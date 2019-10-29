package leetcode.sumofthreenums;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] num = {-1, 0, 1, 2, -1, -4};
        sl.threeSum(num);
//        List<List<Integer>> ll = sl.threeSum(num);
        System.out.println(sl.threeSum(num));
//        Set<List<Integer>> setList = new HashSet<>(ll);
//        List<List<Integer>> lll = new ArrayList<>(setList);
//        System.out.println(lll);


    }
}
