package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.calculate)

        btn.setOnClickListener(){

           // val carLoan:Double = price-downP
            //val interest =  carLoan* interestR/100 *loan
            //val monthly = (carLoan+interest)/loan/12
            val car_price:Double = price.text.toString().toDouble()
            val down_Pay:Double = downP.text.toString().toDouble()
            val inter_est:Double = interestR.text.toString().toDouble()
            val loan_P:Double = loan.text.toString().toDouble()

            val carLoan:Double = car_price-down_Pay
            val interest:Double =  carLoan* inter_est/100 *loan_P
            val monthly:Double = (carLoan+interest)/loan_P/12

            carloadD.text = "RM %.2f".format(carLoan)
            inter.text = "RM %.2f".format(interest)
            monthP.text = "RM %.2f".format(monthly)
        }

    }

}
