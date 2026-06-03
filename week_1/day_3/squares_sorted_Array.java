class Solution {
    public int[] sortedSquares(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}