class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length - 1;
        int p3 = nums.length - 1;

        while(p1 <= p2){
            int val1 = nums[p1];
            int val2 = nums[p2];

            int sqr1 = val1*val1;
            int sqr2 = val2*val2;

            if(sqr1>sqr2){
                ans[p3] = sqr1;
                p1++;
            }else{
                ans[p3] = sqr2;
                p2--;
            }
            p3--;
        }
        return ans;
        
    }
}