import java.io.File

/**
 * Task
 * Input file contains rows of text
 * 1. Extract the first and last digit for each row
 * 2. Create a sum from all extracted numbers.
 */

fun calculateCalibrationValue(inputFile: String): Int {
    var sum = 0
    File(inputFile).forEachLine { sum += extractDigitSumFromString(it) }
    return sum
}

fun extractDigitSumFromString(inputString: String): Int {
    val digits = inputString.filter { it.isDigit() }
    return "${digits.first()}${digits.last()}".toInt()
}