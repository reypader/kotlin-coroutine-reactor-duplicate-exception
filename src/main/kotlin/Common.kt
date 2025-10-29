package com.rmpader


import kotlinx.coroutines.reactor.awaitSingle
import reactor.core.publisher.Mono

class SampleException(message: String, cause: Throwable) : Exception(message, cause)

class SampleResource : AutoCloseable {
    override fun close() {
    }
}

fun bar(m: String): Mono<Unit> {
    return Mono.usingWhen(
        Mono.just(SampleResource()),
        { r ->
            Mono.error<Unit>(IllegalStateException(m))
                .onErrorMap { SampleException("SampleException: $m", it) }
        },
        { r -> Mono.just(r.close()) },
        { r, error -> Mono.just(r.close()) },
        { r -> Mono.just(r.close()) }
    )
}

suspend fun foo(m: String) {
    bar(m).awaitSingle()
}