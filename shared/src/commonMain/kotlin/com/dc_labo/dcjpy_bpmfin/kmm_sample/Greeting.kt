package com.dc_labo.dcjpy_bpmfin.kmm_sample

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}