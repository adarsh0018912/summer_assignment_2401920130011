class Solution {
    public String longestCommonPrefix(String[] s) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        char[] f=s[0].toCharArray();
        char[] l=s[s.length-1].toCharArray();
        for(int i=0;i<f.length;i++){
            if(f[i]==l[i]){
                sb.append(f[i]);
            }
            else{
                break;
            }
        }

        return sb.toString();
    }
}