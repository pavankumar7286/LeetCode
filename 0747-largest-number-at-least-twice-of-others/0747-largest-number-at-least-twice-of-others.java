class Solution {
    public int dominantIndex(int[] nums) {

        int max = -1 ;
        int smax = -1;
        int maxIdx = 0;
        int n = nums.length ;
        for(int i =0 ; i < n ; i++){
            if(max < nums[i]){
                smax = max ;
                max = nums[i];
                maxIdx = i;
            }else if(smax < nums[i]){
                smax = nums[i];
            }
        }

        if(smax*2 <= max ){
            return maxIdx;
        }else{
            return -1;
        }   
    }
}