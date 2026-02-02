//LeetCode: 20. Valid Parentheses
//Stack-Based Parentheses Validation Logic

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
// Example 1:
//Input: s = "()"
//Output: true

//Example 2:
//Input: s = "()[]{}"
//Output: true
//Example 3:
//Input: s = "(]"
//Output: false
//Example 4:
//Input: s = "([])"
//Output: true
//Example 5:
//Input: s = "([)]"
//Output: false

class Solution {
    fun isValid(s: String): Boolean {
        if(s.trim().length % 2!=0)return false
        val stack =ArrayDeque<Char>()
        for(ch in s){
                when(ch){
                ')' -> if(stack.lastOrNull()=='(') stack.removeLast() else return false
                '}' -> if(stack.lastOrNull()=='{') stack.removeLast()else return false
                ']' -> if(stack.lastOrNull()=='[') stack.removeLast()else return false
                else -> stack.addLast(ch)
                }          
            }
        return stack.isEmpty()
    }
}
