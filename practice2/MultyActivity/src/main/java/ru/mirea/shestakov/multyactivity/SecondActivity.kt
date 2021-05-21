package ru.mirea.shestakov.multyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var text: String = intent.getSerializableExtra("key") as String
        var textView: TextView = findViewById(R.id.textView)
        textView.text = text
    }
}