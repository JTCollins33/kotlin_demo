package com.example.kotlin_demo.models

class Chevy(id: Int, numberOfWheels: Int, type: String,
    make: String, var model: String): Truck(id, numberOfWheels, type, make) {

    override var isOn: Boolean = false
        set(value){
            if(value){
                println("Turning $make $model on")
                field = value
            } else {
                println("turning $make $model off")
                field = value
            }
        }

    override fun startEngine() {
        println("$make $model is starting ...")
        isOn = true
    }

    override fun stopEngine() {
        println("$make $model is stopping")
        isOn = false
    }

    fun dragStuff(){
        println("$make $model is dragging stuff")
    }
}