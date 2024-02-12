package com.javierprado.prototipos

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MensajeDocente : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje_docente)


        val mToolbar : Toolbar = findViewById(R.id.ToolbarP)
        setSupportActionBar(mToolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.baseline_arrow_back_24)

        supportActionBar?.title = Html.fromHtml("<font color=\"#FFFFFF\">" + "Comuniquese con el Docente" + "</font>")
    }
}