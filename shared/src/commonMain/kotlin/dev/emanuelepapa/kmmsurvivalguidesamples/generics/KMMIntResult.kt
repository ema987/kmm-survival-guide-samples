package dev.emanuelepapa.kmmsurvivalguidesamples.generics

/**
 * Returns the result of an operation
 * Might be [SuccessKMMIntResult] when operation is successful, or [ErrorKMMIntResult] in case of an error
 */
sealed class KMMIntResult {
    /**
     * Returns the retrieved [value]
     */
    data class SuccessKMMIntResult(
        val value: Int
    ) : KMMIntResult()

    /**
     * Returns the [throwable] error happened while retrieving values
     */
    data class ErrorKMMIntResult(
        val throwable: Throwable
    ) : KMMIntResult()
}



