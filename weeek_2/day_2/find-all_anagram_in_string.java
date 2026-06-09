class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int m = p.length();
        int n = s.length();

        if (m > n) return ans;

        for (int i = 0; i <= n - m; i++) {

            int[] count = new int[26];


            for (char ch : p.toCharArray()) {
                count[ch - 'a']++;
            }


            for (int j = i; j < i + m; j++) {
                count[s.charAt(j) - 'a']--;
            }

            boolean isAnagram = true;

            for (int k = 0; k < 26; k++) {
                if (count[k] != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                ans.add(i);
            }
        }

        return ans;
    }
}