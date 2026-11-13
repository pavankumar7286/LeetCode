class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            if(map.containsKey(n)==true){
                map.put(n,map.get(n)+1);
            }else map.put(n,1);

            if(map.get(n)==2){
                return n;
            }
        }
        return -1;
    }
}