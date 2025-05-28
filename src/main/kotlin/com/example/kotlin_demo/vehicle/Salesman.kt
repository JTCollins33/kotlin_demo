package com.example.kotlin_demo.vehicle

fun Car.printSaleOfCar(){
    println("Selling a ${this.type} and ${this.make}")
}

fun Honda.printSaleOfHonda(){
    println("Selling a ${this.make} ${this.model}")
}

var Car.typeMakeLength: Int
    get() = type?.length ?: 0 + make?.length!! ?: 0
    set(value){
        println(value)
    }

object Salesman {
    val name:String = "permanent man"
    fun sellCar(): Car {
        return Car(100, "sedan", "Chevy").apply {
            printSaleOfCar()
        }
    }

    fun sellHonda(): Honda{
        return Honda(100, "sedan", "Honda", "Civic").apply {
            printSaleOfHonda()
        }
    }

}