class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("Macaco"),Animal("Zebra"), Animal("Cachorro"))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("${animal.name} está no Zoológico.")
    }
}