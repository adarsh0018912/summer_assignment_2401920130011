class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i <= s2.length() - n; i++) {

            int[] count = new int[26];


            for (char ch : s1.toCharArray()) {
                count[ch - 'a']++;
            }


            for (int j = i; j < i + n; j++) {
                count[s2.charAt(j) - 'a']--;
            }

            boolean found = true;
            for (int k = 0; k < 26; k++) {
                if (count[k] != 0) {
                    found = false;
                    break;
                }
            }

            if (found) return true;
        }

        return false;
    }
}