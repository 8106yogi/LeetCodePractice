//Cyclic Array Rotation Algorithm in Kotlin
//input: 3,8,9,7,6 //K = 3 //output: 9,7,6,3,8
//input: 1,2,3,4,5 //K = 1 //output: 5,1,2,3,4
//input: 1,2,3,4 //K = 2 //output: 3,4,1,2
//input: 1,2,3 //K = 3 //output: 1,2,3
//input: 10 //K = 5 //output: 10
//Assume that: N and K are integers within the range [0..100];  each element of array A is an integer within the range [−1,000..1,000].

fun solution(A: IntArray, K: Int): IntArray {
if(A.size==0||A.size==1||A.size==K)return A
var k=K
k= K%A.size
val arr=IntArray(A.size)
    for(i in A.indices){
        var j=0
        if(i+k<A.size){
            j = i + k
        }else{
             j= i+k - A.size
        }
        arr[j]= A[i]
    }
return arr
}
