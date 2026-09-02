package com.example.petshopnew

interface Pettable {
    fun pet()
}
// you cannot pass it to pet because scorpion is not pettable
//only dog and cat can implement pettable