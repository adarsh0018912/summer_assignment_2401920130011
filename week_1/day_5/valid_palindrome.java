class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]+","");
        s=str.toLowerCase();

        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) !=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}