fun main() {
   val value = doMaths(Operation.ADDITION, 10.0, 11.0)
   
   println(value)
}

enum class Operation {
    ADDITION,
    SUBTRACTION 
}

fun doMaths(operation: Operation, value1: Double, value2: Double): Double {
    when(operation) {
        Operation.ADDITION -> return addNumbers(value1, value2)
        Operation.SUBTRACTION -> return subtractNumbers(value1, value2)
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