package Sliding_Window;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int[] freq = new int[256]; 

        while (ei < s.length()) {
            char c = s.charAt(ei);
            freq[c]++;
            while (freq[c] > 1) {
                freq[s.charAt(si)]--;
                si++;
            }

            ans = Math.max(ans, ei - si + 1);
            ei++;
        }

        return ans;
    }
    
}
