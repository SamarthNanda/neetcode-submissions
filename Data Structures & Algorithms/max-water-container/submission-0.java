class Solution {
    public int maxArea(int[] nums) {
        int left = 0 , right = nums.length-1;

        int maxTillNow = 0;
        while (left < right){
            int currMax = (right-left) * Math.min(nums[left], nums[right]);
            maxTillNow = Math.max(currMax, maxTillNow);
            if(nums[left] <= nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxTillNow;
    }
}
