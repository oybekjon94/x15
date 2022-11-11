package `extension properties`

import atomictest.eq

/*
Just as functions can be extension functions, properties can be extension
properties.
 */
val String.indices: IntRange
    get() = 0 until length
fun main() {
    "abc".indices eq 0..2
}