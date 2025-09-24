package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }

        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        solve(digits, "", 0, ans, mapping);
        return ans;
    }

    private static void solve(String digits, String output, int index, List<String> ans, String[] mapping) {
        if (index == digits.length()) {
            ans.add(output);
            return;
        }

        int number = digits.charAt(index) - '0';
        String value = mapping[number];

        for (int i = 0; i < value.length(); i++) {
            solve(digits, output + value.charAt(i), index + 1, ans, mapping);
        }
    }

    // Main function for VS Code
    public static void main(String[] args) {
        String digits = "23"; // Example input
        List<String> result = letterCombinations(digits);

        System.out.println("Letter combinations for \"" + digits + "\":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
