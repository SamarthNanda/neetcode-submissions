class Solution {
    public int trap(int[] nums) {
        int l = 0, r = nums.length-1;
        int lmax = nums[0], rmax = nums[r];

        int res = 0;
        while (l<r) {
            if(lmax < rmax) {
                l++;
                lmax = Math.max(lmax, nums[l]);
                res += lmax - nums[l];
            } else {
                r--;
                rmax = Math.max(rmax, nums[r]);
                res += rmax-nums[r];
            }
        }
        return res;
    }
}
