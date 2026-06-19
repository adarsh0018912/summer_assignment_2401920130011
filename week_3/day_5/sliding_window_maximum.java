class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int en=k;
        int st = 0;
        int ans[] = new int[arr.length-k+1];
        for(int i = 0; i<k; i++){
            pq.add(arr[i]);
        }

        ans[st] = pq.peek();

        while(en<arr.length){
            pq.add(arr[en]);

            while(pq.size()>k && st<=en){
                pq.remove(arr[st]);
                st++;
            }
            ans[st] = pq.peek();
            en++;
        }
        return ans;
    }
}