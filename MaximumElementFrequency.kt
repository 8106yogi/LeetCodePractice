//Kotlin Implementation for Maximum Element Frequency
//3005. Count Elements With Maximum Frequency
//You are given an array nums consisting of positive integers.
//Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//The frequency of an element is the number of occurrences of that element in the array.

//Example 1:  Input: nums = [1,2,2,3,1,4]  Output: 4  Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array. So the number of elements in the array with maximum frequency is 4.
//Example 2: Input: nums = [1,2,3,4,5]  Output: 5  Explanation: All elements of the array have a frequency of 1 which is the maximum.  So the number of elements in the array with maximum frequency is 5.

class Solution {
//  Input: nums = [1,2,2,3,1,4] 
    fun maxFrequencyElements(nums: IntArray): Int {
        if(nums.size==1) return 1
        val map = mutableMapOf<Int,Int>()
        for(n in nums){
              map[n] = (map[n] ?:0)+1
        }
        var sum=0
        println(map) //{1=2, 2=2, 3=1, 4=1}
        println(map.keys.maxOrNull()) //4
        println(map.values.maxOrNull()) //2
        for((k,v) in map){
            if(v==map.values.maxOrNull()){
                sum+= v
            }         
        }
    return sum
    }
}
