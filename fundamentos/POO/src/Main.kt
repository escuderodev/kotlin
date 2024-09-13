open class Cachorro {
    open fun sayHello() {
        println("Cachorro latindo...")
    }
}

class Yorkshire : Cachorro() {
    override fun sayHello() {
        println("Au Au!")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A Tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String): Lion(name = name, origin = "India")

fun main() {
    val bidu: Cachorro = Yorkshire()
    bidu.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}