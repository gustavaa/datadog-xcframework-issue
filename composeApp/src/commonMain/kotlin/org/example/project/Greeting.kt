package org.example.project

import com.example.shared.Logger

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val logger = Logger()
        logger.debug("Greeting from ${platform.name}")
        return "Hello, ${platform.name}!"
    }
}