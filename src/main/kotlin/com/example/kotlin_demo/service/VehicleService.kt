package com.example.kotlin_demo.service

import com.example.kotlin_demo.models.*
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class VehicleService {

    val salemanConsider: Boolean by lazy {
        println("Salesman is considering your offer")
        Thread.sleep(1000)
        println("Salesman has finished considering your offer")
        false
    }

    fun startBuyingVehicles(){
        var vehiclesForSale = Salesman.run {
            greetCustomer("Bob")
            shareVehiclesForSale()
        }

        while (Salesman.shareVehiclesForSale().size>0){
            val randomIndex = Random.nextInt(0, vehiclesForSale.size)
            val vehicleToPurchase = vehiclesForSale.get(randomIndex)

            var offerPrice = 90

            do{
                println("\n\nBuyer is offering $offerPrice dollars")
                salemanConsider
                offerPrice+=10
            } while (Salesman.dealWithOffer(vehicleToPurchase, offerPrice) != true)

            when{
                vehicleToPurchase is Chevy -> with(vehicleToPurchase as Chevy){
                    startEngine()
                    dragStuff()
                    stopEngine()
                }
                vehicleToPurchase is Honda -> with(vehicleToPurchase as Honda){
                    startEngine()
                    makeHondaBeep()
                    stopEngine()
                }
                vehicleToPurchase is Car -> with(vehicleToPurchase as Car){
                    startEngine()
                    stopEngine()
                }
                vehicleToPurchase is Truck -> with(vehicleToPurchase as Truck){
                    startEngine()
                    stopEngine()
                }
                else -> with(vehicleToPurchase){
                    startEngine()
                    stopEngine()
                }
            }
            println("Remaining vehicles for sale: ${Salesman.shareVehiclesForSale()}\n\n")
        }
    }
}