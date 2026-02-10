//Kotlin Implementation for Longest Unique Substring Calculation using sliding window 
//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without duplicate characters.

//Example 1: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
//Example 2: Input: s = "bbbbb"  Output: 1 Explanation: The answer is "b", with the length of 1.
//Example 3: Input: s = "pwwkew"  Output: 3  Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//Constraints:
//0 <= s.length <= 5 * 104   ,   s consists of English letters, digits, symbols and spaces.

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.length==0) return 0
        if(s.length==1) return 1
        val map = mutableMapOf<Char,Int>()
        var r=0
        var l=0
        val n = s.length
        var max=0
        while(r<n){
            if(map[s[r]]!=null && map[s[r]]?:0>=l){
                l = (map[s[r]]?:0)+1
            }
            max = maxOf(max, r-l+1)
            map[s[r]] = r
            r++
        }
        return max
    }
}
