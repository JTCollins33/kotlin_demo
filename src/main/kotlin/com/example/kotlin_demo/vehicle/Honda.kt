package com.example.kotlin_demo.vehicle

class Honda(id: Int, type: String, make: String?, var model: String?): Car(id, type, make) {
    companion object HondaConstants{
        val width: Int = 20
        val height: Int = 30
        fun getArea(): Int{
            return width* height
        }
    }

    var color: String? = null
        get(): String? {return "Color: $field"}
        set(value: String?){
            field = value as? String
        }

    override fun startEngine() {
        println("Honda $make $model starts engine ...")
    }

    override fun stopEngine() {
        println("Honda $make $model stops engine ...")
    }

    fun returnDealerships(): List<String>{
        return listOf("Germain", "Dublin", "Dayton")
    }
}