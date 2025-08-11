//leetcode 424
package SlidingWindow;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=sc.next();
        System.out.println(maxlen(str, k));
    }
    public static int maxlen(String s, int k){
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
