//14. Longest Common Prefix; Write a function to find the longest common prefix string amongst an array of strings; If there is no common prefix, return an empty string "".
//Example 1: Input: strs = ["flower","flow","flight"]  Output: "fl"
//Example 2:  Input: strs = ["dog","racecar","car"]  Output: "";  Explanation: There is no common prefix among the input strings.
//Constraints: 1 <= strs.length <= 200;  0 <= strs[i].length <= 200;  strs[i] consists of only lowercase English letters if it is non-empty.

class Solution {
//     fun longestCommonPrefix(strs: Array<String>): String {
//         if(strs.size==1)return strs[0]
//         if(strs[0].length==0)return ""
//         val firstString=strs[0]
//         val sb=StringBuilder()
//         for(i in firstString.indices){
//             for(j in 1..strs.size-1){
//             if(strs[j].length<=i || firstString[i]!=strs[j][i]){
//                 return sb.toString()
//                 }
//             }
//         sb.append(firstString[i])
//         }
//     return sb.toString()
//     }    
// }

    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.size==1) return strs[0]
        val sorted= strs.sorted()
        var point=0
        val sb = StringBuilder()
        val first=sorted[0]
        val second=sorted[sorted.size-1]
        val min= minOf(first.length, second.length )
        
        while(point<min){
            if(first.get(point)!=second.get(point)){
                return sb.toString()
            }
            sb.append(first.get(point))
            point++   
        }
        return sb.toString()
        }
    }
