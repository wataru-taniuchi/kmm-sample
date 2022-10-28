package com.dc_labo.dcjpy_bpmfin.kmm_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform