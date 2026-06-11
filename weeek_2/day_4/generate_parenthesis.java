class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        String s="";
        parent(n,ans,0,0,s);
        return ans;
    }
    public static void parent(int n,List<String> ans, int left,int right,String s){
        if(right==n){
            ans.add(s);
            return;
        }
        if(left<n){
            parent(n,ans,left+1,right,s+'(');
        }
        if(left>right){
            parent(n,ans,left,right+1,s+')');
        }
    }
}