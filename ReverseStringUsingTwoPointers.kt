//Kotlin In-Place String Reversal Algorithm

class Solution {
    fun reverseString(s: CharArray): Unit {
     var first=0
     var last= s.size-1
     
     while(first<last){
        val temp= s[first]
        s[first]=s[last]
        s[last]=temp
        first++
        last--
     }
    }
}
