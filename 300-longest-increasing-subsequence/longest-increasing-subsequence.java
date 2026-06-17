class Solution {
    public int lengthOfLIS(int[] nums) {
        int max=1;
        int lis[]= new int[nums.length];
        Arrays.fill(lis,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    lis[i]= Math.max(lis[i],1+lis[j]);
                    max=Math.max(max,lis[i]);
                }
            }
        }
        return max;
    }
}