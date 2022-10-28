package com.dc_labo.dcjpy_bpmfin.educationlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform