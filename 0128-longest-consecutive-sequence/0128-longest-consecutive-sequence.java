class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],false);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key-1) == false){
                map.put(key,true);
            }
        }
        int max = 0;
        for(int key : map.keySet()){
            int count = 0;
            if(map.get(key)==true){
                while(map.containsKey(key+count)==true){
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}