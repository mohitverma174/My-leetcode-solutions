class Solution {
     private void swap(int [] nums, int s , int e){
        while(s<e){
            
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
        
    }

    public void rotate(int[] nums, int k) {
       int n = nums.length;
        if (n == 0) return;
        k=k%n;
        swap(nums,0,n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
    }
}