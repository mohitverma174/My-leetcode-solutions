class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(arr[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return s;
    }
}