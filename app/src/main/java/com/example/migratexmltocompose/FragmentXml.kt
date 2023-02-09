package com.example.migratexmltocompose


import android.os.Bundle
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.painterResource
import androidx.fragment.app.Fragment
import com.example.migratexmltocompose.databinding.FragmentXmlBinding
import com.example.migratexmltocompose.ui.theme.MigrateXMLToComposeTheme


class FragmentXml : Fragment(R.layout.fragment_xml) {

    private var _binding: FragmentXmlBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentXmlBinding.bind(view)


        binding.idComposeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                MigrateXMLToComposeTheme {

                    Column {

                        Image(
                            painter = painterResource(id = R.drawable.compose),
                            contentDescription = "compse"
                        )

                        Text(text = "Hello world compose with xml")

                    }


                }


            }
        }
        var i: Int = 0

        binding.apply {


            button.setOnClickListener {


                i++

                textView.text = i.toString()


            }

        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}