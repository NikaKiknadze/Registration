package com.example.registrationpage

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var registration: AppCompatButton
    private lateinit var admit: CheckBox



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        surname = findViewById(R.id.surname)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        var registration:AppCompatButton = findViewById(R.id.registration)
        var admit:CheckBox = findViewById(R.id.admit)
        admit.setOnClickListener{

        }
        registration.setOnClickListener{

            if(admit.isChecked){
                checking()
            }else{
                Toast.makeText(applicationContext, "Checkbox not checked", Toast.LENGTH_SHORT).show()
            }
        }
    }


    fun checking(){
        if(name.length()<3){
            Toast.makeText(applicationContext, "Incorrect name", Toast.LENGTH_SHORT).show()
        }
        if(surname.length() < 5){
            Toast.makeText(applicationContext, "Incorrect surname", Toast.LENGTH_SHORT).show()
        }
        if(password.length()<8){
            Toast.makeText(applicationContext, "Incorrect password", Toast.LENGTH_SHORT).show()
        }
        if (password.length() >= 8 && surname.length() >= 5 && name.length() >= 3){
            Toast.makeText(applicationContext, "მიმდინარეობს გადახდა", Toast.LENGTH_SHORT).show()
        }
        checkEmail()
    }
    fun checkEmail(){
        var index1 = 0
        var index2 = 0
        for(i in email.text.toString()){
            if(i == '@'){
                break
            }
            index1++
        }
        for(i in email.text.toString()){
            if(i == '.'){
                break
            }
            index2++
        }
        if(index1 == email.length()){
            index1 = 0
        }
        if(index2 == email.length()){
            index2 = 0

        }
        if(index1 < index2 && index1 != 0 && index2 != 0){
            Toast.makeText(applicationContext,"correct E-Mail",Toast.LENGTH_SHORT)
        }else if(index1 > index2 && index1 != 0 && index2 != 0){
            Toast.makeText(applicationContext,"Incorrect E-Mail",Toast.LENGTH_SHORT).show()
        }else if(index1 == 0 || index2 == 0){
            Toast.makeText(applicationContext,"Incorrect E-Mail",Toast.LENGTH_SHORT).show()
        }
    }
}




