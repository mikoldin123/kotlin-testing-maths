import kotlin.math.sqrt


fun main() {
   val value = doMaths(Operation.SQUAREROOT, 10.0)
   
   println(value)
}

enum class Operation {
    ADDITION,
    SUBTRACTION,
    PERCENTAGE,
    SQUAREROOT
}

fun doMaths(operation: Operation, value1: Double, value2: Double = 0.0): Double {
    when(operation) {
        Operation.ADDITION -> return addNumbers(value1, value2)
        Operation.SUBTRACTION -> return subtractNumbers(value1, value2)
        Operation.SQUAREROOT -> return squareRoot(value1)
    }
}

fun addNumbers(a: Double, b: Double): Double {
    val sum = a + b
    return sum
}

fun subtractNumbers(a: Double, b: Double): Double {
    var difference = a - b
    return difference
}

fun percentageOf(value: Double, percent: Double): Double {
    val percent = value * percent / 100
    return percent
}

fun geSquareRoot(number: Double): Double {
    return sqrt(number)
}