//Unit é utilizado quando a função não retorna nada. Pode ficar sem nada tbm
fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun multiply(num1: Int, num2: Int) = num1 * num2

fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

//para criar uma função vararg que receberá como parâmetro outra função vararg devemos utilizar o *
fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printMessage("Palmeiras não tem mundial!")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(message = "Hello", prefix = "Log")
    println(sum(2,1))
    println(multiply(4,2))
    printAll("Message 1", "Message 2", "Message 3")
    printAllWithPrefix("Message 1", "Message 2", "Message 3", prefix = "Test ")
    log("Log 1", "Log 2", "Log 3")
}