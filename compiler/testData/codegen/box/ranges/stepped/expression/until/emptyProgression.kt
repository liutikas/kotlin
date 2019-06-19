// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 2 until 2
    for (i in intProgression step 2) {
        intList += i
    }
    assertTrue(intList.isEmpty())

    val longList = mutableListOf<Long>()
    val longProgression = 2L until 2L
    for (i in longProgression step 2L) {
        longList += i
    }
    assertTrue(longList.isEmpty())

    val charList = mutableListOf<Char>()
    val charProgression = 'b' until 'b'
    for (i in charProgression step 2) {
        charList += i
    }
    assertTrue(charList.isEmpty())

    return "OK"
}