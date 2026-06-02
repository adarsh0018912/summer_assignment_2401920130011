class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int  sum=0;
        for(int i=0;i<k;i++)
            sum=sum+arr[i];
        int maxsum=sum;

        int stidx=0;
        int endidx=k;
        while(endidx<arr.length){
            sum =sum-arr[stidx]+arr[endidx];
            stidx++;
            endidx++;

            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}