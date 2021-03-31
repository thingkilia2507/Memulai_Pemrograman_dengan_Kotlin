abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {

    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

class Dog(name: String, weight: Double, age: Int) : Animal(name, weight, age, isCarnivore = true)

fun main() {

    var myDoggy = Dog("Doggy", 25.8, 15)
    myDoggy.eat()
    myDoggy.sleep()
}