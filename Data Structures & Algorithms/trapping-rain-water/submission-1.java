class Solution {
    public int trap(int[] nums) {

        int l = 0 , r = nums.length-1;
        int lmax = nums[l] , rmax = nums[r];
        int total = 0;
        while (l<r) {
            if(nums[l] < nums[r]){
                lmax = Math.max(lmax, nums[l]);
                int lWater = lmax-nums[l];
                if(lWater > 0) total += lWater;
                l++; 
            } else {
                rmax = Math.max(rmax, nums[r]);
                int rWater = rmax-nums[r];
                if(rWater > 0) total += rWater;
                r--;
            }
        }
        return total;
    }
}
