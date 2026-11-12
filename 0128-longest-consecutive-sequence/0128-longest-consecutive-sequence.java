class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        HashSet<Integer> set = new HashSet<Integer>();
        
        int max = 1;
        
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(set.contains(num - 1)) continue;

            int count = 1;
            int next = num + 1;
            while(set.contains(next)){
                count++;
                next++;
            }
            max = Math.max(max,count);
        }
        
        return max;
    }
}