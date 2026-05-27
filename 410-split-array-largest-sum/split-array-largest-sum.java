class Solution {
    public static int calPart(int[] nums, int maxSum){
        int part=1;
        int subArraySum=0;
        for(int a:nums){
            if(subArraySum+a<=maxSum){
                subArraySum+=a;
            }else{
                part++;
                subArraySum=a;
            }
            
        }
        return part;
    }
    public int splitArray(int[] nums, int k) {
        int left=Arrays.stream(nums).max().getAsInt();
        int right=Arrays.stream(nums).sum();
        while(left<=right){
            int m=left+(right-left)/2;
            int part=calPart(nums,m);
            if(part>k){
                left=m+1;
            }else{
                   right=m-1;
            }
        }
        return left;
    }
}