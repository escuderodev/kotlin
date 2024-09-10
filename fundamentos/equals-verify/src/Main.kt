fun main() {
    val number: Int = 1
    val referenceNumber: Int = number
    val numberTwo: Int = 2

    if (number == 1) {
        println("$number is equal at 1")
    } else {
        println("$number is not equal at 1")
    }

    if (referenceNumber === number) {
        println("referenceNumber is equal at number")
    } else {
        println("referenceNumber is not equal at number")
    }

    if (referenceNumber === numberTwo) {
        println("referenceNumber is equal at numberTwo")
    } else {
        println("referenceNumber is not equal at numberTwo")
    }

    println()
    val authors = setOf("Eduardo", "Carol", "Juan", "Alícia")
    val writers = setOf("Eduardo", "Juan", "Alícia", "Carol")

    println(authors == writers)
    println(authors === writers)

//    == faz comparação estrutural
//    === faz comparação referencial
}