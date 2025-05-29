package com.example.kotlin_demo.models

open class Truck(
    override var id: Int,
    override var numberOfWheels: Int,
    override var type: String,
    var make: String): Vehicle{



    override var isOn: Boolean = false
        set(value) {
            if(value){
                println("$make is on")
            } else {
                println("$make is off")
            }
        }


    override fun startEngine() {
        println("Truck $make is starting ...")
        isOn=true
    }

    override fun stopEngine() {
        println("Truck $make is stopping ...")
        isOn=false
    }
}