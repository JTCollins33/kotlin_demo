package com.example.kotlin_demo.models

open class Car(override var id: Int,
               override var numberOfWheels: Int,
               override var type: String,
               var make: String): Vehicle {
    override var isOn: Boolean = false

    override fun startEngine() {
        println("Car $make is starting ...")
        isOn=true
    }

    override fun stopEngine() {
        println("Car $make is stopping ...")
    }
}