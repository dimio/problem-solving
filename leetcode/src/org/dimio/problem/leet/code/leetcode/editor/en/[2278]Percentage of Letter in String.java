package org.dimio.problem.leet.code.leetcode.editor.en;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /*
    Success:
        Runtime:2 ms, faster than 12.22% of Java online submissions.
        Memory Usage:40.6 MB, less than 45.95% of Java online submissions.
    */
    public int percentageLetter(String s, char letter) {
        long cnt = s.chars().filter(it -> it == (int) letter).count();
        return (int) (100 * cnt / s.length());
    }

    /*
    Success:
        Runtime:0 ms, faster than 100.00% of Java online submissions.
        Memory Usage:40.1 MB, less than 88.72% of Java online submissions.
    */
    public int percentageLetter(String s, char letter) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            cnt += c == letter ? 1 : 0;
        }
        return 100 * cnt / s.length();
    }

}
//leetcode submit region end(Prohibit modification and deletion)
