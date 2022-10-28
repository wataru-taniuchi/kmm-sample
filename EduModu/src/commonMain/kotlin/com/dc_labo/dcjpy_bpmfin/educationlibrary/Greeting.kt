package com.dc_labo.dcjpy_bpmfin.educationlibrary

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}