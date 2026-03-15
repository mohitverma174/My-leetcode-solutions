import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        
        int n=nums.length;
        
        if(n==0)return 0;
        int max=1;
        int curr=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                curr++;
            }else if(nums[i]==nums[i-1]){
                continue;
            }else{
                max=Math.max(max,curr);
                curr=1;
            }
        }
        return Math.max(max,curr);

    }
}