//Input: hello myname is anthoni Output: inohtna si emanym olleh
//Input: rashmi chaudhary Output: yrahduahc imhsar

fun main() {
  val str = arrayOf("hello myname is anthoni","yogesh", "rashmi chaudhary", "what is going on", "A", " ", "LeetCode https://leetcode.com › discuss › kotlin-solution","Given an array of characters chars",
						"compress it using the following algorithm:" ,"Begin with an empty string s", "For each group of consecutive repeating","test")
  for(s in str){
    println(s.trim())
    println (reverseString(s.trim()))
  }
}

fun reverseString(str:String):String?{
	if(str.isNullOrEmpty()) return null

    val charArray =str.toCharArray()
    
    var first = 0
    var last = charArray.lastIndex
    
    while(first<last){
        val temp= charArray[first]
        charArray[first] = charArray[last]
        charArray[last] = temp
        first++
        last--        
    }
    return charArray.concatToString()  //charArray to String
}
