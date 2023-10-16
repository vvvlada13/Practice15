package com.example.practice15

import android.annotation.SuppressLint
import android.os.Build
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.TextView
    import androidx.annotation.RequiresApi

    class Main_Activity:AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        @RequiresApi(Build.VERSION_CODES.TIRAMISU)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.main_activity)

            val arguments:Bundle? = intent.extras
            val text3:TextView = findViewById(R.id.textView)



            if(arguments != null){
                var user:User= User()
                user= arguments.getParcelable<User>(user.javaClass.simpleName) as User
                text3.text= "Name1 ${user.getName1()}\nName2 ${user.getName2()}"
            }
        }
    }