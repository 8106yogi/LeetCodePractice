//### Codility:  5_PrefixSum 1. PassingCars 
//You are given an array `A` of 0s and 1s:
//* `0` → car going **East**
//* `1` → car going **West**
//A pair `(P, Q)` is a **passing car** if:
//* `P < Q`
//* `A[P] = 0` (East)
//* `A[Q] = 1` (West)
//In simple words:
//Every time a **0 appears before a 1**, it counts as one passing pair.
//### Example For array: `[0, 1, 0, 1, 1]`   Passing pairs = **5**
//Return:
//* Total number of passing pairs
//* `-1` if count exceeds **1,000,000,000**
//### Efficient Idea (O(N))
//* Count how many `0`s (east cars) seen so far.
//* Every time you see `1`, add the number of east cars to result.
//### Constraints  1 ≤ N ≤ 100,000; Array contains only `0` and `1`

fun solution(A: IntArray): Int {
    var eastCount = 0L
    var passingCars = 0L
    for (car in A) {
        if (car == 0) {
            eastCount++          // Count east-going cars
        } else {
            passingCars += eastCount  // Each west car passes all previous east cars
            if (passingCars > 1_000_000_000) {
                return -1
            }
        }
    }
    return passingCars.toInt()
}

