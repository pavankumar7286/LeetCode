class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int secondmax= -1;

        for(int i = 0 ; i<nums.length ; i++){
            if(max < nums[i]){
                secondmax = max;
                max = nums[i];
            }
            else if(secondmax < nums[i]){
                secondmax = nums[i];
            }
        }
        int ans = (max -1)*(secondmax-1);
        return ans ;
    }
}