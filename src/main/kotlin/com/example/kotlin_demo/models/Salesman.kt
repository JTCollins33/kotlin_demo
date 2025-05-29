package com.example.kotlin_demo.models

object Salesman {
    val firstName = "Bobby"
    val lastName = "Sleezy"
    val age = 50
    val startedSellingAge = 21

    var store: VehicleStore = VehicleStore()

    val minAcceptedPricesMap = mapOf(
        "truck" to 150,
        "sedan" to 125
    )

    fun shareVehiclesForSale(): List<Vehicle>{
        return VehicleStore.vehiclesForSale
    }

    fun acceptOfferedPrice(minAcceptedPrice: Int, price: Int): Boolean{
        when{
            minAcceptedPrice==-1 -> return false
            price >= minAcceptedPrice -> return true
            price < minAcceptedPrice -> return false
        }
        return true
    }

    fun dealWithOffer(requestedVehicle: Vehicle, price: Int): Boolean?{
        val acceptOffer: Boolean? = minAcceptedPricesMap.get(requestedVehicle.type)?.let{
            acceptOfferedPrice(it, price)
        }

        if(acceptOffer == true){
            store.processSale(requestedVehicle, price)
            confirmOffer(requestedVehicle, price)
        }

        return acceptOffer
    }

    fun greetCustomer(name: String){
        println("Hello $name")
    }

    fun confirmOffer(vehicle: Vehicle, price: Int){
        println("Thank you for purchasing ${vehicle.id} for $price")
    }

    fun sayGoodbye(){
        println("Goodbye")
    }


}