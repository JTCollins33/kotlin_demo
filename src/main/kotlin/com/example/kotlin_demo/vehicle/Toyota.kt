package com.example.kotlin_demo.vehicle

import kotlin.properties.Delegates

class Toyota(id: Int, type: String, make: String, var model: String): Car(id, type, make) {


    var numberSold: Int by Delegates.observable(0){_, oldValue, newValue ->
        if(newValue>oldValue){
            println("Just sold another $make $model. Up from $oldValue to $newValue")
        } else if(newValue < oldValue){
            println("Just gained a $make $model")
        } else {
            println("no idea what happened with $make $model")
        }
    }
}