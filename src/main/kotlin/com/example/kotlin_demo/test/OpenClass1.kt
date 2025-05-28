package com.example.kotlin_demo.test

open class OpenClass1(val x: Int, val y: Int) {
    val MAX_INT = 270
    open fun printProduct(){
        println(x*y)
    }
}

class NormalClass1 private constructor(x: Int, y: Int, val z: Int=0): OpenClass1(x, y){
    fun printSum(){
        println(x+y+z)
    }

    override fun printProduct(){
        println(0)
    }

    companion object{
        fun getNormalClass(): NormalClass1{
            return NormalClass1(1,2,3)
        }
    }
}