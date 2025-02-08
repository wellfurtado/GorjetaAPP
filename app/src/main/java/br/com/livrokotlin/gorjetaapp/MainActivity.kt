package br.com.livrokotlin.gorjetaapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button
import br.com.livrokotlin.gorjetaapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        var percentage: Int = 0

        binding.rbOptionOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 10
            }
        }


        binding.rbOptionTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 15
            }
        }


        binding.rbOptionThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 20
            }
        }


        binding.done.setOnClickListener{
            val totalTableTemp = binding.tieTotal.text
            val numPeapleTemp = binding.tieNumPeaple.text

            if (totalTableTemp.isNullOrEmpty() || numPeapleTemp.isNullOrEmpty()){
                Snackbar.make(binding.tieTotal, "Preencha os campos", Snackbar.LENGTH_LONG).show()
            } else {
                val totalTable: Float = totalTableTemp.toString().toFloat()
                val numPeaple: Int = numPeapleTemp.toString().toInt()

                val total = totalTable / numPeaple
                val tips = total * percentage / 100
                val totalTips = total + tips

                binding.tvResult.text = "Total: R$ ${"%.2f".format(totalTips)}"
            }
        }

        binding.btnClean.setOnClickListener {
            binding.tieTotal.text?.clear()
            binding.tieNumPeaple.text?.clear()
            binding.tvResult.text = ""
            binding.rbOptionOne.isChecked = false
            binding.rbOptionTwo.isChecked = false
            binding.rbOptionThree.isChecked = false
        }
    }
}


