class Solution {
    public String reverseWords(String s) {
        String[] sarr = s.trim().split("\\s+");

        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");


        for(int i = 0;i<sarr.length;i++){
            st.push(sarr[i]);
        }
        while(st.size()>0){
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}