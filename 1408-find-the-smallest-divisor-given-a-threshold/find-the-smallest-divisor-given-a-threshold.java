import java.util.*;
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int s=1;
        int e=Arrays.stream(nums).max().getAsInt();
        while(s<=e){
            int m=s+(e-s)/2;
            if(sumByD(nums,m)<=threshold){
            
                e=m-1;
            }else{
                s=m+1;
            }
            
        }
        return s;

    }
    private  static int sumByD(int[] arr, int div){
        int sum=0;
        int n=arr.length;
        for (int num : arr) {
            sum+= Math.ceil((double) num / div);
        }
        return sum;
    }
}