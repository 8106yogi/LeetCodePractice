//443. String Compression; Given an array of characters chars, compress it using the following algorithm:
//After you are done modifying the input array, return the new length of the array.
//You must write an algorithm that uses only constant extra space.
//Note: The characters in the array beyond the returned length do not matter and should be ignored.
//Example 1: Input: chars = ["a","a","b","b","c","c","c"] Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"] Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
//Example 2: Input: chars = ["a"]  Output: Return 1, and the first character of the input array should be: ["a"]   Explanation: The only group is "a", which remains uncompressed since it's a single character.
//Example 3:  Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]  Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].  Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
//Constraints: 1 <= chars.length <= 2000  chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.

class Solution {
    fun compress(chars: CharArray): Int {
        if(chars.size<=1) return chars.size
        val sb= StringBuilder()
        var count=0
        var lastCh=chars[0]
        for(ch in chars){
            if(ch==lastCh)
             count++
            else {
                sb.append(lastCh)
                if(count>1) sb.append(count)
                count=1
                }
            lastCh=ch
        }
        sb.append(lastCh)0
        if(count>1) sb.append(count)
        for(i in sb.indices){
            chars[i]=sb[i]
        }
        return  sb.length
    }
}
