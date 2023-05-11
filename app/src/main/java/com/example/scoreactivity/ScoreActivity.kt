package com.example.scoreactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.util.Log

class ScoreActivity : AppCompatActivity() {

    private var score = 0
    private var tv_score: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score_activity)

        初值設定()
    }
    fun  初值設定(){
        score = 0
        tv_score = findViewById(R.id.tv_score)
    }
    fun 顯示得分(){
        var s = "" +score
        log.d("@@@"+ s)
        tv_score?.setText(s)
    }
}