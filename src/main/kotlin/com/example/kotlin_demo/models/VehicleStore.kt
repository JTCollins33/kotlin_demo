package com.example.kotlin_demo.models

import kotlin.properties.Delegates

open class VehicleStore {
    companion object{
        var vehiclesForSale by Delegates.observable(
            mutableListOf(
            Truck(1, 4, "truck", "Toyota"),
            Chevy(5, 4, "truck", "Chevy", "Tahoe"),
            Car(2, 4, "sedan", "Toyota"),
            Honda(3, 4, "sedan", "Honda", "Civic"),
            Honda(4, 4, "sedan", "Honda", "Accord")
        )
        ){ _, oldList, newList ->
            if(newList.size<=0){
                println("The store has run out of cars and needs to purchase more")
            } else{
                println("Still have cars left to sell")
            }
        }
        var profit: Int by Delegates.observable(0){_, oldValue, newValue->
            if(newValue > oldValue){
                println("Profit increased from $oldValue to $newValue")
            } else if (oldValue > newValue){
                println("Profit decreased from $oldValue to $newValue")
            }
        }
    }

    open fun getVehiclesForSale(): List<Vehicle>{
        return vehiclesForSale
    }

    open fun getVehicleForSale(vehicle: Vehicle): Vehicle?{
        return vehiclesForSale.singleOrNull{it.id == vehicle.id}
    }

    fun processSale(vehicle: Vehicle, offeredPrice: Int){
        var vehicleToSell = getVehicleForSale(vehicle).let {
            vehiclesForSale.remove(it)
        }

        profit+=offeredPrice
    }
}