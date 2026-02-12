//Kotlin String Truncation and Array Processing Logic
//Input: ["hello myname is anthoni","yogesh", "rashmi chaudhary", "what is going on", "A", " ", "LeetCode https://leetcode.com › discuss › kotlin-solution","Given an array of characters chars" , 
//"compress it using the following algorithm:" ,"Begin with an empty string s", "For each group of consecutive repeating","test"]

//Output: [hello..., yogesh , rashmi..., what is..., A ,  , LeetCode..., Given an..., compress..., Begin with..., For each..., test ]

fun main() {
	val stringArray = arrayOf("hello myname is anthoni","yogesh", "rashmi chaudhary", "what is going on", "A", " ", "LeetCode https://leetcode.com › discuss › kotlin-solution","Given an array of characters chars",
						  "compress it using the following algorithm:" ,"Begin with an empty string s", "For each group of consecutive repeating","test")
	val list=mutableListOf<String>()
    for(s in stringArray){
		val t= truncate(s,10)
    	if(t.isNotEmpty()){
        	list.add(t)
	    }
    }
    println(list)
}

fun truncate(s:String,k:Int):String{
    val trimS=s.trim()
	val strArray = trimS.split(" ")
    val sb=StringBuilder()
	for(str in strArray){
        if(sb.length+str.length <=k ){
            sb.append(str)
            sb.append(" ")
        }else{
        	if(sb.isNotEmpty()){
            	sb.deleteCharAt(sb.length-1) //remove extra space before append  ...
	    		sb.append("...")
			    println(sb.toString())
          	}
            break;
        }
    }	 
return sb.toString()
}
