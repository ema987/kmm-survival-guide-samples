package dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics

import kotlin.random.Random

fun getRandomInt(): Int = Random.nextInt(until = 10)

fun getRandomIntWrappedInIntResult(): KMMIntResult {
    val isSuccess = Random.nextBoolean()
    return if(isSuccess) {
        KMMIntResult.SuccessKMMIntResult(Random.nextInt(until = 10))
    } else {
        KMMIntResult.ErrorKMMIntResult(RuntimeException("There was an error, Int not generated"))
    }
}

fun getRandomIntWrappedInResult(): KMMResult<Int> {
    val isSuccess = Random.nextBoolean()
    return if(isSuccess) {
        KMMResult.SuccessKMMResult(Random.nextInt(until = 10))
    } else {
        KMMResult.ErrorKMMResult(RuntimeException("There was an error, Int not generated"))
    }
}