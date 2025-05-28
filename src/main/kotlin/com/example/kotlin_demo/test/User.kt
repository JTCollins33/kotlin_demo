package com.example.kotlin_demo.test

data class User private constructor(val name: String) {

    companion object{
        val MAX_USERS = 100
        fun newUser(name: String): User{
            return User(name)
        }
    }
}