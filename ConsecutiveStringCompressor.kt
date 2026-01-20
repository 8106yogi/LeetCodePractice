fun main() {
    val s = stringCompressor("abbcceccda")
    println(s)
}

fun stringCompressor(input: String): String {
    // Given a String, compress it by replacing repeated consecutive letters
    // with the letter followed by the number of repetitions.
    //
    // Rules:
    // - Only count consecutive repetitions
    // - If a letter appears only once, display it with 1
    // - Order must be preserved
    //
    // Example:
    // "aaabbcddd"  -> "a3b2c1d3"
    // "aaabbcddda" -> "a3b2c1d3a1"

    if (input.isEmpty()) return ""

    var lastLetter = input[0]
    var counter = 0
    val sb = StringBuilder()

    for (ch in input) {
        if (ch == lastLetter) {
            counter++
        } else {
            sb.append(lastLetter)
            sb.append(counter)
            lastLetter = ch
            counter = 1
        }
    }

    sb.append(lastLetter)
    sb.append(counter)

    return sb.toString()
}
