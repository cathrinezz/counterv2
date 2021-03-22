package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{
    var counter:Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        img.setOnClickListener(this)
        btn4.setOnClickListener(this)
    }
    fun ADD(v: View){
        if(v == btn1){
            counter++
        }
        else if(v == btn2){
            counter +=2
        }
        else if(v == btn3)
        {
            counter = 0

        }
        txv.text = counter.toString()
    }
    override fun onClick(v: View?) {
        if (v == txv){
            counter++
        }
        else if(v == img){
            counter+=2
        }
        else {
            counter = (0..100).random()
            txv.text =counter.toString()
        }
        txv.text =counter.toString()
    }
}



