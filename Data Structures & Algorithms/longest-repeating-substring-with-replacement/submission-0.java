class Solution {
    public int characterReplacement(String s, int k) {
        int[] occ = new int[26];
        Arrays.fill(occ,0);

        int left = 0;
        int res = 0, maxOcc = 0;

        for (int right=0; right < s.length(); right++){
            char c = s.charAt(right);
            maxOcc = Math.max(maxOcc, ++occ[c-'A']);

            if (right-left+1-maxOcc > k){
                occ[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res, right-left+1);
        }
        return res;
    }
}
