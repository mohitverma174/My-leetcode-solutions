class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        int currentSum=0;
        while(high<nums.length){
           currentSum+=nums[high];
           high++;

           while(currentSum>=target){
            int currentWindowSize=high-low;
            minLength=Math.min(minLength,currentWindowSize);
            currentSum-=nums[low];
            low++;
           }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}