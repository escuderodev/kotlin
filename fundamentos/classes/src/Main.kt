class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customar = Customer()
    val contact = Contact(1, "escuderodev@outlook.com")

    println(contact.id)
    println(contact.email)
    contact.email = "escudero.ti@gmail.com"
    println(contact.email)
}