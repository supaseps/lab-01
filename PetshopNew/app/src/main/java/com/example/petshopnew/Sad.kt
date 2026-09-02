package com.example.petshopnew

class Sad(date: String): Mood(date) {
    override fun description(): String {
        return "Sad"
    }

}