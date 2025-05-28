package com.example.kotlin_demo.vehicle

interface Vehicle {
    var id: Int
    var type: String

    fun startEngine()
    fun stopEngine()
}