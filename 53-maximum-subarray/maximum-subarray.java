class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        long maxi=Long.MIN_VALUE;
        long s=0;
        for(int i=0;i<n;i++){
            
            s+=nums[i];
            if(s>maxi){
                maxi=s;
            }
            if(s<0){
                s=0;
            }
        }
        return (int)maxi;
    }
}