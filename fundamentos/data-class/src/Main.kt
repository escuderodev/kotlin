data class User(val nome: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main() {
    println()
    val user = User("Eduardo Escudero", 1)
    println(user)

    val secondUser = User("Eduardo Escudero", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    //    hashcode function
    println()
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    //    copy function
    println()
    println(user.copy())
    println(secondUser.copy())
    println(thirdUser.copy())
}