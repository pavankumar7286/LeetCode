class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(int i = 0; i<t.length();i++){
            char ch = t.charAt(i);
            if(s.length()!=t.length() || map.get(ch)==null){
                return false;
            }else if(map.get(ch)>1){
                map.put(ch,map.get(ch)-1);
            }else{
                map.remove(ch);
            }
        }
        if(map.size()>0){
            return false;
        }else{
            return true;
        }
    }
}