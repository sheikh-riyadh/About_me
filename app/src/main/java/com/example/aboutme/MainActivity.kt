package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnId.setOnClickListener {
            binding.nicknameTxtID.text = binding.editTxtNameId.text.toString()
            binding.btnId.visibility = View.GONE
            binding.editTxtNameId.visibility = View.GONE
        }

    }

}
