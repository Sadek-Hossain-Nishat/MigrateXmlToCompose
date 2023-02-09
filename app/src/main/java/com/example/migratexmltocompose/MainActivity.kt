package com.example.migratexmltocompose

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XmlView()
        }
    }
}

@Composable
fun XmlView() {

    AndroidView(
        factory = {
            View.inflate(it, R.layout.activity_xml, null)
        },
        modifier = Modifier.fillMaxSize()
    ) {

        val textView = it.findViewById<TextView>(R.id.textView)
        val button = it.findViewById<Button>(R.id.button)

        var i = 0

        button.setOnClickListener {
            i++
            textView.text = i.toString()
        }


    }


}

