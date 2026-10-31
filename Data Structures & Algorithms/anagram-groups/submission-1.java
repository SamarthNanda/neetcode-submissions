class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        int[] charCount = new int[26];

        for(String str: strs){
            Arrays.fill(charCount, 0);

            for(char c: str.toCharArray()){
                charCount[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            for(int count: charCount){
                sb.append("#");
                sb.append(count);
            }
            String hashKey = sb.toString();
            if(!map.containsKey(hashKey)){
                map.put(hashKey, new ArrayList());
            }
            map.get(hashKey).add(str);
        }
        return new ArrayList(map.values());
    }
}
