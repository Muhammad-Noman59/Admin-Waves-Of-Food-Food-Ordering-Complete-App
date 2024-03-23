package com.example.adminwavesoffood

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminwavesoffood.adapters.OrderDetailsAdapter
import com.example.adminwavesoffood.databinding.ActivityOrderDetailsBinding
import com.example.adminwavesoffood.model.OrderDetails

class OrderDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOrderDetailsBinding

    private var userName: String? = null
    private var address: String? = null
    private var phoneNumber: String? = null
    private var totalPrice: String? = null
    private var foodNames: ArrayList<String> = arrayListOf()
    private var foodImages: ArrayList<String> = arrayListOf()
    private var foodQuantity: ArrayList<Int> = arrayListOf()
    private var foodPrices: ArrayList<String> = arrayListOf()



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
        binding = ActivityOrderDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtn.setOnClickListener {
            finish()
        }

        getDataFromIntent()
    }

    private fun getDataFromIntent() {
        val receivedOrderDetails = intent.getSerializableExtra("UserOrderDetails") as OrderDetails

        receivedOrderDetails?.let { orderDetails ->

                userName = receivedOrderDetails.userName
                foodNames = receivedOrderDetails.foodItemName as ArrayList<String>
                foodImages = receivedOrderDetails.foodItemImage as ArrayList<String>
                foodQuantity = receivedOrderDetails.foodItemQuantities as ArrayList<Int>
                address = receivedOrderDetails.address
                phoneNumber = receivedOrderDetails.phoneNumber
                foodPrices = receivedOrderDetails.foodItemPrice as ArrayList<String>
                totalPrice = receivedOrderDetails.totalPrice

                setUserDetails()

                setAdapter()

        }


    }


    private fun setUserDetails() {

        binding.name.text = userName
        binding.address.text = address
        binding.number.text = phoneNumber
        binding.totalPay.text = totalPrice
    }

    private fun setAdapter() {

        binding.rv.layoutManager = LinearLayoutManager(this)
        val adapter = OrderDetailsAdapter(this,foodNames,foodImages,foodQuantity,foodPrices)
        binding.rv.adapter = adapter
    }

}