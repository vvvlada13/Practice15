package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btn(view: View) {
        val text1: EditText = findViewById(R.id.editTextText)
        val text2: EditText = findViewById(R.id.editTextText2)

        val name1 = text1.text.toString()
        val name2 = text2.text.toString()
        val user: User = User(name1, name2)

        val intent: Intent = Intent(this@MainActivity, Main_Activity::class.java)
        intent.putExtra(user.javaClass.simpleName, user)
        startActivity(intent)
    }
}