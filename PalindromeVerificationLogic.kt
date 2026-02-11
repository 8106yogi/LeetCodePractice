//Kotlin Palindrome Verification Logic.
//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1: Input: s = "A man, a plan, a canal: Panama" Output: true  Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:  Input: s = "race a car" Output: false  Explanation: "raceacar" is not a palindrome.
//Example 3: Input: s = " "  Output: true  Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//Constraints:  1 <= s.length <= 2 * 105, s consists only of printable ASCII characters.

class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.trim().length==0 ||s.trim().length==1)return true
        val sb = StringBuilder()
        for(ch in s){
            if(ch.isLetterOrDigit()){
                sb.append(ch.lowercaseChar())
            }
        }
        println(sb.toString())
        var start=0
        var end= sb.length-1
        while(start<end){
            if(sb[start]!=sb[end])
                return false
            start++
            end--
        }
        return true
    }
}
