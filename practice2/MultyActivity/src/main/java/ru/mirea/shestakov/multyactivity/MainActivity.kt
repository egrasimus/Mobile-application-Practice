package ru.mirea.shestakov.multyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickNewActivity(view: View) {
        val intent: Intent =  Intent(this, SecondActivity::class.java)
        intent.putExtra("key","MIREA - Шестаков Егор Владимирович")
        startActivity(intent)
    }
}