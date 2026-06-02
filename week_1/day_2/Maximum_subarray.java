class Solution {
    public int maxSubArray(int[] arr) {

        int j=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        while(j<arr.length){
            sum=sum+arr[j];
            j++;
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}