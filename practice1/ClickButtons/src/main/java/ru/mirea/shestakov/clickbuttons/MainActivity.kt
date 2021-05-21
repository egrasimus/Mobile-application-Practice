package ru.mirea.shestakov.clickbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvOut = findViewById<TextView>(R.id.tvOut)
        var bottonOk = findViewById<Button>(R.id.btnOk)
        var bottonCancel = findViewById<Button>(R.id.btnCancel)
        bottonOk.setOnClickListener {
            tvOut.text = "Нажата кнопка ОК"
        }
    }

    fun myClick(view: View) = Toast.makeText(this,"Ещё один способ!", Toast.LENGTH_SHORT).show()

}