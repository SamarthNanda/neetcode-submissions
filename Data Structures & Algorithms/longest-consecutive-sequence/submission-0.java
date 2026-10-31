class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int longSub = 1;
        for(int num: set){
            if(set.contains(num-1)){
                continue;
            }
            int currNum = num;
            int currSub = 1;
            while(set.contains(currNum+1)){
                currSub++;
                currNum++;
            }
            longSub = Math.max(currSub, longSub);
        }
        return longSub;
    }
}
