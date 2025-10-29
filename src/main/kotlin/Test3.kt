package com.rmpader

import kotlinx.coroutines.runBlocking

fun main() {
    println("=== Test 3: debug=off, via foo() suspend function ===")
    System.setProperty("kotlinx.coroutines.debug", "off")
    runBlocking {
        try {
            foo("Test 3: debug=off, via foo() suspend function")
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}