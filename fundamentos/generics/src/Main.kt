class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add((element)) //inclui um item à lista

    fun peek(): E = elements.last() //pega o ultimo item da lista sem removê-lo

    fun pop(): E = elements.removeAt(elements.size -1) //remove o último item da lista

    fun isEmpty() = elements.isEmpty() //verifica se a lista está vazia

    fun size() = elements.size //retorna o tamanho da lista

    override fun toString() = "MutableStack(${elements.joinToString()})" //converte para texto
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    val numbers = mutableStackOf(0.62, 3.14, 2.7)
    println(numbers)
    val names = mutableStackOf("eduardo", "carol", "juan", "alicia")
    println(names)
}