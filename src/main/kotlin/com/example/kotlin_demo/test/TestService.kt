package com.example.kotlin_demo.test

import org.springframework.stereotype.Service

@Service
class TestService {

    fun companionObjects1(){
        var classWithCompanion: ClassWithCompanion = ClassWithCompanion();
        classWithCompanion.printX()

        //this throws error
//        classWithCompanion.printY()

        ClassWithCompanion.printY()
        println("From the service y is "+ClassWithCompanion.y)
    }

    fun companionObjects2(): User{
        fun User.Companion.sayHi(){
            println("\n\nHi from ${User.MAX_USERS}\n\n")
        }
        var user: User = User.newUser("Ted")

        User.sayHi()
        return user
    }

    fun openClass1(){
        val c: NormalClass1 = NormalClass1.getNormalClass()
        c.printSum()
        c.printProduct()
        println("Max int is ${c.MAX_INT}")
    }
}