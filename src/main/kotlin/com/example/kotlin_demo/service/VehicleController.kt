package com.example.kotlin_demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v")
class VehicleController {
    @Autowired
    lateinit var vehicleService: VehicleService

    @GetMapping("/startBuyingVehicles")
    fun startBuyingVehicles(){
        vehicleService.startBuyingVehicles()
    }
}