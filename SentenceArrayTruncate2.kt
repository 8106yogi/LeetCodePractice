//Intput:  [hello myname is anthoni ,yogesh ,rashmi chaudhary , what is going on ,A ,  , LeetCode https://leetcode.com › discuss › kotlin-solution ,Given an array of characters chars ,compress it using the following algorithm:
//        Begin with an empty string s , For each group of consecutive repeating ,test]
//K=4 , Output= [A, For..., test]
//K =15, [hello myname..., yogesh, rashmi..., what is going..., A, LeetCode..., Given an array..., compress it..., Begin with an..., For each group..., test]


fun main() {
	val str = arrayOf("hello myname is anthoni","yogesh", "rashmi chaudhary", "what is going on", "A", " ", "LeetCode https://leetcode.com › discuss › kotlin-solution","Given an array of characters chars",
						  "compress it using the following algorithm:" ,"Begin with an empty string s", "For each group of consecutive repeating","test")

	val k= 4
    val list= mutableListOf<String>()
	for(s in str){
        println(s.trim())
        val t=truncate(s.trim(),k)
		if(!t.isNullOrEmpty()) list.add(t)
    }
    println("-----------------------------------------------------")
	println(list)
    
}

fun truncate(s:String, k:Int):String?{
    if(s.isEmpty()) return null   
    val sb= StringBuilder()
    if(s.length <= k) return s
    for(i in s.length-1 downTo 0){
		if(i<k && s[i]==' '){
        	sb.append(s.substring(0,i))
           	sb.append("...")
            return sb.toString()
    	}	
    }
    return ""
}
