package org.dimio.problem.leet.code.leetcode.editor.en;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
/*
Success:
	Runtime:2 ms, faster than 91.93% of Java online submissions.
	Memory Usage:42.7 MB, less than 23.23% of Java online submissions.
 */

    public int canBeTypedWords(String text, String brokenLetters) {
        var brL = brokenLetters.toCharArray();
        Arrays.sort(brL);
        var words = text.split(" ");
        int canTypeCnt = 0;
        for (var word : words) {
            boolean canType = true;
            for (int i = 0; i < word.length(); i++) {
                if (Arrays.binarySearch(brL, word.charAt(i)) >= 0) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                canTypeCnt++;
            }
        }
        return canTypeCnt;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
