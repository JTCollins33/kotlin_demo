package com.example.kotlin_demo.test

class ClassWithCompanion {
    var x: Int = 2
    companion object {
        var y: Int = 3
        fun printY(){
            println("Here is y: $y")
        }
    }

    fun printX(){
        println("Here is x: $x")
    }
}