class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        ans[n-1]=0;
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                count++;
                st.pop();
            }
            if(st.size()==0)ans[i]=0;
            else ans[i]=st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}