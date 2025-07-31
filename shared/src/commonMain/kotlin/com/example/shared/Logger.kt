package com.example.shared

class Logger {
    val logger = com.datadog.kmp.log.Logger.Builder()
        .setName("SharedLogger")
        .build()

    fun debug(message: String) {
        logger.debug(message)
    }
}