package dev.emanuelepapa.kmmsurvivalguidesamples.thirdparty

class SystemInformationRetrieverImpl(
    private val systemInformationRetriever: SystemInformationRetrieverNativeWrapper
): SystemInformationRetriever {
    override fun getSystemName(): String {
        return "SystemName: ${systemInformationRetriever.getSystemName()} from shared"
    }
}