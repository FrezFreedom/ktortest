package com.example.plugins

import com.github.lamba92.kotlingram.TelegramBotApiClient
import com.github.lamba92.kotlingram.TelegramResponse
import com.github.lamba92.kotlingram.api.generated.Update
import com.github.lamba92.kotlingram.api.generated.getUpdates
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.logging.*
import kotlin.math.log

fun Application.configureRouting() {
    routing {
        get("/") {
            call.application.environment.log.info("test")
            call.respondText("Hello World!")
        }

        get("/get") {
            call.respondText { "sdf" }
            val z = 50
        }
    }
}
