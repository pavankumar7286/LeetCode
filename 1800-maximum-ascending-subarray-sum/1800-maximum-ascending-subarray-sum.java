class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];

        int max_sum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i-1]<nums[i]){
                sum = sum + nums[i];
            }else{
                max_sum = Math.max(sum,max_sum);
                sum = nums[i];
            }
        }
        max_sum = Math.max(sum,max_sum);
        return max_sum;
    }
}