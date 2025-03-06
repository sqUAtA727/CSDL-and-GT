package btvn_b1;

import java.util.Arrays;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int singleNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            String check = "true";
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j] && i != j){
                    check = "false";
                }
            }
            if (check.equals("true")){
                return nums[i];
            }
        }
        return 0;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i : nums){
            if (i == 1){
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return Math.max(ans, count);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
        }
        return ans;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            String check = "false";
            for (int j = 0; j < n; j++) {
                if (nums[j] == i){
                    check = "true";
                    break;
                }
            }
            if (check.equals("false")){
                return i;
            }
        }
        return 0;
    }
}