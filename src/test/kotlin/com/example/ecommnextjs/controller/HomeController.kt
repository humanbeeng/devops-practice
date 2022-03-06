package com.example.ecommnextjs.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping
    fun hello(): String {
        return "Hello"
    }
}