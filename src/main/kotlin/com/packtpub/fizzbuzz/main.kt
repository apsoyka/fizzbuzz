@file:JvmName("Main")

package com.packtpub.fizzbuzz

fun main(args: Array<String>) {
    val range = 1..100

    range.forEach {
        when {
            it % 15 == 0 -> println("FizzBuzz")
            it % 3 == 0  -> println("Buzz")
            it % 5 == 0  -> println("Fizz")
            else         -> println(it)
        }
    }
}
