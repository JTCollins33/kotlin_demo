package com.example.kotlin_demo.vehicle

open class Car(override var id: Int, override var type: String, var make: String?): Vehicle{

    open override fun startEngine() {
        println("Car $id ${make?: "Unknown"} starts ....")
    }

    open override fun stopEngine() {
        println("Car $id ${make?: "Unknown"} stops ...")
    }

    companion object{
        fun buyCar(): Car{
            return Car(5, "truck", "Chevy")
        }
    }
}