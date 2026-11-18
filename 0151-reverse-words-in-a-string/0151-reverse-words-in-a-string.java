class Solution {
    public String reverseWords(String s) {
        String[] sarr = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder("");

        for(int i = sarr.length -1 ; i>=0 ;i--){
            sb.append(sarr[i]+" ");
        }
        return sb.toString().trim();
    }
}