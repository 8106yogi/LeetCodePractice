//🐟 Fish Problem — Short Explanation You are given:
//A[i] → size of fish i; B[i] → direction of fish i
//0 → upstream (←); 1 → downstream (→)
//Fish are arranged from left to right by index (0 to N-1).; ⚔️ When Do Fish Fight?; Two fish fight only if:
//The left fish (smaller index) is moving downstream (→) The right fish (larger index) is moving upstream (←)
//No alive fish are between them The bigger fish eats the smaller one.Return the number of fish that stay alive after all fights.
//📝 Example A = [4, 3, 2, 1, 5] B = [0, 1, 0, 0, 0]
//Directions: 4 ← 3 → 2 ← 1 ← 5 ←
//What happens: Fish 3 (→) meets 2 → eats it; Fish 3 (→) meets 1 → eats it; Fish 3 (→) meets 5 → gets eaten; Fish 4 and 5 never meet anyone.
//✅ Survivors: 4 and 5 ;👉 Answer = 2

fun solution(A: IntArray, B: IntArray): Int {
    val stack=ArrayDeque<Int>()
    var eaten=0
    for(i in A.indices){
        if(B[i]==0){

        }else{
            
        }

    }
}
