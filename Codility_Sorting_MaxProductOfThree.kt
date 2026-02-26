//1. MaxProductOfThree: Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
//A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
//For example, array A such that: A[0] = -3 A[1] = 1 A[2] = 2 A[3] = -2 A[4] = 5 A[5] = 6
//contains the following example triplets: (0, 1, 2), product is −3 * 1 * 2 = −6; (1, 2, 4), product is 1 * 2 * 5 = 10; (2, 4, 5), product is 2 * 5 * 6 = 60
//the function should return 60, as the product of triplet (2, 4, 5) is maximal.
//Write an efficient algorithm for the following assumptions: N is an integer within the range [3..100,000]; each element of array A is an integer within the range [−1,000..1,000].

fun solution(A: IntArray): Int {
    // Implement your solution here
    var max= Int.MIN_VALUE
    for(i in A.indices){
        for (j in i+1..A.size-1){
            for(k in j+1..A.size-1)
            max= maxOf(A[i]*A[j]*A[k],max)
        }
    }
    return max
}  //ON3



fun solution(A: IntArray): Int {
    // Implement your solution here
    A.sort()
    val n=A.size
    val op1=  A[n-1]*A[n-2]*A[n-3]
    val op2=  A[0]*A[1]*A[n-1]
    return maxOf(op1,op2)
} //O(N * log(N))
