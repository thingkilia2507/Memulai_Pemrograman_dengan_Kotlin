class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean = true)

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.2, 2)
    print("""
    ${dicodingCat.name}
    ${dicodingCat.weight}
    ${dicodingCat.age}
    ${dicodingCat.isMammal}    
    """.trimIndent())

}