package dev.emanuelepapa.kmmsurvivalguidesamples.android.thirdparty

import dev.emanuelepapa.kmmsurvivalguidesamples.thirdparty.SystemInformationRetrieverNativeWrapper

class SystemInformationRetrieverAndroid : SystemInformationRetrieverNativeWrapper {

    //Assume the result of this method comes from using a third-party library
    override fun getSystemName(): String {
        return "Android"
    }
}