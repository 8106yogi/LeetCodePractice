//Codility: BinaryGap
//A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//For example, number 9 has binary representation 1001 and contains a binary gap of length 2. return 2
//The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. return 4
//The number 20 has binary representation 10100 and contains one binary gap of length 1. return 1
//The number 15 has binary representation 1111 and has no binary gaps. return 0
//The number 32 has binary representation 100000 and has no binary gaps. return 0
//Write a function: that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
//Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

fun solution(N: Int): Int {
    val str= numToBinary(N)
    var count=0
    var max=0
    for(ch in str){
        if(ch=='1'){
            max=maxOf(max,count)
            count = 0
        }else{
            count++
        }
    }
    return max
}

fun numToBinary(num:Int):String{
    var sb=StringBuilder()
    var temp=num
        while(temp>0){
            val rem=temp%2
            sb.append(rem)
            temp= temp/2
        }
    return sb.reverse().toString()
}
