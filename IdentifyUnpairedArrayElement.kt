//Kotlin Logic for Identifying Unpaired Array Elements
//Input: [2,3,4,3,2,5,6,6,7,7,1,1]
//Output: 5

fun solution(A: IntArray): Int {
    // Implement your solution here

    if(A.size==1)return A[0]
    val myset= mutableSetOf<Int>()
    var first=0
    var last=A.size-1

    while(first<last){
        if(myset.contains(A[first])){
            myset.remove(A[first])
        }else{
            myset.add(A[first])
        }

        if(myset.contains(A[last])){
            myset.remove(A[last])
        }else{
            myset.add(A[last])
        }
        first++
        last--
    }
    if(first==last){
        if(myset.contains(A[first])){
            myset.remove(A[first])
        }else{
            myset.add(A[first])
        }
    }
return myset.elementAt(0)
}
