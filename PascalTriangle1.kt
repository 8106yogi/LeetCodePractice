//118. Pascal's Triangle1 : Given an integer numRows, return the first numRows of Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//Input: numRows = 5
//Output
//[
// [1],
// [1,1],
// [1,2,1],
// [1,3,3,1],
// [1,4,6,4,1]
//]

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val ansList= mutableListOf<List<Int>>()
        for(i in 0..numRows-1){
            ansList.add(generateRow(i))
        }
        return ansList
    }
    fun generateRow(rowIndex:Int) : List<Int> {
        val list=mutableListOf<Int>()
        var value=1
        list.add(value)
        for(i in 1..rowIndex){
            value = value * (rowIndex - i + 1)/i
            list.add(value)  
        }
        return list
    }
}
