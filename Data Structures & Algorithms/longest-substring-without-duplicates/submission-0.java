class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int l=0, r=0;
        int res = 0;

        Set<Character> set = new HashSet<>();

        while(r < s.length()){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++; 
            }
            set.add(c);
            res = Math.max(r-l+1, res);
            r++;
        }
        return res;
    }
}
