package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num0 = "0"
        val num1 = "1"
        val num2 = "2"
        val num3 = "3"
        val num4 = "4"
        val num5 = "5"
        val num6 = "6"
        val num7 = "7"
        val num8 = "8"
        val num9 = "9"
        val pls = "+"
        val mns = "-"
        val tms = "*"
        val dvd = "/"
        val eql = "="
        var FirstButtonPress = false
        var PressSign = false
        var numText = "0"

        sgnPls.setOnClickListener({
            if(FirstButtonPress == false)
            {Toast.makeText(this, "You must first enter a number", Toast.LENGTH_LONG).show()}
            else if (PressSign == true)
            {Toast.makeText(this, "You can't place a sign after a sign", Toast.LENGTH_LONG).show()}
            else {NumbersText.text = "$numText$pls"
                numText = numText + pls
                PressSign = true}
        })

        sgnMns.setOnClickListener({
            if(FirstButtonPress == false)
            {Toast.makeText(this, "You must first enter a number", Toast.LENGTH_LONG).show()}
            else if (PressSign == true)
            {Toast.makeText(this, "You can't place a sign after a sign", Toast.LENGTH_LONG).show()}
            else {NumbersText.text = "$numText$mns"
                numText = numText + mns
                PressSign = true}
        })

        sgnTms.setOnClickListener({
            if(FirstButtonPress == false)
            {Toast.makeText(this, "You must first enter a number", Toast.LENGTH_LONG).show()}
            else if (PressSign == true)
            {Toast.makeText(this, "You can't place a sign after a sign", Toast.LENGTH_LONG).show()}
            else {NumbersText.text = "$numText$tms"
                PressSign = true}
        })

        sgnDvd.setOnClickListener({
            if(FirstButtonPress == false)
            {Toast.makeText(this, "You must first enter a number", Toast.LENGTH_LONG).show()}
            else if (PressSign == true)
            {Toast.makeText(this, "You can't place a sign after a sign", Toast.LENGTH_LONG).show()}
            else {NumbersText.text = "$numText$dvd"
                PressSign = true}
        })

        sgnEql.setOnClickListener({
            if(FirstButtonPress == false)
            {Toast.makeText(this, "You must first enter a number", Toast.LENGTH_LONG).show()}
            else {NumbersText.text = "$numText$eql"
                numText = numText + eql}
        })

        buttonNum0.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num0
                numText = num0
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num0"
                numText = numText + num0
                PressSign = false}
        })

        buttonNum1.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num1
                numText = num1
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num1"
                numText = numText + num1
                PressSign = false}
        })

        buttonNum2.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num2
                numText = num2
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num2"
                numText = numText + num2
                PressSign = false}
        })

        buttonNum3.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num3
                numText = num3
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num3"
                numText = numText + num3
                PressSign = false}
        })

        buttonNum4.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num4
                numText = num4
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num4"
                numText = numText + num4
                PressSign = false}
        })

        buttonNum5.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num5
                numText = num5
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num5"
                numText = numText + num5
                PressSign = false}
        })

        buttonNum6.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num6
                numText = num6
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num6"
                numText = numText + num6
                PressSign = false}
        })

        buttonNum7.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num7
                numText = num7
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num7"
                numText = numText + num7
                PressSign = false}
        })

        buttonNum8.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num8
                numText = num8
                FirstButtonPress = true}
            else {NumbersText.text = "$numText$num8"
                numText = numText + num8
                PressSign = false}
        })

        buttonNum9.setOnClickListener({
            if(FirstButtonPress == false)
            {NumbersText.text = num9
             numText = num9
            FirstButtonPress = true}
            else {NumbersText.text = "$numText$num9"
                numText = numText + num9
                PressSign = false}
        })

}
}