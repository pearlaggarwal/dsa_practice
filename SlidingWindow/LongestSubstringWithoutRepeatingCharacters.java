//leetcode 3
package SlidingWindow;

public class LongestSubstringWithoutRepeatingCharacters {

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

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); 
        System.out.println(lengthOfLongestSubstring("bbbbb"));   
        System.out.println(lengthOfLongestSubstring("pwwkew")); 
    }
}
