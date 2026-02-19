//Task description   CountDiv Compute number of integers divisible by k in range [a..b].
//Write a function: fun solution(A: Int, B: Int, K: Int): Int; that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:   ;  { i : A ≤ i ≤ B, i mod K = 0 }
//For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
//Write an efficient algorithm for the following assumptions: A and B are integers within the range [0..2,000,000,000];  K is an integer within the range [1..2,000,000,000];  A ≤ B.

fun solution(A: Int, B: Int, K: Int): Int {    
    // Count how many numbers are divisible by K from 0 to B
    val multiplesUpToB = B / K
        // Count how many numbers are divisible by K from 0 to A
    val multiplesUpToA = A / K
    // If A itself is divisible by K,
    // we need to include it in the result (since range is inclusive)
    val includeA = if (A % K == 0) 1 else 0
    // Final count of numbers divisible by K in range [A..B]
    return multiplesUpToB - multiplesUpToA + includeA
}
