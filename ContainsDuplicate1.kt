//217. Contains Duplicate:  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1: Input: nums = [1,2,3,1]  Output: true  Explanation: The element 1 occurs at the indices 0 and 3. 
//Example 2: Input: nums = [1,2,3,4]  Output: false Explanation: All elements are distinct.
//Example 3: Input: nums = [1,1,1,3,3,4,3,2,4,2]  Output: true 
//Constraints: 1 <= nums.length <= 105  ,  -109 <= nums[i] <= 109

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        if(nums.size==1) return false
        var last = nums[0]
        for(i in 1..nums.size-1){
            if(last==nums[i])return true
            last = nums[i]
        }
        return false
    }
}

//class Solution {
//    fun containsDuplicate(nums: IntArray): Boolean {
//        nums.sort()
//        var last = Int.MIN_VALUE
//        for(n in nums){
//            if(last==n)return true
//            last = n
//        }
//       return false
//    }
//}
