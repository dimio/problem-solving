package org.dimio.problem.leet.code.leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /*
    Success:
        Runtime:2 ms, faster than 99.92% of Java online submissions.
        Memory Usage:42.3 MB, less than 87.41% of Java online submissions.
     */
    private static final int LETTER_CASE_SHIFT = 32;

    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        char a, b;
        int mid = (s.length() - 1) >>> 1;
        for (int i = 0, j = s.length() - 1; i <= mid; i++, j--) {
            a = s.charAt(i);
            b = s.charAt(j);
            while (isNotAlphaNumeric(a) && i < j) {
                a = s.charAt(++i);
            }
            while (isNotAlphaNumeric(b) && i < j) {
                b = s.charAt(--j);
            }
            if (isComparable(a, b)) {
                if (!equalsIgnoreCase(a, b)) {
                    return false;
                }
            } else {
                return false;
            }
            mid = (i + j) / 2;
        }
        return true;
    }

    private static boolean equalsIgnoreCase(char a, char b) {
        return a == b
            || a - LETTER_CASE_SHIFT == b
            || a == b - LETTER_CASE_SHIFT;
    }

    private static boolean isComparable(char a, char b) {
        return (isLetter(a) && isLetter(b))
            || (!isLetter(a) && !isLetter(b));
    }

    private static boolean isLetter(char ch) {
        return 'a' <= ch && ch <= 'z'
            || 'A' <= ch && ch <= 'Z';
    }

    private static boolean isNotAlphaNumeric(char ch) {
        return !isLetter(ch) && ('0' > ch || ch > '9');
    }

}
//leetcode submit region end(Prohibit modification and deletion)
