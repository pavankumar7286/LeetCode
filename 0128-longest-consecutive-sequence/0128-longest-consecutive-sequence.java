class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        HashSet<Integer> set = new HashSet<>();

        int max = 1;
        for(int n : nums){
            set.add(n);
        }
        for(int n : set){
            if(set.contains(n-1)) continue;

            int count = 1;
            while(set.contains(n+count)){
                count++;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}