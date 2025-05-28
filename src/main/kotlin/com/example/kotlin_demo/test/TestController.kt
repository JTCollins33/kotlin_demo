package com.example.kotlin_demo.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {
    @Autowired
    private lateinit var service: TestService

    @GetMapping("/companionObjects1")
    fun objects1(){
        return service.companionObjects1()
    }

    @GetMapping("/companionObjects2")
    fun companionObjects2(): User{
        return service.companionObjects2()
    }

    @GetMapping("/openClass1")
    fun openClass1(){
        service.openClass1()
    }
}