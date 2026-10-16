class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        int n = numbers.length;
        int p1 = 0 ;
        int p2 = numbers.length - 1 ;
        for(int i = 0 ; i<n ;i++){
            int sum = numbers[p1] + numbers[p2];

            if(sum == target){
                ans[0] = p1+1;
                ans[1] = p2+1;
            }else if(sum > target){
                p2--;
            }else{
                p1++;
            }

        }
        return ans;   
    }
}