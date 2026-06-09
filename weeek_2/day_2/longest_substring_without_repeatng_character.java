class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;

        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;


        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxlen=Math.max(maxlen,j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }

        }
        return maxlen;
    }
}