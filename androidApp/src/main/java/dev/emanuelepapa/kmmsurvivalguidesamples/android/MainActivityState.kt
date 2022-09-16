package dev.emanuelepapa.kmmsurvivalguidesamples.android

import dev.emanuelepapa.kmmsurvivalguidesamples.generics.KMMIntResult
import dev.emanuelepapa.kmmsurvivalguidesamples.generics.KMMResult

data class MainActivityState(
    val randomInt: Int?,
    val randomIntWrappedInIntResult: KMMIntResult?,
    val randomIntWrappedInResult: KMMResult<Int>?,
)