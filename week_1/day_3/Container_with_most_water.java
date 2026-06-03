class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int area=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(i<=j){
            min=Math.min(arr[i],arr[j]);
            area=min*(j-i);
            max=Math.max(max,area);
            if(arr[i]<arr[j]){
                i++;
            }
            else if(arr[i]>arr[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return max;
    }
}