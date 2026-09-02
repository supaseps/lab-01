package com.example.petshopnew

class Happy(date: String): Mood(date) {
    override fun description(): String {
        return "Happy"
    }

}