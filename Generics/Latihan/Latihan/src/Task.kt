/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    fun show(): String { return "String result: $stringResult \nInt result: $intResult" }
    println(show())
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when (args) {
        is Int -> args * 5
        is String -> args.length
        else -> 0
    }
}