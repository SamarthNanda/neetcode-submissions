class Solution {
    public int trap(int[] nums) {

        int l = 0 , r = nums.length-1;
        int lmax = nums[l] , rmax = nums[r];
        int total = 0;
        while (l<r) {
            if(lmax < rmax){
                l++; 
                lmax = Math.max(lmax, nums[l]);
                int lWater = lmax-nums[l];
                if(lWater > 0) total += lWater;
            } else {
                r--;
                rmax = Math.max(rmax, nums[r]);
                int rWater = rmax-nums[r];
                if(rWater > 0) total += rWater;
            }
        }
        return total;
    }
}
