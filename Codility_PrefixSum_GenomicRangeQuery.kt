//GenomicRangeQuery Find the minimal nucleotide from a range of sequence DNA.
A non-empty DNA string S made of only: A, C, G, T
Each letter has a value: A → 1 C → 2 G → 3 T → 4
You are also given two arrays: P[] (start indices); Q[] (end indices)
For each index K: Look at the substring from S[P[K]] to S[Q[K]] (inclusive).
Find the minimum value (impact factor) in that substring. Return an array containing the answers for all queries.
Constraints: 1 ≤ N ≤ 100,000 (length of S); 1 ≤ M ≤ 50,000 (number of queries); 0 ≤ P[K] ≤ Q[K] < N; String contains only A, C, G, T
Example S = "CAGCCTA";  P = [2, 5, 0];  Q = [4, 5, 6]
Queries:  (2,4) → "GCC" → min = 2;  (5,5) → "T" → min = 4;  (0,6) → whole string → contains A → min = 1;  Output:  [2, 4, 1]

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
