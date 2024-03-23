package com.example.adminwavesoffood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminwavesoffood.databinding.ActivityCreateUserBinding

class CreateUserActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCreateUserBinding



//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            finish()
        }
    }
}