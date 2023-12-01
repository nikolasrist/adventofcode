package adventofcode.day01

import calculateCalibrationValue
import io.kotest.matchers.shouldBe
import kotlin.test.Test

class Day01Test {
    val CHECK_VALUE = 142

    @Test
    fun testCalculation() {
        val result =
            calculateCalibrationValue("/Users/nehranis/dev/adventofcode/app/src/test/resources/day01/test_input")
        result shouldBe CHECK_VALUE
    }
}