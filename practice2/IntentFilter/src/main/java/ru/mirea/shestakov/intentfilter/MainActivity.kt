package ru.mirea.shestakov.intentfilter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickToWeb(view: View) {
        val address: Uri = Uri.parse("https://www.mirea.ru")
        val openLinkIntent: Intent = Intent(Intent.ACTION_VIEW, address)

        if (openLinkIntent.resolveActivity(getPackageManager()) != null){
            startActivity(openLinkIntent)
        } else{
            Log.d("Intent","Не получается обработать намерение!")
        }
    }

    fun onClickToSend(view: View) {
        val shareIntent: Intent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA")
        shareIntent.putExtra(Intent.EXTRA_TEXT,"Здравствуйте, Мартиросян Морис Сейранович!")
        startActivity(Intent.createChooser(shareIntent,"Шестаков Егор Владимирович"))
    }
}