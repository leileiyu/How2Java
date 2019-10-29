package leetcode.sumofthreenums;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        Set<List<Integer>> setList = new HashSet<>(ls);
        List<List<Integer>> lList = new ArrayList<>(setList);
        return lList;
    }

}
