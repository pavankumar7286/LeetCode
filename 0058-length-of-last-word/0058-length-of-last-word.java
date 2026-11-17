class Solution {
    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" ");
        int n = words.length; 
        String word = words[n-1];
        int length = word.length();
        return length;
    }
}