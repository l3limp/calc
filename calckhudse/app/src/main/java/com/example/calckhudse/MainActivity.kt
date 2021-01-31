package com.example.calckhudse

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number : EditText = findViewById(R.id.Number)
        var addnBtn : Button = findViewById(R.id.addBtn)
        var subBtn : Button = findViewById(R.id.subtractBtn)
        var mulBtn : Button = findViewById(R.id.multiplyBtn)
        var divBtn : Button = findViewById(R.id.divideBtn)
        var result : TextView = findViewById(R.id.Result)
        var resBtn : Button = findViewById(R.id.resultBtn)
        var number1 : EditText = number



        addnBtn.setOnClickListener {
            number.setText("")
            number.hint = "number 2"

        }

        resBtn.setOnClickListener {
            var res : Int = Integer.parseInt(number1.text.toString()) + Integer.parseInt(number.text.toString())
            result.text = res.toString()
        }



//        addnBtn.setOnClickListener {
//            number.hint="number 2"
//            val number3 : EditText = number
//
//            var res : Int = Integer.parseInt(number1.text.toString()) + Integer.parseInt(number3.text.toString())
//            result.text = res.toString()
//        }

//        subBtn.setOnClickListener {
//            var res : Int = Integer.parseInt(number.text.toString()) - Integer.parseInt(number2.text.toString())
//            result.text = res.toString()
//        }
//
//        mulBtn.setOnClickListener{
//            var res : Int = Integer.parseInt(number.text.toString()) * Integer.parseInt(number2.text.toString())
//            result.text = res.toString()
//
//        }
//
//        divBtn.setOnClickListener {
//            var res : Int = Integer.parseInt(number.text.toString()) / Integer.parseInt(number2.text.toString())
//            result.text = res.toString()
//        }


    }
}