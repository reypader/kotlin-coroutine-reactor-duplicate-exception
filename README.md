# Kotlin Coroutines Reactor Bug - Duplicating Exceptions

Encountered a strange behavior while working with Kotlin Coroutines and Project Reactor. It looked like exceptions are being copied and being made to be the cause of itself during my unit testing. Found this thread in the Kotlin Forums confirming the observation: [Coroutines with debug duplicates exception](https://discuss.kotlinlang.org/t/coroutines-with-debug-duplicates-exception/29103)

