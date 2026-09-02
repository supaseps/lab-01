package com.example.petshopnew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshopnew.ui.theme.PetshopNewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val cat = Cat(name = "Seps", age = 23)
        val dog = Dog("Mochi", 6)
        // you can also do: val pets = mutableListOf<Pet>() pets.add(cat)//
        val pets = mutableListOf<Pet>(cat, dog)
        val scorpion = Scorpion("Stinger", 32)
        pets.add(scorpion)
        val pettablePets= mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)


    }
}
