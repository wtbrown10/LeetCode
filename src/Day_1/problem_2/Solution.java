package Day_1.problem_2;

class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;


        for(int num : nums ){
            totalSum+= num;

        }
// rightSum = (totalSum - leftSum) - nums[i]
// sum to the left == leftsum.
// sum to the right === totalSum - leftsum - nums[i]..
// check if leftsum == totalSum - leftsum - nums[i]...

        for(int i = 0; i < nums.length; leftSum += nums[i++] ){
            if(leftSum * 2 == totalSum - nums[i])
                return i;

        }
        return -1;

    }
}