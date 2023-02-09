package com.example.migratexmltocompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.migratexmltocompose.databinding.ActivityXmlBinding

class XmlActivity : AppCompatActivity() {

    private lateinit var binding: ActivityXmlBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityXmlBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        supportFragmentManager.commit {
//            setReorderingAllowed(true)
//            add(R.id.id_container,FragmentXml())
//
//        }


        var i: Int = 0

        binding.apply {


            button.setOnClickListener {


                i++

                textView.text = i.toString()


            }

        }


    }


}