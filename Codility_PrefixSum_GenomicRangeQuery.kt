//GenomicRangeQuery Find the minimal nucleotide from a range of sequence DNA.
//A non-empty DNA string S made of only: A, C, G, T
//Each letter has a value: A → 1 C → 2 G → 3 T → 4
//You are also given two arrays: P[] (start indices); Q[] (end indices)
//For each index K: Look at the substring from S[P[K]] to S[Q[K]] (inclusive).
//Find the minimum value (impact factor) in that substring. Return an array containing the answers for all queries.
//Constraints: 1 ≤ N ≤ 100,000 (length of S); 1 ≤ M ≤ 50,000 (number of queries); 0 ≤ P[K] ≤ Q[K] < N; String contains only A, C, G, T
//Example S = "CAGCCTA";  P = [2, 5, 0];  Q = [4, 5, 6]
//Queries:  (2,4) → "GCC" → min = 2;  (5,5) → "T" → min = 4;  (0,6) → whole string → contains A → min = 1;  Output:  [2, 4, 1]

fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
    val ansArray = IntArray(P.size)
    for(i in P.indices){
        ansArray[i]=getMinVal(S,P[i],Q[i])
    }
    return ansArray
}

fun getMinVal(S:String, s:Int, e:Int):Int{
    val GNOM= "ACGT"
    val sub= S.substring(s,e+1).toCharArray().sorted()
    return GNOM.indexOf(sub[0])+1
}



fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
    // Implement your solution here
    val aArr= IntArray(S.length+1)
    val cArr= IntArray(S.length+1)
    val gArr= IntArray(S.length+1)
    var aCount=0
    var cCount=0
    var gCount=0
    for(i in S.indices){
        when(S[i])
        {
            'A' -> aCount++           
            'C' -> cCount++   
            'G' -> gCount++   
        }
        aArr[i+1]= aCount
        cArr[i+1]= cCount
        gArr[i+1]= gCount
    }
        //  println(aArr.joinToString())
        //  println(cArr.joinToString()) 
        //  println(gArr.joinToString()) 

    val ansArray= IntArray(P.size){-1}
    //  println(ansArray.joinToString("    :    ")) // -1    :    -1    :    -1
    for(i in P.indices){
        if(aArr[Q[i]+1]- aArr[P[i]]>0)    ansArray[i]=1
        else if(cArr[Q[i]+1]- cArr[P[i]]>0)   ansArray[i]=2  
        else if(gArr[Q[i]+1]- gArr[P[i]]>0)   ansArray[i]=3  
        else ansArray[i]=4
    }
    return ansArray
}


