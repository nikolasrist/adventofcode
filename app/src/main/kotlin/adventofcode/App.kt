package adventofcode

import calculateCalibrationValue

class App {
    val day1 get() = calculateCalibrationValue("/Users/nehranis/dev/adventofcode/app/src/main/resources/day01/input")
}

fun main() {
    val app = App()
    println(app.day1)
}
