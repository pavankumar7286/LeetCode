class Solution {
    public int maxAscendingSum(int[] nums) {
        int current_sum = nums[0];
        int maximum_sum = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            
            if(nums[i-1]<nums[i]){
                current_sum = current_sum + nums[i];
            }else{
                maximum_sum = Math.max(current_sum,maximum_sum);
                current_sum = nums[i];
            }
        }
        maximum_sum = Math.max(current_sum,maximum_sum);
        return maximum_sum;
    }
}