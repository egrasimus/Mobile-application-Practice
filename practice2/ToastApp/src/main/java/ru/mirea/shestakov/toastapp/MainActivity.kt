package ru.mirea.shestakov.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast: Toast = Toast.makeText(applicationContext,"Здравствуй MIREA! ФИО", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 500)
        val toastContainer = toast.getView() as LinearLayout?
        val catImageView = ImageView(applicationContext)
        catImageView.setImageResource(R.drawable.cat)
        toastContainer?.addView(catImageView, 0)
        toast.show()
    }
}