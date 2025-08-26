package Recursion3;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static void generateParenthesiss(int n, String ans, int l, int r, List<String> result) {
        if (l == n && r == n) {
            result.add(ans);
            return;
        }
        if (l < n) {
            generateParenthesiss(n, ans + "(", l + 1, r, result);
        }
        if (r < l) {
            generateParenthesiss(n, ans + ")", l, r + 1, result);
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesiss(n, "", 0, 0, result);
        return result;
    }
    public static void main(String[] args) {
        int n = 3;  
        List<String> output = generateParenthesis(n);
        System.out.println(output);
    }
}
