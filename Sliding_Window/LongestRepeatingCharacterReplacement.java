package Sliding_Window;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s="ABAB";
        int k=2;
        characterReplacement(s,k);

    }
    public static int characterReplacement(String s, int k) {
       int si=0;
        int ei=0;
        int ans=0;
        int count=0;
        // int flip=0;
        int[] freq = new int[26];
        while(ei<s.length()){
            int curridx=s.charAt(ei)-'A';
            freq[curridx]++;
            count=Math.max(count,freq[curridx]);
            while ((ei - si + 1) - count > k) {
                freq[s.charAt(si) - 'A']--;
                si++;
            }

            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;

    }
    
}
