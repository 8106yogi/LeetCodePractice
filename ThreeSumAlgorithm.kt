//Input :

//nums = [-1,0,1,2,-1,-4]

//Output :

// [[-1,0,1],[-1,-1,2]]



class Solution {

    fun threeSum(nums: IntArray): List<List<Int>> {

    val ansSet=mutableSetOf<List<Int>>()



    for(i in nums.indices){

        val set = mutableSetOf<Int>()

        for(j in i+1..nums.size-1){

            if( set.contains(-(nums[i]+nums[j]))){

                ansSet.add(listOf<Int>(nums[i],nums[j],-(nums[i]+nums[j])).sorted())

            }            

            set.add(nums[j])

        }

    }
    return ansSet.toList() 
  }
}

