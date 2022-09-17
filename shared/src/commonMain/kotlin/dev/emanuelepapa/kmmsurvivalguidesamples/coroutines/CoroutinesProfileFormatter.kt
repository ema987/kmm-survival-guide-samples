package dev.emanuelepapa.kmmsurvivalguidesamples.coroutines

import kotlinx.coroutines.delay

class CoroutinesProfileFormatter  {
    suspend fun formatFirstAndLastNameWithCoroutines(firstName: String, lastName: String): String {
        delay(1000)
        return "$firstName $lastName"
    }
}