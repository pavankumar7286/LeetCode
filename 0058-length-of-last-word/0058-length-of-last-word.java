class Solution {
    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" "); 
        String word = words[words.length-1];
        int length = word.length();
        return length;
    }
}