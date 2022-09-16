package dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics

/**
 * Returns the result of an operation
 * Might be [SuccessKMMResult] when operation is successful, or [ErrorKMMResult] in case of an error
 */
sealed class KMMResult<out Value> {
    /**
     * Returns the retrieved [value]
     */
    data class SuccessKMMResult<Value>(
        val value: Value
    ): KMMResult<Value>()

    /**
     * Returns the [throwable] error happened while retrieving values
     */
    data class ErrorKMMResult<Value>(
        val throwable: Throwable
    ): KMMResult<Value>()
}


