//Kotlin Missing Positive Integer Algorithm

//PermMissingElem
//Find the missing element in a given permutation.
//Task description
//An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
//Your goal is to find that missing element.
//Write a function:
//fun solution(A: IntArray): Int
//that, given an array A, returns the value of the missing element.
//For example, given array A such that:
 // A[0] = 2
 // A[1] = 3
 // A[2] = 1
 // A[3] = 5
//the function should return 4, as it is the missing element.

//fun solution(A: IntArray): Int {
//    if(A.size==0)return 1
//    A.sort()
//    var i=1
//    for(n in A){
//        if(i!=n) return i
//        i++
//    }
//    return i
//}

fun solution(A: IntArray): Int {
    var sum = 0
    for(n in A){
        sum += n
    }
    return ((A.size + 1)*(A.size + 2))/2 - sum
}
