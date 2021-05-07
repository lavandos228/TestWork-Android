package me.lavandos.traning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //метод для кнопок
        onClick()

    }

    private fun onClick() {
        //это команда для вызова действия с кнопкой
        button1.setOnClickListener { newPage() }
    }

    private fun newPage() {
        //это команда показывает куда нас перенаправит при нажатии
        val intent = Intent(this,listAuto_activity::class.java)
        startActivity(intent)
    }
}
