package com.example.kalkulator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulator2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)


        binding.btnTambah.setOnClickListener(){
            tambah()
        }
        binding.btnKurang.setOnClickListener(){
            kurang()
        }
        binding.btnKali.setOnClickListener(){
            kali()
        }
        binding.btnBagi.setOnClickListener(){
            bagi()
        }
        binding.btnClear.setOnClickListener(){
            clear()
        }
        setContentView(binding.root)
    }

    private fun clear(){
        binding.etInput1.text.clear()
        binding.etInput2.text.clear()
        binding.tvHasil.text = "hasil"
    }

    private fun tambah(){
        var input1 = binding.etInput1.text.toString().toInt()
        var input2 = binding.etInput2.text.toString().toInt()
        var hasil = input1 + input2
        var jumlah = "$input1 + $input2 = $hasil"
        binding.tvHasil.text = jumlah

    }
    private fun kurang(){
        var input1 = binding.etInput1.text.toString().toInt()
        var input2 = binding.etInput2.text.toString().toInt()
        var hasil = input1 - input2
        var jumlah = "$input1 - $input2 = $hasil"
        binding.tvHasil.text = jumlah

    }
    private fun kali(){
        var input1 = binding.etInput1.text.toString().toInt()
        var input2 = binding.etInput2.text.toString().toInt()
        var hasil = input1 * input2
        var jumlah = "$input1 * $input2 = $hasil"
        binding.tvHasil.text = jumlah

    }
    private fun bagi(){
        var input1 = binding.etInput1.text.toString().toInt()
        var input2 = binding.etInput2.text.toString().toInt()
        var hasil = input1 / input2
        var jumlah = "$input1 / $input2 = $hasil"
        binding.tvHasil.text = jumlah

    }

}