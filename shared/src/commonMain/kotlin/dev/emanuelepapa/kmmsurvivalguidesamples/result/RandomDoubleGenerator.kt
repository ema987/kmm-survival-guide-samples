package dev.emanuelepapa.kmmsurvivalguidesamples.result

import kotlin.random.Random

fun getRandomDouble(): Result<Double> {
    return if(Random.nextBoolean()) {
        Result.success(Random.nextDouble())
    } else {
        Result.failure(Throwable("Can't generate a new double"))
    }
}