package com.asifaliparvez.firebasetodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.database.database

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database
        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("heelo").addOnCompleteListener {
            if(it.isSuccessful){


            }else{
                Log.d("Firebase", it.exception.toString())
            }
        }

        myRef.setValue("Hello, World!")
    }
}