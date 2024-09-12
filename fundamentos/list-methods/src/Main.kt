fun main() {
    val numbers = listOf(-2,-1,0,1,2,3,4,5)
//    val positives = numbers.filter { x -> x > 0 }
    val positives = numbers.filter { it > 0 }
    val negatives = numbers.filter { it < 0 }
    val zero = numbers.filter { it > -1 && it < 1 }
    val names = listOf("Eduardo", "Carol", "Juan", "Alícia", "Eduardo Escudero")

//    utilize filter() para filtrar
    println()
    println("Numbers: $numbers")
    println("Numbers Positives: $positives")
    println("Numbers Negatives: $negatives")
    println("Number Zero: $zero")
    println(names.filter { it == "Eduardo" })
    println(names.filter { it.contains("Eduardo")})

//    utilize map para alterar elementos dentro de uma lista
    println()
    val doubled = numbers.map { it * 2 }
    val tripled = numbers.map { it * 3 }
    println("Numbers: $numbers")
    println("Numbers Doubled: $doubled")
    println("Numbers Tripled: $tripled")

//    diferença entre map e flatMap
    println()
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}