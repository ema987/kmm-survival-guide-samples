package dev.emanuelepapa.kmmsurvivalguidesamples.android.sealedclassesandgenerics

import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.KMMIntResult
import dev.emanuelepapa.kmmsurvivalguidesamples.sealedclassesandgenerics.KMMResult

data class SealedClassesAndGenericScreenState(
    val randomInt: Int?,
    val randomIntWrappedInIntResult: KMMIntResult?,
    val randomIntWrappedInResult: KMMResult<Int>?,
)