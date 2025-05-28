package com.example.kotlin_demo.vehicle

import org.springframework.stereotype.Service

@Service
class VehicleService {

    fun Car.computeMakeLength(): Int {
        return make?.length ?: 0
    }

    fun getVehicle(){
        var car1: Car = Car(1, "truck", "Ford")
        var car2: Car = Car(2, "sedan", null)
        var honda1: Honda = Honda(1, "sedan", "Honda", "Accord")
        var honda2: Honda = Honda(2, "sedan", "Honda", "Civic").apply {
            model="CRV"
            startEngine()
            stopEngine()
        }

        var dealerships: List<String> = honda1.run{
            startEngine()
            stopEngine()
            returnDealerships()
        }

        println("Length of car1 make = ${car1.computeMakeLength()}" +
                " and length of car2 make = ${car2.computeMakeLength()}")

        dealerships
            .filter { dealership -> dealership.startsWith("D") }
            .also { println("Filtered dealerships to ${it}") }
            .reversed()
            .also { println("Reversed dealerships to ${it}") }

        when {
            car1.id==3 -> println("Found a 3 car")
            car1.make=="Fssdfd" -> println("Found a fsfdsd")
            honda1.model=="Accord" -> println("found an accord")
        }

        with(car2){
            startEngine()
            stopEngine()
        }

        val hondaArea = Honda.getArea()
        var car3: Car = Car.buyCar()
        println("Just bought a new car: $car3")
    }


    fun sellCars(){
        var newCar: Car = Salesman.sellCar()
        var newHonda: Honda = Salesman.sellHonda()

        println("newHonda color initially is ${newHonda.color}")
        newHonda.color = null
        println("newHonda color then is ${newHonda.color}")
        newHonda.color = "red"
        println("newHonda color now is ${newHonda.color}")

        println("Car ${newCar.type} and ${newCar.make} length is ${newCar.typeMakeLength}")
        newCar.typeMakeLength = 20
        println("New type and make length is ${newCar.typeMakeLength}")


        //this won't run until newToyota is referenced
        val newToyota: Toyota by lazy {
            val toyota: Toyota = Toyota(33, "sedan", "Toyota", "Corolla")
            toyota.startEngine()
            toyota
        }
        val str1 = newToyota.model
    }

    fun sellToyotas(){
        var toyota: Toyota = Toyota(1,"sedan", "Toyota", "Corolla")

        toyota.numberSold++
        toyota.numberSold--
        toyota.numberSold=25
    }
}