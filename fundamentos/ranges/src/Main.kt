fun main() {

    for (i in 0..10) {
        print(i)
    }

    println()
    for (i in 0 until 3) {
        print(i)
    }

    println()
    for (i in 0..10 step 2) {
        print(i)
    }

    println()
    for (i in 3 downTo 0) {
        print(i)
    }

    println()
    for (letter in 'a'..'z') {
        print(letter)
    }

    println()
    for (letter in 'z' downTo 's' step 2) {
        print(letter)
    }

    println()
    val num: Int = 20
    if (num in 1..5) {
        print("Number $num is present in range of 1 and 5.")
    } else {
        print("Number $num not is present in range of 1 and 5.")
    }
}