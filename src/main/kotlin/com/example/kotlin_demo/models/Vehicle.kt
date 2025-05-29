package com.example.kotlin_demo.models

interface Vehicle {
    var id: Int
    var numberOfWheels: Int
    var type: String
    var isOn: Boolean

    fun startEngine()
    fun stopEngine()
}