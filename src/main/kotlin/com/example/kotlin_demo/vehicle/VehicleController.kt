package com.example.kotlin_demo.vehicle

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vehicle")
class VehicleController {
    @Autowired
    lateinit var vehicleService: VehicleService

    @GetMapping
    fun getVehicles(){
        vehicleService.getVehicle()
    }

    @GetMapping("/sellCars")
    fun sellCars(){
        vehicleService.sellCars()
    }

    @GetMapping("/sellToyotas")
    fun sellToyotas(){
        vehicleService.sellToyotas()
    }
}