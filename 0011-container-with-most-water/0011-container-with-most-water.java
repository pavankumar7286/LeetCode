class Solution {
    public int maxArea(int[] height) {
        int maxCapacity = 0 ;
        int p1 = 0 ;
        int p2 = height.length - 1;
        int cap = 0;

        for(int i =0 ; i < height.length; i++){
            int val1 = height[p1];
            int val2 = height[p2];

            if(val1<val2){
                cap = val1 * (p2-p1);
                p1++;
            }else{
                cap = val2 * (p2-p1);
                p2--;
            }
            if(cap > maxCapacity){
                maxCapacity = cap;
            }
        }
        return maxCapacity;
    }
}