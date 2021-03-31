import kotlin.reflect.KProperty


class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var small: String by DelegateName()
}

class Person {
    var age: String by DelegateName()
}

class Hero {
    var me: String by DelegateName()
}

fun main() {
    val animal = Animal()
    animal.small = "Dicoding Miaw"
    println("Nama Hewan: ${animal.small}")

    val person = Person()
    person.age = "Dimas"
    println("Nama Orang: ${person.age}")

    val hero = Hero()
    hero.me = "Gatotkaca"
    println("Nama Pahlawan: ${hero.me}")
}