class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 0){
            return ans;
        }
        ans[0] = firstOccurance(nums,target);
        ans[1] = lastOccurance(nums,target);
        return ans;

    }
    public int firstOccurance(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while(start <= end){
            mid = (start+end)/2;

            if(nums[mid]==target){
                ans = mid;
                end = mid -1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;   
    }
    public int lastOccurance(int[] nums, int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while(start <= end){
            mid = (start+end)/2;

            if(nums[mid]==target){
                ans = mid;
                start = mid +1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;   
    }
}