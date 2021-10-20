/*
Given two strings text1 and text2, return the length of their "longest common subsequence". 
If there is no common subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters 
(can be none) deleted without changing the relative order of the remaining characters.
*/

import java.util.*;

public class Lcs {

    public static int longestCommonSubsequence(String text1, String text2) {
        char chars1[] = text1.toCharArray();
        char chars2[] = text2.toCharArray();
        int dp[][] = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++)
                dp[i + 1][j + 1] = chars1[i] == chars2[j] ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
        }
        return dp[chars1.length][chars2.length];
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String text1, text2;
        text1 = input.next();
        text2 = input.next();
        int lcs = longestCommonSubsequence(text1, text2);
        System.out.println(lcs);
        input.close();
    }
}