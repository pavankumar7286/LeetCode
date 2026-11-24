class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.reverse();
        if(sb.length()==0){
            return true;
        }
        String s1 = sb.toString().toLowerCase();
        String s2 = sb1.toString().toLowerCase();
        
        return s1.equals(s2);
    }
}