import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n==0) return 0;
        int c=1;
        int max=1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]+1){
            c++;
           }else if(arr[i]==arr[i-1]){
            continue;
           }else{
             max=Math.max(max,c);
             c=1;
           }
        }
        return Math.max(max,c);
    }
}