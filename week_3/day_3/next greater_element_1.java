class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[m];
        Stack<Integer> st=new Stack<>();
        for(int i=m-1;i>=0;i--){
            while(st.size()>0 && arr2[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr2[i]);
        }
        int[] neg=new int[n];
        for(int i=0;i<arr1.length;i++){
            int index=0;
            for(int j=0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    index=j;
                    break;
                }
            }
            neg[i]=ans[index];
        }


        return neg;
    }

}