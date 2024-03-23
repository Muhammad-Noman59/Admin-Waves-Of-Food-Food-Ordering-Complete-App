package com.example.adminwavesoffood.adapters

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adminwavesoffood.databinding.DeliveryItemBinding

class DeliveryAdapter (private var customerName : MutableList<String>,private var moneyStatus : MutableList<Boolean>) : RecyclerView.Adapter<DeliveryAdapter.ViewHolder>(){



//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DeliveryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(position)
    }

    override fun getItemCount(): Int = customerName.size

    inner class ViewHolder (private val binding: DeliveryItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                cName.text=customerName[position]
                if (moneyStatus[position] == true){
                    status.text="Received"
                }else{
                    status.text="Not Received"
                }


                val colorMap = mapOf(
                    true to Color.GREEN , false to Color.RED
                )
                status.setTextColor(colorMap[moneyStatus[position]]?: Color.BLACK)
                statusColor.backgroundTintList = ColorStateList.valueOf(colorMap[moneyStatus[position]]?: Color.BLACK)
            }
        }

    }
}