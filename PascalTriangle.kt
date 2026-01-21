//Input
//numRows = 5

//Output
//[
// [1],
// [1,1],
// [1,2,1],
// [1,3,3,1],
// [1,4,6,4,1]
//]

class Solution {
    fun generateRow(rowIndex: Int): List<Int> {
        val row = mutableListOf<Int>()
        var value = 1
        row.add(value)

        for (i in 1..rowIndex) {
            value = value * (rowIndex - i + 1) / i
            row.add(value)
        }
        return row
    }

    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        for (i in 0 until numRows) {
            result.add(generateRow(i))
        }
        return result
    }
}
