import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    //time limit exceeded
    public int maxSubArray_error1(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] iSum = new int[nums.length + 1];
        int ans = 0;
        int totalSum = 0;
        int min = 0;
        iSum[0] = 0;

        for(int i = 1; i <= nums.length; i++){
            iSum[i] = iSum[i - 1] + nums[i - 1];
        }
        totalSum = iSum[nums.length];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - i; j++){
                min = Math.min(iSum[i] + (totalSum - iSum[nums.length - j]), min);
            }
        }
        ans = totalSum - min;

        return ans;
    }

    public int maxSubArray(int[] nums){
        int fSumMin = 0;
        int startIndex = 0;
        int rSumMin = 0;
        int totalSum = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(fSumMin > fSumMin + nums[i]){
                startIndex = i;
                fSumMin += nums[i];
            }
            totalSum += nums[i];
        }
        totalSum += nums[nums.length - 1];
        for(int i = nums.length - 1; i > startIndex; i--){
            rSumMin = Math.min(rSumMin, rSumMin + nums[i]);
        }

        return totalSum - fSumMin - rSumMin;
    }

}
