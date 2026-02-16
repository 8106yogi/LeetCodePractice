//Codility Lesson 4 Counting Elements 1. MaxCounters; Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
//🔹 MaxCounters — In Simple Words , You have N counters, and all start at 0. You are given a list of operations. For each number in the list:
//If the number is between 1 and N, increase that counter by 1.
//If the number is N + 1, set all counters to the current maximum value among them.
//At the end, return the final values of all counters.
//🔹 Example (Simple Understanding) N = 3   A = [1, 2, 4, 1]
//(Here 4 = N + 1 → max counter)
//Steps:
//increase(1) → (1,0,0)
//increase(2) → (1,1,0)
//max counter → (1,1,1)
//increase(1) → (2,1,1)
//Final result: [2,1,1]
fun solution(N: Int, A: IntArray): IntArray {
    val arr= IntArray(N)
    var max=0
    for(n in A){
        if(n<=N){  
            arr[n-1]++
        }
        else{
            if(arr.maxOrNull()?:0>max){
                max=arr.maxOrNull()?:0 //  methoed to get maximum value of an array
                arr.fill(max?:0) // method to fill all values of Array //get max value from array
            }
        }
    }
    return arr
} // O(N * M)

fun solution(N: Int, A: IntArray): IntArray {
    val counter = IntArray(N)
    var currentMax=0
    var baseMax = 0
    for(n in A){
        if(n in 1..N){
            var index= n-1
          if(counter[index]<baseMax)
                counter[index]=baseMax
            counter[index]++
            currentMax= maxOf(currentMax, counter[index] )
        }else{
            baseMax=currentMax
        }
    }
    for(i in counter.indices){     // Final pass to update remaining counters
        if(counter[i]<baseMax)
            counter[i]=baseMax
    }
    return counter
} //O(N+M)
