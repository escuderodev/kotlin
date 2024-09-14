//sealed class  somente pode ser herdada por classes do mesmo pacote
sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String): Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Eduardo", "Dev")))
}